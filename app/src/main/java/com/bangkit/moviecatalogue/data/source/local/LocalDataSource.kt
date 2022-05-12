package com.bangkit.moviecatalogue.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.local.room.FilmDao

class LocalDataSource private constructor(
    private val mFilmDao: FilmDao
    ) {

    companion object {

        private var INSTANCE : LocalDataSource? = null

        fun getInstance(filmDao: FilmDao) : LocalDataSource =
            INSTANCE ?: LocalDataSource(filmDao)
    }

    private val movies : String = "movies"
    private val tvshows : String = "tvshows"

    fun getMovies() : DataSource.Factory<Int, FilmEntity> = mFilmDao.getMovie(movies)

    fun getTVShows() : DataSource.Factory<Int, FilmEntity> = mFilmDao.getTVShows(tvshows)

    fun getDetailMovie(title : String) : LiveData<FilmEntity> = mFilmDao.getDetailFilm(title)

    fun getDetailTVShows(title : String) : LiveData<FilmEntity> = mFilmDao.getDetailFilm(title)
    
    fun getFavorite() : DataSource.Factory<Int, FilmEntity> = mFilmDao.getFavorite()

    fun insertMovies(movie : List<FilmEntity>) = mFilmDao.insertFilm(movie)

    fun insertTVShows(tvshows : List<FilmEntity>) = mFilmDao.insertFilm(tvshows)

    fun setMovieFavorite(movie : FilmEntity, newState : Boolean) {
        movie.favorite = newState
        mFilmDao.updateFilm(movie)
    }

    fun setTVShowsFavorite(tvshows : FilmEntity, newState : Boolean) {
        tvshows.favorite = newState
        mFilmDao.updateFilm(tvshows)
    }

}