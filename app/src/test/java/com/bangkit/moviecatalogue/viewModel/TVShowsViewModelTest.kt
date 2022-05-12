package com.bangkit.moviecatalogue.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.vo.Resource
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TVShowsViewModelTest {

    private lateinit var viewModel: TVShowsViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<FilmEntity>>>

    @Mock
    private lateinit var pagedList: PagedList<FilmEntity>

    @Before
    fun setUp() {
        viewModel = TVShowsViewModel(filmRepository)
    }

    @Test
    fun getTVShows() {
        val dummyTVShows = Resource.success(pagedList)
        `when`(dummyTVShows.data?.size).thenReturn(20)
        val tvshow = MutableLiveData<Resource<PagedList<FilmEntity>>>()
        tvshow.value = dummyTVShows

        `when`(filmRepository.getAllTVShows()).thenReturn(tvshow)
        val shows = viewModel.getTVShows().value?.data
        verify(filmRepository).getAllTVShows()
        assertNotNull(shows)
        assertEquals(20, shows?.size)

        viewModel.getTVShows().observeForever(observer)
        verify(observer).onChanged(dummyTVShows)
    }
}