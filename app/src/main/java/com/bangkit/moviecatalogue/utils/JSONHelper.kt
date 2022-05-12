package com.bangkit.moviecatalogue.utils

import android.content.Context
import android.content.res.Resources
import com.bangkit.moviecatalogue.data.source.remote.response.MoviesResponse
import com.bangkit.moviecatalogue.data.source.remote.response.TVShowsResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException


class JSONHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MoviesResponse> {

        val listMovies = ArrayList<MoviesResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("MoviesResponse.json").toString())
            val listArray = responseObject.getJSONArray("movies")

            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getInt("id")
                val type = movie.getString("type")
                val title = movie.getString("title")
                val image = movie.getString("image")
                val resources: Resources = context.resources
                val resourceId: Int = resources.getIdentifier(image, "drawable", context.packageName)
                val release = movie.getString("release")
                val rate = movie.getString("rate")
                val description = movie.getString("description")
                val trailer = movie.getString("trailer")

                val moviesResponse = MoviesResponse(id, type, title, resourceId, release,  description, rate, trailer)
                listMovies.add(moviesResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return listMovies
    }

    fun loadTVShows(): List<TVShowsResponse> {

        val listTVShows = ArrayList<TVShowsResponse>()

        try {
            val responseObject = JSONObject(parsingFileToString("TVShowsResponse.json").toString())
            val listArray = responseObject.getJSONArray("tvshows")

            for (i in 0 until listArray.length()) {
                val tvShows = listArray.getJSONObject(i)

                val id = tvShows.getInt("id")
                val type = tvShows.getString("type")
                val title = tvShows.getString("title")
                val image = tvShows.getString("image")
                val resources: Resources = context.resources
                val resourceId: Int = resources.getIdentifier(image, "drawable", context.packageName)
                val release = tvShows.getString("release")
                val rate = tvShows.getString("rate")
                val description = tvShows.getString("description")
                val trailer = tvShows.getString("trailer")

                val tvShowsResponse = TVShowsResponse(id, type, title, resourceId, release,  description, rate, trailer)
                listTVShows.add(tvShowsResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return listTVShows
    }
}