package com.example.prueba;


import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    public static final String STRING_TO_BE_TYPED = "34";


    @Rule
    public ActivityScenarioRule<MainActivity>
            mActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);


    @Test
    public void myFirstTest(){
        onView(withId(R.id.correo))
                .perform(typeText("Hello Byron"),
                        ViewActions.closeSoftKeyboard());

        onView(withId(R.id.correo)).check(matches(withText(STRING_TO_BE_TYPED)));


    }
}
