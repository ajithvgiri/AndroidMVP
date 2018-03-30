package com.ajithvgiri.androidmvp.signin


/**
 * Responsible for handling actions from the view and updating the UI as required.
 */
class SignInPresenter() : SignInContract.Presenter{

    private lateinit var mView:SignInContract.MVPview

    constructor(view:SignInContract.MVPview) : this() {

    }



}