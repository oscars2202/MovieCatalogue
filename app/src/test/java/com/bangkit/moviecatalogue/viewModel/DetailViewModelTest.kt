package com.bangkit.moviecatalogue.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.utils.DataDummy
import com.bangkit.moviecatalogue.vo.Resource
import com.bangkit.moviecatalogue.vo.Status
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
class DetailViewModelTest {

    private lateinit var viewModelMovie: DetailViewModel
    private lateinit var viewModelTVShows : DetailViewModel
    private val dummyMovies = DataDummy.generateDummyMovie()[0]
    private val dummyTVShows = DataDummy.generateDummyShows()[0]
    private val titleMovie = dummyMovies.title
    private val titleTVShow = dummyTVShows.title

    @get:Rule
    var instantTaskExecuteRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observerMovie: Observer<Resource<FilmEntity>>

    @Mock
    private lateinit var observerShow: Observer<Resource<FilmEntity>>

    @Before
    fun setUp() {
        viewModelMovie = DetailViewModel(filmRepository)
        viewModelTVShows = DetailViewModel(filmRepository)

        viewModelMovie.setSelectedFilm(titleMovie)
        viewModelTVShows.setSelectedFilm(titleTVShow)
    }

    @Test
    fun getDetailMovie() {

        val movie = MutableLiveData<Resource<FilmEntity>>()
        movie.value = Resource.success(dummyMovies)

        `when`(filmRepository.getDetailMovie(titleMovie)).thenReturn(movie)
        viewModelMovie.detailMovie.observeForever(observerMovie)
        verify(observerMovie).onChanged(movie.value)

        val movies = movie.value
        verify(filmRepository).getDetailMovie(titleMovie)

        assertNotNull(movies)
        assertEquals(Status.SUCCESS, movies?.status)
        assertEquals(dummyMovies, movies?.data)
        assertEquals(false, movies?.data?.favorite)
        assertEquals(null, movies?.message)

    }

    @Test
    fun getDetailTVShows() {

        val tvshow = MutableLiveData<Resource<FilmEntity>>()
        tvshow.value = Resource.success(dummyTVShows)

        `when`(filmRepository.getDetailTVShows(titleTVShow)).thenReturn(tvshow)
        viewModelTVShows.detailTVShow.observeForever(observerShow)
        verify(observerShow).onChanged(tvshow.value)

        val tvshows = tvshow.value
        verify(filmRepository).getDetailTVShows(titleTVShow)

        assertNotNull(tvshows)
        assertEquals(Status.SUCCESS, tvshows?.status)
        assertEquals(dummyTVShows, tvshows?.data)
        assertEquals(false, tvshows?.data?.favorite)
        assertEquals(null, tvshows?.message)

    }
}