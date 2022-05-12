package com.bangkit.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TVShowsResponse(
    var id: Int,
    var type: String,
    var title: String,
    var image: Int,
    var release: String,
    var description: String,
    var rate: String,
    var trailer: String,
) : Parcelable
