package com.ajithvgiri.androidmvp.signin

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

/**
 * Local Unit Test for SignIn Presenter.
 */
class SignInPresenterTest {


    @Mock
    private lateinit var mView: SignInContract.MVPview

    private lateinit var mPresenter: SignInPresenter


    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mPresenter = SignInPresenter(mView)
    }


    @Test
    @Throws(Exception::class)
    fun googleLogin() {
        mPresenter.googleLogin()
        verify(mView).showProgressDialog()
    }


    @Test
    fun facebookLogin() {
        mPresenter.facebookLogin()
        verify(mView).showProgressDialog()
    }

}