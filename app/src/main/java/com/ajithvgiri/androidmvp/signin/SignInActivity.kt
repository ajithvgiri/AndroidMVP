package com.ajithvgiri.androidmvp.signin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ajithvgiri.androidmvp.R

/**
 * Display the SignIn View.
 */
class SignInActivity : AppCompatActivity(),SignInContract.MVPview{

    private lateinit var signInPresenter: SignInPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signInPresenter
    }

    override fun showProgressDialog() {

    }

    override fun dismissProgressDialog() {

    }
}
