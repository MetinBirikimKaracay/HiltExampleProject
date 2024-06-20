package com.example.hiltinfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltinfo.model.ResponseModel
import com.example.hiltinfo.repository.ExampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    private val _requestCompleteMutableLiveData = MutableLiveData<ResponseModel>()
    val requestCompleteMutableLiveData: LiveData<ResponseModel> = _requestCompleteMutableLiveData

    init {
        getPost()
    }

    private fun getPost() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getPost()
            withContext(Dispatchers.Main) {
                _requestCompleteMutableLiveData.value = response
            }
        }
    }
}