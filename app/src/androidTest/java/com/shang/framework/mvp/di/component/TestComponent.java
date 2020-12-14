
package com.shang.framework.mvp.di.component;

import com.shang.framework.mvp.di.module.ApplicationTestModule;

import javax.inject.Singleton;

import dagger.Component;

/**
* Created by sangbk92 on 14-12-2020.
*/


@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {
}
