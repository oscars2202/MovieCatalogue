package com.bangkit.moviecatalogue.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FilmEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "type")
    var type: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "image")
    var image: Int,

    @ColumnInfo(name = "release")
    var release: String,

    @ColumnInfo(name = "description")
    var description: String,

    @ColumnInfo(name = "rate")
    var rate: String,

    @ColumnInfo(name = "trailer")
    var trailer: String,

    @ColumnInfo(name = "favorite")
    var favorite : Boolean = false
)
