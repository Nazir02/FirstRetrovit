package com.example.retrofit.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.repository.Repository
import com.example.retrofit.model.nal.nalMony
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {
    var repo=Repository()
    val myMoney: MutableLiveData<Response<nalMony>> = MutableLiveData()
   fun getNalMoney(){
       viewModelScope.launch {
           myMoney.value=repo.getNal()
       }
   }
}