package com.tekber.jetpack.greatitude.feature_journal.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composable;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavHost;
import androidx.navigation.compose.composable;
import androidx.navigation.navArgument;
import com.tekber.jetpack.greatitude.feature_journal.presentation.add_edit_journal.AddEditJournalScreen;
import com.tekber.jetpack.greatitude.feature_journal.presentation.journal_screen.JournalScreen;
import com.tekber.jetpack.greatitude.feature_journal.presentation.onboarding_screen.OnBoardingScreen;
import com.tekber.jetpack.greatitude.feature_journal.presentation.settings.SettingsScreen;
import com.tekber.jetpack.greatitude.feature_journal.presentation.splash_screen.SplashScreen;

@Composable
fun SetupNavGraph(
    componentActivity: ComponentActivity,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.HomeScreen.route) {
            JournalScreen(componentActivity, navController = navController)
        }
        composable(route = Screen.OnBoardingScreen.route) {
            OnBoardingScreen(componentActivity, navController = navController)
        }
        composable(route = Screen.SettingsScreen.route) {
            SettingsScreen(componentActivity, navController = navController)
        }
        composable(
            route = Screen.AddEditJournalScreen.route +
                    "?journalId={journalId}&journalColor={journalColor}&isJournalEdit={isJournalEdit}",
            arguments = listOf(
                navArgument(
                    name = "journalId"
                ) {
                    type = NavType.IntType
                    defaultValue = -1
                },
                navArgument(
                    name = "journalColor"
                ) {
                    type = NavType.IntType
                    defaultValue = -1
                },
                navArgument(
                    name = "isJournalEdit"
                ) {
                    type = NavType.BoolType
                    defaultValue = true
                },
            )
        ) {
            val color = it.arguments?.getInt("journalColor") ?: -1
            val isEdit = it.arguments?.getBoolean("isJournalEdit") ?: true
            AddEditJournalScreen(
                componentActivity = componentActivity,
                navController = navController,
                journalColor = color,
                isEdit = isEdit
            )
        }
    }
}