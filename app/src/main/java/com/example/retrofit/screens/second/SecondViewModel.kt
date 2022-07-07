package com.example.retrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.repository.Repository
import com.example.retrofit.model.beznal.beznal
import com.example.retrofit.model.nal.nalMony
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {
    var repo= Repository()
    val myMoney: MutableLiveData<Response<beznal>> = MutableLiveData()
    fun getBezNal(){
        viewModelScope.launch {
            myMoney.value=repo.getBezNal()
        }
    }
}