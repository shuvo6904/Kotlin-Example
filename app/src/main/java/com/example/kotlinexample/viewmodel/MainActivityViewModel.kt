package com.example.kotlinexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinexample.model.OnlineShopPublishModel
import com.example.kotlinexample.network.ApiService
import com.example.kotlinexample.network.RetroInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel() : ViewModel() {

    fun onlineShopPublish(token : String, shopId : Int) : LiveData<OnlineShopPublishModel>{

        val responseBody = MutableLiveData<OnlineShopPublishModel>()

        viewModelScope.launch(Dispatchers.IO) {

            val retroInstance = RetroInstance.getRetroInstance().create(ApiService::class.java)

            withContext(Dispatchers.Main){
                responseBody.value = retroInstance.onlineShopPublish(token, shopId).body()
            }



        }

        return responseBody
    }
}