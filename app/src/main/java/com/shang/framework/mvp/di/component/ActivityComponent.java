

package com.shang.framework.mvp.di.component;

import com.shang.framework.mvp.di.PerActivity;
import com.shang.framework.mvp.di.module.ActivityModule;
import com.shang.framework.mvp.ui.about.AboutFragment;
import com.shang.framework.mvp.ui.feed.FeedActivity;
import com.shang.framework.mvp.ui.feed.blogs.BlogFragment;
import com.shang.framework.mvp.ui.feed.opensource.OpenSourceFragment;
import com.shang.framework.mvp.ui.login.LoginActivity;
import com.shang.framework.mvp.ui.main.MainActivity;
import com.shang.framework.mvp.ui.main.rating.RateUsDialog;
import com.shang.framework.mvp.ui.splash.SplashActivity;

import dagger.Component;

/**
* Created by sangbk92 on 14-12-2020.
*/



@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

}
