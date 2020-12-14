
package com.shang.framework.mvp.ui.login;


import com.shang.framework.mvp.di.PerActivity;
import com.shang.framework.mvp.ui.base.MvpPresenter;

/**
* Created by sangbk92 on 14-12-2020.
*/



@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void onServerLoginClick(String email, String password);

    void onGoogleLoginClick();

    void onFacebookLoginClick();

}
