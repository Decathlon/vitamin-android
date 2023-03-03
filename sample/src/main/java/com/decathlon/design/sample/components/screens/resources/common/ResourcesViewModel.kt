package com.decathlon.design.sample.components.screens.resources.common

import android.app.Application
import android.util.Log
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.lang.reflect.Field

class ResourcesViewModel(val app: Application) : AndroidViewModel(app) {

    //region Icons

    private val _icons: MutableLiveData<List<ResourceModel>> =
        MutableLiveData<List<ResourceModel>>().apply { value = retrieveAllIcons() }
    private val _searchedIcons: MutableLiveData<List<ResourceModel>> =
        MutableLiveData<List<ResourceModel>>().apply { value = retrieveAllIcons() }
    val icons: LiveData<List<ResourceModel>>
        get() = _icons
    val searchedIcons: LiveData<List<ResourceModel>>
        get() = _searchedIcons

    fun searchIcons(searchText: String) {
        _searchedIcons.postValue(
            (_icons.value ?: emptyList()).filter {
                it.name.contains(searchText)
            }
        )
    }

    private fun retrieveAllIcons(): List<ResourceModel> {
        return retrieveAllResources(
            com.decathlon.vitamin.foundation.icons.R.drawable::class.java.fields,
            ResourceType.Icon
        ).filter { // Add a filter here to avoid having sdk built-in icons like "mtrl_dropdown_arrow"
            it.name.startsWith(
                "ic_vtmn_"
            )
        }
    }

    //endregion

    //region Assets

    private val _assets: MutableLiveData<List<ResourceModel>> =
        MutableLiveData<List<ResourceModel>>().apply { value = retrieveAllAssets() }
    private val _searchedAssets: MutableLiveData<List<ResourceModel>> =
        MutableLiveData<List<ResourceModel>>().apply { value = retrieveAllAssets() }
    val assets: LiveData<List<ResourceModel>>
        get() = _assets
    val searchedAssets: LiveData<List<ResourceModel>>
        get() = _searchedAssets

    fun searchAssets(searchText: String) {
        _searchedAssets.postValue(
            (_assets.value ?: emptyList()).filter {
                it.name.contains(searchText)
            }
        )
    }

    private fun retrieveAllAssets(): List<ResourceModel> {
        return retrieveAllResources(
            com.decathlon.vitamin.foundation.assets.R.drawable::class.java.fields,
            ResourceType.Asset
        ).filter {
            it.name.startsWith(
                "vtmn_"
            )
        }
    }

    //endregion

    private fun retrieveAllResources(
        fields: Array<Field>,
        type: ResourceType
    ): MutableList<ResourceModel> {
        val resources = mutableListOf<ResourceModel>()
        for (field in fields) {
            try {
                ResourcesCompat.getDrawable(app.resources, field.getInt(null), null)
                    ?.let { drawable ->
                        resources.add(
                            ResourceModel(
                                name = field.name,
                                src = drawable,
                                type
                            )
                        )
                    }
            } catch (e: Exception) {
                Log.e(
                    "Extracting resources",
                    "Error when trying to get the drawable of ${field.name}"
                )
            }
        }
        return resources
    }
}
