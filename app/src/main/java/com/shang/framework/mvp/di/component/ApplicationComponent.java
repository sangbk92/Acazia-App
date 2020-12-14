
package com.shang.framework.mvp.di.component;

import android.app.Application;
import android.content.Context;

import com.shang.framework.mvp.MvpApp;
import com.shang.framework.mvp.data.DataManager;
import com.shang.framework.mvp.di.ApplicationContext;
import com.shang.framework.mvp.di.module.ApplicationModule;
import com.shang.framework.mvp.service.SyncService;

import javax.inject.Singleton;

import dagger.Component;

/**
* Created by sangbk92 on 14-12-2020.
*/



@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}