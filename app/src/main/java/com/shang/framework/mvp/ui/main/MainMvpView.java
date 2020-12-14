
package com.shang.framework.mvp.ui.main;

import com.shang.framework.mvp.data.db.model.Question;
import com.shang.framework.mvp.ui.base.MvpView;

import java.util.List;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface MainMvpView extends MvpView {

    void openLoginActivity();

    void showAboutFragment();

    void refreshQuestionnaire(List<Question> questionList);

    void reloadQuestionnaire(List<Question> questionList);

    void updateUserName(String currentUserName);

    void updateUserEmail(String currentUserEmail);

    void updateUserProfilePic(String currentUserProfilePicUrl);

    void updateAppVersion();

    void showRateUsDialog();

    void openMyFeedActivity();

    void closeNavigationDrawer();

    void lockDrawer();

    void unlockDrawer();
}
