package com.leetcode.exercises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.leetcode.exercises.ui.theme.ExcercisesTheme
import com.leetcode.exercises.ui.theme.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExcercisesTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                        Greeting(model = MainViewModel())
                }
            }
        }
    }
}

