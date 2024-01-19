package com.leetcode.exercises

import android.util.Log
import androidx.lifecycle.ViewModel
import com.leetcode.exercises.ui.theme.Data

class MainViewModel : ViewModel() {
        fun twoSumVM(){
            var result = Model()
            var array = result.twoSum()
            for (i in array.indices){
                Log.d(Data.TAG,array[i].toString())
            }
        }


}