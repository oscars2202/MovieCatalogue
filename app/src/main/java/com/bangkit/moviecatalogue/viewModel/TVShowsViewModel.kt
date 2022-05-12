package com.bangkit.moviecatalogue.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.vo.Resource

class TVShowsViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getTVShows() : LiveData<Resource<PagedList<FilmEntity>>> = filmRepository.getAllTVShows()
}