package com.bangkit.moviecatalogue.data.source.remote

import android.os.Looper
import com.bangkit.moviecatalogue.data.source.remote.response.MoviesResponse
import com.bangkit.moviecatalogue.data.source.remote.response.TVShowsResponse
import com.bangkit.moviecatalogue.utils.JSONHelper
import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bangkit.moviecatalogue.utils.EspressoIdlingResource

class RemoteDataSource private constructor(private val jsonHelper: JSONHelper) {

    private val handler = Handler(Looper.getMainLooper())

    companion object {

        private const val SERVICE_LATENCY_IN_MILLIS : Long = 1500

        private var instance : RemoteDataSource? = null

        fun getInstance(helper: JSONHelper) : RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply {
                    instance = this
                }
            }
    }

    fun getAllMovies() : LiveData<APIResponse<List<MoviesResponse>>> {
        EspressoIdlingResource.increment()
        val resultMovie = MutableLiveData<APIResponse<List<MoviesResponse>>>()
        handler.postDelayed({
            resultMovie.value = APIResponse.success(jsonHelper.loadMovies())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)

        return resultMovie
    }

    fun getAllTVShows() : LiveData<APIResponse<List<TVShowsResponse>>>{
        EspressoIdlingResource.increment()
        val resultTVShows = MutableLiveData<APIResponse<List<TVShowsResponse>>>()
        handler.postDelayed({
            resultTVShows.value = APIResponse.success(jsonHelper.loadTVShows())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)

        return resultTVShows
    }
}