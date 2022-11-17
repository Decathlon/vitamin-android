package com.decathlon.design.sample.components.screens.resources.icons

import androidx.lifecycle.LiveData
import androidx.navigation.fragment.findNavController
import com.decathlon.design.sample.R
import com.decathlon.design.sample.components.screens.resources.common.AbstractResourcesFragment
import com.decathlon.design.sample.components.screens.resources.common.ResourceModel

class IconsFragment : AbstractResourcesFragment() {

    override fun showSearchOption(): Boolean = true

    override fun onSearchClick() {
        findNavController().navigate(R.id.action_icons_to_icons_search)
    }

    override fun getData(): LiveData<List<ResourceModel>> {
        return resourcesViewModel.icons
    }

}