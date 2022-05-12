package com.bangkit.moviecatalogue.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.bangkit.moviecatalogue.R
import com.bangkit.moviecatalogue.adapter.SectionPagerAdapter
import com.bangkit.moviecatalogue.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val tabTitle = intArrayOf(R.string.movies, R.string.tvShows, R.string.favorite)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = Bundle()

        val sectionPagerAdapter = SectionPagerAdapter(this, bundle)
        val viewPager : ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = sectionPagerAdapter

        val tabLayout : TabLayout = findViewById(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = resources.getString(tabTitle[position])
        }.attach()
    }
}