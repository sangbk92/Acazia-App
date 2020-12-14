

package com.shang.framework.mvp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.shang.framework.mvp.data.network.model.BlogResponse;
import com.shang.framework.mvp.data.network.model.OpenSourceResponse;
import com.shang.framework.mvp.di.ActivityContext;
import com.shang.framework.mvp.di.PerActivity;
import com.shang.framework.mvp.ui.about.AboutMvpPresenter;
import com.shang.framework.mvp.ui.about.AboutMvpView;
import com.shang.framework.mvp.ui.about.AboutPresenter;
import com.shang.framework.mvp.ui.feed.FeedMvpPresenter;
import com.shang.framework.mvp.ui.feed.FeedMvpView;
import com.shang.framework.mvp.ui.feed.FeedPagerAdapter;
import com.shang.framework.mvp.ui.feed.FeedPresenter;
import com.shang.framework.mvp.ui.feed.blogs.BlogAdapter;
import com.shang.framework.mvp.ui.feed.blogs.BlogMvpPresenter;
import com.shang.framework.mvp.ui.feed.blogs.BlogMvpView;
import com.shang.framework.mvp.ui.feed.blogs.BlogPresenter;
import com.shang.framework.mvp.ui.feed.opensource.OpenSourceAdapter;
import com.shang.framework.mvp.ui.feed.opensource.OpenSourceMvpPresenter;
import com.shang.framework.mvp.ui.feed.opensource.OpenSourceMvpView;
import com.shang.framework.mvp.ui.feed.opensource.OpenSourcePresenter;
import com.shang.framework.mvp.ui.login.LoginMvpPresenter;
import com.shang.framework.mvp.ui.login.LoginMvpView;
import com.shang.framework.mvp.ui.login.LoginPresenter;
import com.shang.framework.mvp.ui.main.MainMvpPresenter;
import com.shang.framework.mvp.ui.main.MainMvpView;
import com.shang.framework.mvp.ui.main.MainPresenter;
import com.shang.framework.mvp.ui.main.rating.RatingDialogMvpPresenter;
import com.shang.framework.mvp.ui.main.rating.RatingDialogMvpView;
import com.shang.framework.mvp.ui.main.rating.RatingDialogPresenter;
import com.shang.framework.mvp.ui.splash.SplashMvpPresenter;
import com.shang.framework.mvp.ui.splash.SplashMvpView;
import com.shang.framework.mvp.ui.splash.SplashPresenter;
import com.shang.framework.mvp.utils.rx.AppSchedulerProvider;
import com.shang.framework.mvp.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
* Created by sangbk92 on 14-12-2020.
*/



@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
