package com.bangkit.moviecatalogue.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.moviecatalogue.activity.DetailActivity
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.databinding.ItemFilmBinding
import com.bumptech.glide.Glide

class FilmAdapter : PagedListAdapter<FilmEntity, FilmAdapter.FilmViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<FilmEntity>() {
            override fun areItemsTheSame(oldItem: FilmEntity, newItem: FilmEntity): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: FilmEntity, newItem: FilmEntity): Boolean {
                return oldItem == newItem
            }

        }
    }

    fun getSwipeData(swipedPosition : Int) : FilmEntity? = getItem(swipedPosition)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val itemFilmBinding = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return FilmViewHolder(itemFilmBinding)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val films = getItem(position)
        if (films != null) {
            holder.bind(films)
        }
    }

    class FilmViewHolder(private val binding : ItemFilmBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(films : FilmEntity) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(films.image)
                    .into(ivPhoto)
                tvTitle.text = films.title
                tvDate.text = films.release
                tvDescription.text = films.description

                itemView.setOnClickListener {
                    val detail = Intent(itemView.context, DetailActivity::class.java)
                    detail.putExtra(DetailActivity.EXTRA_MOVIES, films.title)
                    detail.putExtra(DetailActivity.EXTRA_TYPE, films.type)
                    itemView.context.startActivity(detail)
                }
            }
        }
    }
}