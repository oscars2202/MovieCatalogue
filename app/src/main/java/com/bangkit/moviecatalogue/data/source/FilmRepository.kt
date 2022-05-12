package com.bangkit.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.bangkit.moviecatalogue.data.NetworkBoundResource
import com.bangkit.moviecatalogue.data.source.local.LocalDataSource
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.remote.APIResponse
import com.bangkit.moviecatalogue.data.source.remote.RemoteDataSource
import com.bangkit.moviecatalogue.data.source.remote.response.MoviesResponse
import com.bangkit.moviecatalogue.data.source.remote.response.TVShowsResponse
import com.bangkit.moviecatalogue.utils.AppExecutors
import com.bangkit.moviecatalogue.vo.Resource

class FilmRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : FilmDataSource {

    companion object {
        private var instance : FilmRepository? = null

        fun getInstance(remoteDataSource: RemoteDataSource, localDataSource: LocalDataSource, appExecutors: AppExecutors) : FilmRepository =
            instance ?: synchronized(this) {
                instance ?: FilmRepository(remoteDataSource, localDataSource, appExecutors).apply {
                    instance = this
                }
            }
    }

    override fun getAllMovies(): LiveData<Resource<PagedList<FilmEntity>>> {

        return object : NetworkBoundResource<PagedList<FilmEntity>, List<MoviesResponse>>(appExecutors) {

            override fun loadFromDB(): LiveData<PagedList<FilmEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getMovies(), config).build()
            }


            override fun shouldFetch(data: PagedList<FilmEntity>?): Boolean =
                data == null || data.isEmpty()


            override fun createCall(): LiveData<APIResponse<List<MoviesResponse>>> =
                remoteDataSource.getAllMovies()

            override fun saveCallResult(data: List<MoviesResponse>) {

                val moviesList = ArrayList<FilmEntity>()

                for (response in data) {
                    val movie = FilmEntity(
                        response.id,
                        response.type,
                        response.title,
                        response.image,
                        response.release,
                        response.description,
                        response.rate,
                        response.trailer
                    )
                    moviesList.add(movie)
                }
                localDataSource.insertMovies(moviesList)
            }
        }.asLiveData()
    }

    override fun getAllTVShows(): LiveData<Resource<PagedList<FilmEntity>>> {

        return object : NetworkBoundResource<PagedList<FilmEntity>, List<TVShowsResponse>>(appExecutors) {

            override fun loadFromDB(): LiveData<PagedList<FilmEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getTVShows(), config).build()
            }


            override fun shouldFetch(data: PagedList<FilmEntity>?): Boolean =
                data == null || data.isEmpty()


            override fun createCall(): LiveData<APIResponse<List<TVShowsResponse>>> =
                remoteDataSource.getAllTVShows()

            override fun saveCallResult(data: List<TVShowsResponse>) {

                val tvShowsList = ArrayList<FilmEntity>()

                for (response in data) {
                    val tvShow = FilmEntity(
                        response.id,
                        response.type,
                        response.title,
                        response.image,
                        response.release,
                        response.description,
                        response.rate,
                        response.trailer
                    )
                    tvShowsList.add(tvShow)
                }
                localDataSource.insertTVShows(tvShowsList)
            }
        }.asLiveData()
    }

    override fun getDetailMovie(title : String): LiveData<Resource<FilmEntity>> {

        return object : NetworkBoundResource<FilmEntity, List<MoviesResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<FilmEntity> =
                localDataSource.getDetailMovie(title)

            override fun shouldFetch(data: FilmEntity?): Boolean =
                data?.title == null || data.title.isEmpty()

            override fun createCall(): LiveData<APIResponse<List<MoviesResponse>>> =
                remoteDataSource.getAllMovies()

            override fun saveCallResult(data: List<MoviesResponse>) {
                val detailMovie = ArrayList<FilmEntity>()

                for (response in data) {
                    if (response.title == title) {
                        val movie = FilmEntity(
                            response.id,
                            response.type,
                            response.title,
                            response.image,
                            response.release,
                            response.description,
                            response.rate,
                            response.trailer
                        )
                        detailMovie.add(movie)
                    }
                }
                localDataSource.insertMovies(detailMovie)
            }
        }.asLiveData()
    }

    override fun getDetailTVShows(title : String): LiveData<Resource<FilmEntity>> {

        return object : NetworkBoundResource<FilmEntity, List<TVShowsResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<FilmEntity> =
                localDataSource.getDetailTVShows(title)

            override fun shouldFetch(data: FilmEntity?): Boolean =
                data?.title == null || data.title.isEmpty()

            override fun createCall(): LiveData<APIResponse<List<TVShowsResponse>>> =
                remoteDataSource.getAllTVShows()

            override fun saveCallResult(data: List<TVShowsResponse>) {
                val detailTVShow = ArrayList<FilmEntity>()

                for (response in data) {
                    if (response.title == title) {
                        val tvshow = FilmEntity(
                            response.id,
                            response.type,
                            response.title,
                            response.image,
                            response.release,
                            response.description,
                            response.rate,
                            response.trailer
                        )
                        detailTVShow.add(tvshow)
                    }
                }
                localDataSource.insertTVShows(detailTVShow)
            }
        }.asLiveData()
    }

    override fun getFavorite() : LiveData<PagedList<FilmEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getFavorite(), config).build()
    }

    override fun setFavorite(film: FilmEntity, state: Boolean) {
        appExecutors.diskIO().execute {
            localDataSource.setMovieFavorite(film, state)
            localDataSource.setTVShowsFavorite(film, state)
        }
    }

}