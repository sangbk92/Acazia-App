
package com.shang.framework.mvp.data.network;

import com.shang.framework.mvp.data.network.model.BlogResponse;
import com.shang.framework.mvp.data.network.model.LoginRequest;
import com.shang.framework.mvp.data.network.model.LoginResponse;
import com.shang.framework.mvp.data.network.model.LogoutResponse;
import com.shang.framework.mvp.data.network.model.OpenSourceResponse;

import io.reactivex.Single;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface ApiHelper {

    ApiHeader getApiHeader();

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}
