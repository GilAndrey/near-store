package com.gilandrey.nearstore.viewModel

import androidx.lifecycle.LiveData
import com.gilandrey.nearstore.Repository.ResultsRepository
import com.gilandrey.nearstore.domain.CategoryModel
import com.gilandrey.nearstore.domain.StoreModel

class ResultsViewModel {
    private val repository = ResultsRepository()

    fun loadSubCategory(id: String): LiveData<MutableList<CategoryModel>> {
        return repository.loadSubCategory(id)
    }

    fun loadPopular(id: String): LiveData<MutableList<StoreModel>> {
        return repository.loadPopular(id)
    }
}