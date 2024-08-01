package com.example.example_mvvm_runtimepermission

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class LocationViewModel : ViewModel(){
    private val _location = MutableLiveData<Location>()
    val location : LiveData<Location> get() = _location
    fun setLocation(lat : Double, lng : Double){
        viewModelScope.launch {
            _location.value = Location(lat, lng)
        }
    }
}