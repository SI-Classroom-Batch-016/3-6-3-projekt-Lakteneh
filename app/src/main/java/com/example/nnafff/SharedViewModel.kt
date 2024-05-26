package com.example.nnafff

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SharedViewModel : ViewModel() {
    val list = Datasource().loadAuto()
    private val _cars = MutableLiveData<List<Auto>>(list)
    val cars: LiveData<List<Auto>> get() = _cars


}

