package com.example.prueba;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

     @Rule
    public ActivityScenarioRule<MainActivity>
            mActivityTestRule =
             new ActivityScenarioRule<MainActivity>(MainActivity.class);

     @Test
    public void myFirstTest(){

         onView(
                 withId(R.id.main_ed_week_number))
                 .perform(tupeText( "HOLA ESPRESSO"),
                         closeSoftKeyboard());
         )
     }
}
