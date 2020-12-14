
package com.shang.framework.mvp.ui.about;

import com.shang.framework.mvp.data.DataManager;
import com.shang.framework.mvp.ui.base.BasePresenter;
import com.shang.framework.mvp.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
* Created by sangbk92 on 14-12-2020.
*/



public class AboutPresenter<V extends AboutMvpView> extends BasePresenter<V>
        implements AboutMvpPresenter<V> {

    @Inject
    public AboutPresenter(DataManager dataManager,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
