
package com.shang.framework.mvp.di.component;

import com.shang.framework.mvp.di.PerService;
import com.shang.framework.mvp.di.module.ServiceModule;
import com.shang.framework.mvp.service.SyncService;

import dagger.Component;

/**
* Created by sangbk92 on 14-12-2020.
*/



@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

    void inject(SyncService service);

}
