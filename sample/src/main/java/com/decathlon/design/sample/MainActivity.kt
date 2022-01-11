package com.decathlon.design.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.decathlon.design.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        binding.toolbar.setNavigationOnClickListener { onBackPressed() }
        findNavController(R.id.nav_host_fragment).addOnDestinationChangedListener { _, destination, _ ->
            title = destination.label
            when (destination.id) {
                R.id.main -> binding.toolbar.navigationIcon = null
                else -> binding.toolbar.setNavigationContext()
            }
        }
    }
}