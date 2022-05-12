package com.bangkit.moviecatalogue.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.vo.Resource

class DetailViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    val title = MutableLiveData<String>()

    fun setSelectedFilm(title : String) {
        this.title.value = title
    }

    val detailMovie : LiveData<Resource<FilmEntity>> = Transformations.switchMap(title) {
        filmRepository.getDetailMovie(it)
    }

    val detailTVShow : LiveData<Resource<FilmEntity>> = Transformations.switchMap(title) {
        filmRepository.getDetailTVShows(it)
    }

    fun setFavoriteMovie() {
        val resourceMovie = detailMovie.value

        if (resourceMovie != null) {
            val detailMovie = resourceMovie.data

            if (detailMovie != null) {
                val newState = !detailMovie.favorite

                filmRepository.setFavorite(detailMovie, newState)
            }
        }
    }

    fun setFavoriteTVShow() {
        val resourceTVShow = detailTVShow.value

        if (resourceTVShow != null) {
            val detailTVShow = resourceTVShow.data

            if (detailTVShow != null) {
                val newState = !detailTVShow.favorite

                filmRepository.setFavorite(detailTVShow, newState)
            }
        }
    }
}