package com.example.mlaku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mlaku.adapter.ViewPagerAdapter
import com.example.mlaku.databinding.ActivityMainBinding
import com.example.mlaku.fragment.fragmentHome
import com.example.mlaku.fragment.fragmentUser

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()
    }

    private fun setupTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(fragmentHome(),"Home")
        adapter.addFragment(fragmentUser(),"Profile")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_user)
    }
}