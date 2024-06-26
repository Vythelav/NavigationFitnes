package com.example.navigationfitnes.botom_navigation

import com.example.navigationfitnes.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    object Screen1: BottomItem("Fitness", R.drawable.icon, "screen_1")
    object Screen2: BottomItem("Last", R.drawable.replay, "screen_2")
    object Screen3: BottomItem("Statistic", R.drawable.statistica, "screen_3")
    object Screen4: BottomItem("Heart", R.drawable.heart, "screen_4")
    object Screen5: BottomItem("Favorite", R.drawable.heart, "screen_5")

}