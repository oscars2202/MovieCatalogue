package com.bangkit.moviecatalogue.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity

@Dao
interface FilmDao {

    @Query("SELECT * FROM filmentity WHERE type = :movies")
    fun getMovie(movies: String) : DataSource.Factory<Int, FilmEntity>

    @Query("SELECT * FROM filmentity WHERE type = :tvshows")
    fun getTVShows(tvshows: String) : DataSource.Factory<Int, FilmEntity>

    @Query("SELECT * FROM filmentity WHERE favorite = 1")
    fun getFavorite() : DataSource.Factory<Int, FilmEntity>

    @Query("SELECT * FROM filmentity WHERE title = :title")
    fun getDetailFilm(title : String) : LiveData<FilmEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFilm(film : List<FilmEntity>)

    @Update
    fun updateFilm(film : FilmEntity)
}