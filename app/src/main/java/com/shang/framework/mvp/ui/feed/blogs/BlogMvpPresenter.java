

package com.shang.framework.mvp.ui.feed.blogs;

import com.shang.framework.mvp.ui.base.MvpPresenter;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface BlogMvpPresenter<V extends BlogMvpView>
        extends MvpPresenter<V> {

    void onViewPrepared();
}


