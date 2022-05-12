package com.bangkit.moviecatalogue.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity


@Database(entities = [FilmEntity::class],
version = 1,
exportSchema = false)

abstract class FilmDatabase : RoomDatabase() {

    abstract fun FilmDao() : FilmDao

    companion object {

        private var INSTANCE : FilmDatabase? = null

        fun getInstance(context: Context) : FilmDatabase =
            INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    FilmDatabase::class.java,
                    "Film.db"
                ).build().apply {
                    INSTANCE = this
                }
            }
    }
}