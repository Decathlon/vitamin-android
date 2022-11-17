package com.decathlon.design.sample.components.screens.resources.assets

import androidx.lifecycle.LiveData
import com.decathlon.design.sample.components.screens.resources.common.AbstractResourcesFragment
import com.decathlon.design.sample.components.screens.resources.common.ResourceModel

class AssetsSearchFragment : AbstractResourcesFragment() {

    override fun playScreenAnimation(): Boolean {
        return false
    }

    override fun getData(): LiveData<List<ResourceModel>> {
        return resourcesViewModel.searchedAssets
    }

}