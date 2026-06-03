package com.gilandrey.nearstore.viewModel

import androidx.lifecycle.LiveData
import com.gilandrey.nearstore.Repository.DashboardRepository
import com.gilandrey.nearstore.domain.CategoryModel

class DashboardViewModel {

    private val repository = DashboardRepository()

    fun loadCategory() : LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }
}