package com.bangkit.moviecatalogue.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FavoriteViewModelTest {

    private lateinit var viewModel : FavoriteViewModel

    @get:Rule
    var instantTaskExecuteRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer : Observer<PagedList<FilmEntity>>

    @Mock
    private lateinit var pagedList: PagedList<FilmEntity>

    @Before
    fun setUp() {
        viewModel = FavoriteViewModel((filmRepository))
    }

    @Test
    fun getFavorite() {

        val dummyMovies = pagedList
        `when`(dummyMovies.size).thenReturn(19)
        val movie = MutableLiveData<PagedList<FilmEntity>>()
        movie.value = dummyMovies

        `when`(filmRepository.getFavorite()).thenReturn(movie)
        val favoriteMovie = viewModel.getFavorite().value
        verify(filmRepository).getFavorite()

        assertNotNull(favoriteMovie)
        assertEquals(19, dummyMovies.size)
        viewModel.getFavorite().observeForever(observer)
        verify(observer).onChanged(dummyMovies)

    }
}