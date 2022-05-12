package com.bangkit.moviecatalogue.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.bangkit.moviecatalogue.data.source.local.LocalDataSource
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.remote.RemoteDataSource
import com.bangkit.moviecatalogue.utils.AppExecutors
import com.bangkit.moviecatalogue.utils.DataDummy
import com.bangkit.moviecatalogue.utils.LiveDataTestUtil
import com.bangkit.moviecatalogue.utils.PagedListUtil
import com.bangkit.moviecatalogue.vo.Resource
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import com.nhaarman.mockitokotlin2.verify
import org.junit.Rule
import org.mockito.Mockito.*

@Suppress("UNCHECKED_CAST")
class FilmRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val localDataSource = mock(LocalDataSource::class.java)
    private val appExecutors = mock(AppExecutors::class.java)

    private val filmRepository = FakeFilmRepository(remote, localDataSource, appExecutors)
    private val movieResponse = DataDummy.generateRemoteDummyMovies()
    private val movieTitle = movieResponse[0].title
    private val tvShowsResponse = DataDummy.generateRemoteDummyShows()
    private val tvShowsTitle = tvShowsResponse[0].title

    @Test
    fun getAllMovies() {

        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, FilmEntity>
        `when`(localDataSource.getMovies()).thenReturn(dataSourceFactory)
        filmRepository.getAllMovies()

        val filmEntity = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovie()))
        verify(localDataSource).getMovies()

        assertNotNull(filmEntity.data)
        assertEquals(movieResponse.size.toLong(), filmEntity.data?.size?.toLong())

    }

    @Test
    fun getAllTVShows() {

        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, FilmEntity>
        `when`(localDataSource.getTVShows()).thenReturn(dataSourceFactory)
        filmRepository.getAllTVShows()

        val filmEntity = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyShows()))
        verify(localDataSource).getTVShows()

        assertNotNull(filmEntity.data)
        assertEquals(tvShowsResponse.size.toLong(), filmEntity.data?.size?.toLong())

    }

    @Test
    fun getDetailMovie() {

        val dummyMovies = MutableLiveData<FilmEntity>()
        dummyMovies.value = DataDummy.generateDummyMovie()[0]

        `when`(localDataSource.getDetailMovie(movieTitle)).thenReturn(dummyMovies)

        val movie = LiveDataTestUtil.getValue(filmRepository.getDetailMovie(movieTitle))
        verify(localDataSource).getDetailMovie(movieTitle)

        assertNotNull(movie.data)
        assertNotNull(movie.data?.title)
        assertEquals(movieResponse[0].title, movie.data?.title)

    }

    @Test
    fun getDetailTVShows() {

        val dummyTVShows = MutableLiveData<FilmEntity>()
        dummyTVShows.value = DataDummy.generateDummyShows()[0]

        `when`(localDataSource.getDetailTVShows(tvShowsTitle)).thenReturn(dummyTVShows)

        val tvshow = LiveDataTestUtil.getValue(filmRepository.getDetailTVShows(tvShowsTitle))
        verify(localDataSource).getDetailTVShows(tvShowsTitle)

        assertNotNull(tvshow.data)
        assertNotNull(tvshow.data?.title)
        assertEquals(tvShowsResponse[0].title, tvshow.data?.title)

    }

    @Test
    fun getFavoriteMovie() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, FilmEntity>
        `when`(localDataSource.getFavorite()).thenReturn(dataSourceFactory)
        filmRepository.getFavorite()

        val filmEntity = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovie()))
        verify(localDataSource).getFavorite()

        assertNotNull(filmEntity)
        assertEquals(movieResponse.size.toLong(), filmEntity.data?.size?.toLong())
    }

    @Test
    fun getFavoriteTVShows() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, FilmEntity>
        `when`(localDataSource.getFavorite()).thenReturn(dataSourceFactory)
        filmRepository.getFavorite()

        val filmEntity = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyShows()))
        verify(localDataSource).getFavorite()

        assertNotNull(filmEntity)
        assertEquals(tvShowsResponse.size.toLong(), filmEntity.data?.size?.toLong())
    }
}