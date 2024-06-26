package com.tekber.jetpack.greatitude.feature_journal.navigation

sealed class Screen(val route: String) {
    data object SplashScreen : Screen("splash_screen")
    data object HomeScreen : Screen("home_screen")
    data object AddEditJournalScreen : Screen("add_edit_journal_screen")
    data object OnBoardingScreen : Screen("onboarding_screen")

    data object SettingsScreen : Screen("settings_screen")

}
