package com.bangkit.moviecatalogue.activity

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.bangkit.moviecatalogue.R
import com.bangkit.moviecatalogue.utils.DataDummy
import com.bangkit.moviecatalogue.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Rule

class MainActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovie()
    private val dummyTVShows = DataDummy.generateDummyShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rvFilms)).check(matches(isDisplayed()))
        onView(withId(R.id.rvFilms)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rvFilms)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.iv_photo)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(withText(dummyMovies[0].release)))
        onView(withId(R.id.tvRate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRate)).check(matches(withText(dummyMovies[0].rate)))
        onView(withId(R.id.tvDescription)).check(matches(withText(dummyMovies[0].description)))
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(withId(R.id.playTrailer)).perform(click())
    }

    @Test
    fun loadTVShows() {
        onView(withId(R.id.rvFilms)).check(matches(isDisplayed()))
        onView(withId(R.id.rvFilms)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTVShows.size))
    }

    @Test
    fun loadDetailTVShows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rvFilms)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyTVShows[0].title)))
        onView(withId(R.id.iv_photo)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(withText(dummyTVShows[0].release)))
        onView(withId(R.id.tvRate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRate)).check(matches(withText(dummyTVShows[0].rate)))
        onView(withId(R.id.tvDescription)).check(matches(withText(dummyTVShows[0].description)))
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(withId(R.id.playTrailer)).perform(click())
    }

    @Test
    fun favoriteFilm() {

        onView(withId(R.id.rvFilms)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withText("FAVORITE")).perform(click())
        onView(withId(R.id.rvFilms)).check(matches(isDisplayed()))
        onView(withId(R.id.rvFilms)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.iv_photo)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRate)).check(matches(isDisplayed()))
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(withId(R.id.fab_Favorite)).perform(click())
        onView(withId(R.id.playTrailer)).perform(click())

    }

}