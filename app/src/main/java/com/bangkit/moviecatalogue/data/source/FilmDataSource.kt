package com.bangkit.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.vo.Resource

interface FilmDataSource {

    fun getAllMovies() : LiveData<Resource<PagedList<FilmEntity>>>

    fun getAllTVShows() : LiveData<Resource<PagedList<FilmEntity>>>

    fun getDetailMovie(title : String) : LiveData<Resource<FilmEntity>>

    fun getDetailTVShows(title : String) : LiveData<Resource<FilmEntity>>

    fun getFavorite() : LiveData<PagedList<FilmEntity>>

    fun setFavorite(film : FilmEntity, state : Boolean)
}