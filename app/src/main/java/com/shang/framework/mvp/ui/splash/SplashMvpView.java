

package com.shang.framework.mvp.ui.splash;

import com.shang.framework.mvp.ui.base.MvpView;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface SplashMvpView extends MvpView {

    void openLoginActivity();

    void openMainActivity();

    void startSyncService();
}
