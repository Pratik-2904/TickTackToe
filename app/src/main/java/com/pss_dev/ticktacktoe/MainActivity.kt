package com.pss_dev.ticktacktoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pss_dev.ticktacktoe.data.GameViewModel
import com.pss_dev.ticktacktoe.screen.GameScreen
import com.pss_dev.ticktacktoe.ui.theme.TickTackToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            TickTackToeTheme {
                val viewModel = viewModel<GameViewModel>()
                GameScreen(viewModel = viewModel)
            }
        }
    }
}