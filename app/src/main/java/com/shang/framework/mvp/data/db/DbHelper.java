

package com.shang.framework.mvp.data.db;

import com.shang.framework.mvp.data.db.model.Option;
import com.shang.framework.mvp.data.db.model.Question;
import com.shang.framework.mvp.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;


/**
* Created by sangbk92 on 14-12-2020.
*/



public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();

    Observable<List<Question>> getAllQuestions();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveQuestionList(List<Question> questionList);

    Observable<Boolean> saveOptionList(List<Option> optionList);
}
