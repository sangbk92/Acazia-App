

package com.shang.framework.mvp.ui.login;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.shang.framework.mvp.R;
import com.shang.framework.mvp.TestComponentRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
* Created by sangbk92 on 14-12-2020.
*/


@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    public final TestComponentRule component =
            new TestComponentRule(InstrumentationRegistry.getTargetContext());

    public final IntentsTestRule<LoginActivity> main =
            new IntentsTestRule<>(LoginActivity.class, false, false);

    @Rule
    public TestRule chain = RuleChain.outerRule(component).around(main);

    @Before
    public void setup() {

    }

    @Test
    public void checkViewsDisplay() {
        main.launchActivity(LoginActivity.getStartIntent(component.getContext()));

        onView(withId(R.id.et_account))
                .check(matches(isDisplayed()));

        onView(withId(R.id.et_password))
                .check(matches(isDisplayed()));

        onView(withId(R.id.btn_server_login))
                .check(matches(isDisplayed()));

        onView(withText(R.string.login))
                .check(matches(isDisplayed()));

        onView(withId(R.id.ib_google_login))
                .check(matches(isDisplayed()));

        onView(withId(R.id.ib_fb_login))
                .check(matches(isDisplayed()));
    }
}