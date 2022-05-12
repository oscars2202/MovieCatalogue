package com.bangkit.moviecatalogue.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.moviecatalogue.R
import com.bangkit.moviecatalogue.activity.ViewModelFactory
import com.bangkit.moviecatalogue.adapter.FilmAdapter
import com.bangkit.moviecatalogue.databinding.FragmentFilmBinding
import com.bangkit.moviecatalogue.viewModel.FavoriteViewModel
import com.google.android.material.snackbar.Snackbar

class FavoriteFragment : Fragment() {

    private lateinit var binding: FragmentFilmBinding
    private lateinit var adapter : FilmAdapter
    private lateinit var viewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilmBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        itemTouchHelper.attachToRecyclerView(binding.rvFilms)

        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory).get(FavoriteViewModel::class.java)

            adapter = FilmAdapter()
            binding.progressBar.visibility = View.VISIBLE
            viewModel.getFavorite().observe(this, { movies ->
                binding.progressBar.visibility = View.GONE
                adapter.submitList(movies)
            })

            binding.rvFilms.layoutManager = LinearLayoutManager(context)
            binding.rvFilms.setHasFixedSize(true)
            binding.rvFilms.adapter = adapter
        }
    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
        override fun getMovementFlags(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder
        ): Int = makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)

        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean = true

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            if (view != null) {
                val swipedPosition = viewHolder.adapterPosition
                val filmEntity = adapter.getSwipeData(swipedPosition)
                filmEntity?.let {
                    viewModel.setFavorite(it)
                }

                val snackbar = Snackbar.make(view as View, R.string.message_undo, Snackbar.LENGTH_LONG)
                snackbar.setAction(R.string.message_ok) { _ ->
                    filmEntity?.let {
                        viewModel.setFavorite(it)
                    }
                }
                snackbar.show()
            }
        }

    })
}