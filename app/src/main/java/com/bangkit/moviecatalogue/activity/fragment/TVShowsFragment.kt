package com.bangkit.moviecatalogue.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bangkit.moviecatalogue.activity.ViewModelFactory
import com.bangkit.moviecatalogue.adapter.FilmAdapter
import com.bangkit.moviecatalogue.databinding.FragmentFilmBinding
import com.bangkit.moviecatalogue.viewModel.TVShowsViewModel
import com.bangkit.moviecatalogue.vo.Status

class TVShowsFragment : Fragment() {

    private lateinit var binding: FragmentFilmBinding

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

        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory).get(TVShowsViewModel::class.java)

            val filmAdapter = FilmAdapter()
            viewModel.getTVShows().observe(this, { tvshow ->
                if (tvshow != null) {
                    when(tvshow.status) {
                        Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            filmAdapter.submitList(tvshow.data)
                        }
                        Status.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(context, "ERROR", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            with(binding.rvFilms) {
                this.layoutManager = LinearLayoutManager(context)
                this.setHasFixedSize(true)
                this.adapter = filmAdapter
            }

        }
    }
}