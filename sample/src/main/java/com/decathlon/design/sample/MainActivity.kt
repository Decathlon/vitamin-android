package com.decathlon.design.sample

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.decathlon.design.sample.components.screens.resources.common.ResourcesViewModel
import com.decathlon.design.sample.databinding.ActivityMainBinding
import com.decathlon.design.sample.main.requestFocusAndShowKeyboard

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val resourcesViewModel: ResourcesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        setupNavigation()
        setupSearch()

    }

    private fun setupNavigation() {
        binding.toolbar.setNavigationOnClickListener { onBackPressed() }
        getNavController().addOnDestinationChangedListener { _, destination, _ ->
            title = destination.label
            when (destination.id) {
                R.id.main -> binding.toolbar.navigationIcon = null
                else -> binding.toolbar.setNavigationContext()
            }
        }
    }

    private fun setupSearch() {
        binding.searchbar.setNavigationOnClickListener { onBackPressed() }
        binding.searchbar.setNavigationContext()
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                performSearch(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                performSearch(newText)
                return true
            }
        })
        getNavController().addOnDestinationChangedListener { _, destination, _ ->
            // Manage searchBar
            when (destination.id) {
                R.id.icons_search, R.id.assets_search -> {
                    binding.toolbar.visibility = View.GONE
                    binding.searchbar.visibility = View.VISIBLE
                    binding.searchView.requestFocusAndShowKeyboard()
                    binding.searchView.setQuery("", true)
                }
                else -> {
                    binding.toolbar.visibility = View.VISIBLE
                    binding.searchbar.visibility = View.GONE
                }
            }
        }
    }

    private fun performSearch(searchText: String?) {
        when (getNavController().currentDestination?.id) {
            R.id.icons_search -> resourcesViewModel.searchIcons(searchText ?: "")
            R.id.assets_search -> resourcesViewModel.searchAssets(searchText ?: "")
        }
    }

    private fun getNavController(): NavController {
        return findNavController(R.id.nav_host_fragment)
    }
}