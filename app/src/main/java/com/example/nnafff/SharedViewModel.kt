package com.example.nnafff

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SharedViewModel : ViewModel() {
    // LiveData für user data
    private val _cars = MutableLiveData<List<Auto>>()
    val cars: LiveData<List<Auto>> get() = _cars

    fun getAutoByIndex(index:Int ): Auto? {
        return _cars.value?.getOrNull(index)
    }
}

