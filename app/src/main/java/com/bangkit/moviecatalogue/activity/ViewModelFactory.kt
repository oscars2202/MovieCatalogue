package com.bangkit.moviecatalogue.activity

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bangkit.moviecatalogue.di.Injection
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.viewModel.DetailViewModel
import com.bangkit.moviecatalogue.viewModel.FavoriteViewModel
import com.bangkit.moviecatalogue.viewModel.MoviesViewModel
import com.bangkit.moviecatalogue.viewModel.TVShowsViewModel

class ViewModelFactory private constructor(private val  mFilmRepository: FilmRepository) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        private var instance : ViewModelFactory? = null

        fun getInstance(context: Context) : ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        when {
            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
                return MoviesViewModel(mFilmRepository) as T
            }

            modelClass.isAssignableFrom(TVShowsViewModel::class.java) -> {
                return TVShowsViewModel(mFilmRepository) as T
            }

            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                return DetailViewModel(mFilmRepository) as T
            }

            modelClass.isAssignableFrom(FavoriteViewModel::class.java) -> {
                return FavoriteViewModel(mFilmRepository) as T
            }

            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }


}