package com.bangkit.moviecatalogue.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bangkit.moviecatalogue.R
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.databinding.ActivityDetailBinding
import com.bangkit.moviecatalogue.viewModel.DetailViewModel
import com.bangkit.moviecatalogue.vo.Status
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIES = "extra_movies"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var binding : ActivityDetailBinding
    private lateinit var detailViewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val factory = ViewModelFactory.getInstance(this)
        detailViewModel = ViewModelProvider(this, factory).get(DetailViewModel::class.java)

        val film = intent.getStringExtra(EXTRA_MOVIES)
        val type = intent.getStringExtra(EXTRA_TYPE)

        binding.progressBar.visibility = View.VISIBLE

        if (type.equals("movies")) {
            film.let {
                detailViewModel.setSelectedFilm(film.toString())
                detailViewModel.detailMovie.observe(this, { detail ->
                    if (detail != null) {
                        val state = detail.data?.favorite
                        if (state != null) {
                            favorite(state)
                        }
                        when(detail.status) {
                            Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                            Status.SUCCESS -> if (detail.data != null) {
                                binding.progressBar.visibility = View.GONE
                                detailFilm(detail.data)
                                binding.fabFavorite.setOnClickListener {
                                    if (state != null) {
                                        favorite(state)
                                    }
                                    detailViewModel.setFavoriteMovie()
                                }
                            }
                            Status.ERROR -> {
                                binding.progressBar.visibility = View.GONE
                                Toast.makeText(applicationContext, "ERROR", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                })
            }
        } else if (type.equals("tvshows")) {
            film.let {
                detailViewModel.setSelectedFilm(film.toString())
                detailViewModel.detailTVShow.observe(this, { detail ->
                    if (detail != null) {
                        val state = detail.data?.favorite
                        if (state != null) {
                            favorite(state)
                        }
                        when(detail.status) {
                            Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                            Status.SUCCESS -> if (detail.data != null) {
                                binding.progressBar.visibility = View.GONE
                                detailFilm(detail.data)
                                binding.fabFavorite.setOnClickListener {
                                    if (state != null) {
                                        favorite(state)
                                    }
                                    detailViewModel.setFavoriteTVShow()
                                }
                            }
                            Status.ERROR -> {
                                binding.progressBar.visibility = View.GONE
                                Toast.makeText(applicationContext, "ERROR", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                })
            }
        }
    }

    private fun detailFilm(filmEntity: FilmEntity) {

        binding.tvTitle.text = filmEntity.title
        binding.tvDate.text = filmEntity.release
        binding.tvRate.text = filmEntity.rate
        binding.tvDescription.text = filmEntity.description

        Glide.with(this)
            .load(filmEntity.image)
            .into(binding.ivPhoto)

        binding.playTrailer.setOnClickListener {
            val uriUrl: Uri = Uri.parse(filmEntity.trailer)
            val trailer = Intent(Intent.ACTION_VIEW, uriUrl)
            startActivity(trailer)
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun favorite(state : Boolean) {
        if (!state) {
            binding.fabFavorite.setImageDrawable(getDrawable(R.drawable.ic_favorite))
        } else {
            binding.fabFavorite.setImageDrawable(getDrawable(R.drawable.ic_favorite_fill))
        }
    }
}