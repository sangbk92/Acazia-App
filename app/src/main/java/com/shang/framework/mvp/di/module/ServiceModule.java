
package com.shang.framework.mvp.di.module;

import android.app.Service;

import dagger.Module;

/**
* Created by sangbk92 on 14-12-2020.
*/



@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}
