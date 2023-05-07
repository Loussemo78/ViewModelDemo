package com.example.viewmodeldemo


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
   /* private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
        get() = total*/
// même principe que live data on peur lire la valeur observer mais pas la midifié

private val _flowTotal = MutableStateFlow<Int>(0)
    val flowTotal : StateFlow<Int> = _flowTotal
    //get() = _flowTotal


    init {
        //total.value = startingTotal
        _flowTotal.value = startingTotal
    }

    fun setTotal(input:Int){
       // total.value =(total.value)?.plus(input)
        _flowTotal.value = (_flowTotal.value).plus(input)
    }
}