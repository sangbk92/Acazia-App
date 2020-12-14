
package com.shang.framework.mvp.ui.feed;

import com.shang.framework.mvp.data.DataManager;
import com.shang.framework.mvp.ui.base.BasePresenter;
import com.shang.framework.mvp.ui.base.MvpView;
import com.shang.framework.mvp.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
* Created by sangbk92 on 14-12-2020.
*/



public class FeedPresenter<V extends MvpView> extends BasePresenter<V> implements
        FeedMvpPresenter<V> {

    private static final String TAG = "FeedPresenter";

    @Inject
    public FeedPresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
