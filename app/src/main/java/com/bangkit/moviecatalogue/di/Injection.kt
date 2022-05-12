package com.bangkit.moviecatalogue.di

import android.content.Context
import com.bangkit.moviecatalogue.data.source.FilmRepository
import com.bangkit.moviecatalogue.data.source.local.LocalDataSource
import com.bangkit.moviecatalogue.data.source.local.room.FilmDatabase
import com.bangkit.moviecatalogue.data.source.remote.RemoteDataSource
import com.bangkit.moviecatalogue.utils.AppExecutors
import com.bangkit.moviecatalogue.utils.JSONHelper

object Injection {

    fun provideRepository(context: Context) : FilmRepository {

        val database = FilmDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JSONHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.FilmDao())
        val appExecutors = AppExecutors()

        return FilmRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}