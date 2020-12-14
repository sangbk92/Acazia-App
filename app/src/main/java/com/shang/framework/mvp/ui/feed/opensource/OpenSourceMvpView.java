
package com.shang.framework.mvp.ui.feed.opensource;

import com.shang.framework.mvp.data.network.model.OpenSourceResponse;
import com.shang.framework.mvp.ui.base.MvpView;

import java.util.List;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface OpenSourceMvpView extends MvpView {

    void updateRepo(List<OpenSourceResponse.Repo> repoList);
}
