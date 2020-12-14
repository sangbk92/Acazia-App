
package com.shang.framework.mvp.ui.feed.opensource;

import com.shang.framework.mvp.ui.base.MvpPresenter;

/**
* Created by sangbk92 on 14-12-2020.
*/


public interface OpenSourceMvpPresenter<V extends OpenSourceMvpView>
        extends MvpPresenter<V> {

    void onViewPrepared();
}
