package br.com.frcnetto.cryptowallet.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _userGreetings = MutableLiveData<String>().apply {
        value = "Hi, User!"
    }
    val userGreetings: LiveData<String> = _userGreetings

    private val _userMessage = MutableLiveData<String>().apply {
        value = "What would you like to work with?"
    }
    val userMessage: LiveData<String> = _userMessage
}