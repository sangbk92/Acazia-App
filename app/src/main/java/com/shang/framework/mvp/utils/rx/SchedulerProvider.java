package com.shang.framework.mvp.utils.rx;

import io.reactivex.Scheduler;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}
