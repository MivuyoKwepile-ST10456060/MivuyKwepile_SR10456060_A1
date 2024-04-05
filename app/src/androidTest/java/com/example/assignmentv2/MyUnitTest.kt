package com.example.assignmentv2

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyUnitTest {

    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setup() {
        // Start the activity under test
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun cleanup() {
        // Finish the activity after the test
        scenario.close()
    }

    @Test
    fun testValidAgeRange() {
        // Type a valid age in the EditText
        onView(withId(R.id.EditText)).perform(typeText("25"))

        // Click the button2
        onView(withId(R.id.button2)).perform(click())

        // Check if the correct message is displayed in textView2
        onView(withId(R.id.textView2)).check(matches(withText("Famous actor, Cameron Boyce, died the the age of 20 due to a seizure which was a result of an ongoing medical condition.")))
    }

    @Test
    fun testInvalidAgeRange() {
        // Type an invalid age in the EditText
        onView(withId(R.id.EditText)).perform(typeText("15"))

        // Click the button2
        onView(withId(R.id.button2)).perform(click())

        // Check if the correct message for out of range age is displayed in textView2
        onView(withId(R.id.textView2)).check(matches(withText("This age is out of range")))
    }
}
