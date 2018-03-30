package com.ajithvgiri.androidmvp.signin


/**
 * Responsible for handling actions from the view and updating the UI as required.
 */
class SignInPresenter() : SignInContract.Presenter{

    private lateinit var mView:SignInContract.MVPview

    constructor(view:SignInContract.MVPview) : this(){
        mView = view
    }

    // Presenter methods
    override fun googleLogin() {
        mView.showProgressDialog()
    }

    override fun facebookLogin() {
        mView.showProgressDialog()
    }
}