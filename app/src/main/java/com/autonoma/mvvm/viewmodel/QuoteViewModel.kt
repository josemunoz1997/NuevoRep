package com.autonoma.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.autonoma.mvvm.model.QuoteModel
import com.autonoma.mvvm.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}