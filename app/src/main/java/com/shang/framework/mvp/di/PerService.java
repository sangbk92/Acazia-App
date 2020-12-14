

package com.shang.framework.mvp.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
* Created by sangbk92 on 14-12-2020.
*/



@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {
}

