
package com.shang.framework.mvp.ui.feed.blogs;

import com.shang.framework.mvp.data.network.model.BlogResponse;
import com.shang.framework.mvp.ui.base.MvpView;

import java.util.List;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface BlogMvpView extends MvpView {

    void updateBlog(List<BlogResponse.Blog> blogList);
}
