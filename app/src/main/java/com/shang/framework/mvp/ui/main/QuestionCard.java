
package com.shang.framework.mvp.ui.main;

import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;

import com.androidnetworking.widget.ANImageView;
import com.shang.framework.mvp.R;
import com.shang.framework.mvp.data.db.model.Option;
import com.shang.framework.mvp.data.db.model.Question;
import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

/**
* Created by sangbk92 on 14-12-2020.
*/



@NonReusable
@Layout(R.layout.card_layout)
public class QuestionCard {

    private static final String TAG = "QuestionCard";

    @View(R.id.tv_question_txt)
    private TextView mQuestionTextView;

    @View(R.id.btn_option_1)
    private Button mOption1Button;

    @View(R.id.btn_option_2)
    private Button mOption2Button;

    @View(R.id.btn_option_3)
    private Button mOption3Button;

    @View(R.id.iv_pic)
    private ANImageView mPicImageView;

    private Question mQuestion;

    public QuestionCard(Question question) {
        mQuestion = question;
    }

    @Resolve
    private void onResolved() {

        mQuestionTextView.setText(mQuestion.getQuestionText());

        for (int i = 0; i < 3; i++) {
            Button button = null;
            switch (i) {
                case 0:
                    button = mOption1Button;
                    break;
                case 1:
                    button = mOption2Button;
                    break;
                case 2:
                    button = mOption3Button;
                    break;
            }

            if (button != null)
                button.setText(mQuestion.getOptionList().get(i).getOptionText());

            if (mQuestion.getImgUrl() != null) {
                mPicImageView.setImageUrl(mQuestion.getImgUrl());
            }
        }
    }

    private void showCorrectOptions() {
        for (int i = 0; i < 3; i++) {
            Option option = mQuestion.getOptionList().get(i);
            Button button = null;
            switch (i) {
                case 0:
                    button = mOption1Button;
                    break;
                case 1:
                    button = mOption2Button;
                    break;
                case 2:
                    button = mOption3Button;
                    break;
            }
            if (button != null) {
                if (option.isCorrect()) {
                    button.setBackgroundColor(Color.GREEN);
                } else {
                    button.setBackgroundColor(Color.RED);
                }
            }
        }
    }

    @Click(R.id.btn_option_1)
    public void onOption1Click() {
        showCorrectOptions();
    }

    @Click(R.id.btn_option_2)
    public void onOption2Click() {
        showCorrectOptions();
    }

    @Click(R.id.btn_option_3)
    public void onOption3Click() {
        showCorrectOptions();
    }
}
