

package com.shang.framework.mvp.ui.main.rating;

import com.shang.framework.mvp.ui.base.DialogMvpView;

/**
* Created by sangbk92 on 14-12-2020.
*/



public interface RatingDialogMvpView extends DialogMvpView {

    void openPlayStoreForRating();

    void showPlayStoreRatingView();

    void showRatingMessageView();

    void hideSubmitButton();

    void disableRatingStars();

    void dismissDialog();
}
