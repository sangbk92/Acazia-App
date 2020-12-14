
package com.shang.framework.mvp.ui.main;


import com.shang.framework.mvp.di.PerActivity;
import com.shang.framework.mvp.ui.base.MvpPresenter;

/**
* Created by sangbk92 on 14-12-2020.
*/


@PerActivity
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void onDrawerOptionAboutClick();

    void onDrawerOptionLogoutClick();

    void onDrawerRateUsClick();

    void onDrawerMyFeedClick();

    void onViewInitialized();

    void onCardExhausted();

    void onNavMenuCreated();
}
