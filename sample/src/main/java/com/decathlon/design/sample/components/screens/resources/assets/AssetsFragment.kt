package com.decathlon.design.sample.components.screens.resources.assets

import androidx.lifecycle.LiveData
import androidx.navigation.fragment.findNavController
import com.decathlon.design.sample.R
import com.decathlon.design.sample.components.screens.resources.common.AbstractResourcesFragment
import com.decathlon.design.sample.components.screens.resources.common.ResourceModel

class AssetsFragment : AbstractResourcesFragment() {

    override fun showSearchOption(): Boolean = true

    override fun onSearchClick() {
        findNavController().navigate(R.id.action_assets_to_assets_search)
    }

    override fun getData(): LiveData<List<ResourceModel>> {
        return resourcesViewModel.assets
    }

}