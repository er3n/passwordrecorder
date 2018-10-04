package com.iinance.passwordrecorder.utilities

import com.iinance.passwordrecorder.ui.login.LoginViewModelFactory

object InjectorUtils {

    fun provideLoginViewModelFactory() : LoginViewModelFactory {
        return LoginViewModelFactory()
    }
}