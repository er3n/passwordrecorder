package com.iinance.passwordrecorder.ui.login

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class LoginViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel("asd") as T
    }

}