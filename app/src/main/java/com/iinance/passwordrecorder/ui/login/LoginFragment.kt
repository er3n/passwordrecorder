package com.iinance.passwordrecorder.ui.login

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iinance.passwordrecorder.databinding.LoginFragmentBinding
import com.iinance.passwordrecorder.utilities.InjectorUtils

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val binding = LoginFragmentBinding.inflate(inflater, container, false)
        val factory = InjectorUtils.provideLoginViewModelFactory()
        binding.viewModel = ViewModelProviders.of(this, factory).get(LoginViewModel::class.java)
        return binding.root
    }


}
