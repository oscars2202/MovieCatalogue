package com.bangkit.moviecatalogue.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bangkit.moviecatalogue.activity.fragment.FavoriteFragment
import com.bangkit.moviecatalogue.activity.fragment.MoviesFragment
import com.bangkit.moviecatalogue.activity.fragment.TVShowsFragment

class SectionPagerAdapter(activity: AppCompatActivity, bundle: Bundle) : FragmentStateAdapter(activity) {

    private var fragmentBundle : Bundle? = bundle

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null

        when (position) {
            0 -> fragment = MoviesFragment()
            1 -> fragment = TVShowsFragment()
            2 -> fragment = FavoriteFragment()
        }
        fragment?.arguments = fragmentBundle

        return fragment as Fragment
    }
}