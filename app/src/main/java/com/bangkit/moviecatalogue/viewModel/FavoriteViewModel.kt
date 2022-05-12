package com.bangkit.moviecatalogue.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity

class FavoriteViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getFavorite() : LiveData<PagedList<FilmEntity>> = filmRepository.getFavorite()

    fun setFavorite(filmEntity: FilmEntity) {
        val newState = !filmEntity.favorite
        filmRepository.setFavorite(filmEntity, newState)
    }

}