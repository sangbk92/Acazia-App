
package com.shang.framework.mvp.ui.main.rating;

import com.shang.framework.mvp.ui.base.MvpPresenter;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface RatingDialogMvpPresenter<V extends RatingDialogMvpView> extends MvpPresenter<V> {

    void onRatingSubmitted(float rating, String message);

    void onCancelClicked();

    void onLaterClicked();

    void onPlayStoreRatingClicked();
}
