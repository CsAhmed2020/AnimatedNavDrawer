package com.example.animated_nav_drawer.ui.navigation

sealed class Screen(val route: String) {

    data object HomeScreen : Screen("home_screen")
    data object TasksScreen : Screen("tasks_screen")
    data object LiveScreen : Screen("live_screen")
    data object CallScreen : Screen("call_screen")
}