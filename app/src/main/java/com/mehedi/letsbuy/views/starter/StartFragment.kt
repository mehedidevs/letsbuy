package com.mehedi.letsbuy.views.starter

import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.mehedi.letsbuy.R
import com.mehedi.letsbuy.base.BaseFragment
import com.mehedi.letsbuy.databinding.FragmentStartBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartFragment : BaseFragment<FragmentStartBinding>(FragmentStartBinding::inflate) {


    override fun setListener() {

        setupAutoLogin()


        with(binding) {
            btnLogin.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_loginFragment)
            }

            btnRegister.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_registerFragment)
            }
        }
    }

    private fun setupAutoLogin() {
        FirebaseAuth.getInstance().currentUser?.let {
            findNavController().navigate(R.id.action_startFragment_to_dashboardFragment)
        }


    }

    override fun allObserver() {


    }
}