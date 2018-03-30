package com.ajithvgiri.androidmvp.signin

/**
 * Defines the contract between the View MainActivity and the SignInPresenter.
 */
interface SignInContract {

    interface MVPview {
        fun showProgressDialog() {

        }

        fun dismissProgressDialog() {

        }

    }

    interface Presenter {
        fun googleLogin() {
            
        }

        fun facebookLogin() {
            
        }
    }
}