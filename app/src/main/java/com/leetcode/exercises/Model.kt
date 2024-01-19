package com.leetcode.exercises

import android.util.Log
import com.leetcode.exercises.ui.theme.Data

class Model {
    fun twoSum():IntArray{
        var nums = Data.nums.value.split(",").map { it.toInt() }
        var target = Data.target.value.toInt()
        var result: IntArray = intArrayOf(0,0)
        Log.d(Data.TAG,"NUMS: $nums" + "Target: ${target}")

        for (i in nums.indices){
            for(j in nums.indices){
                if (i!=j){
                    var sum = nums[i] + nums[j]
                    if (sum==target){
                        result[0] = j
                        result[1] = i
                        break
                    }
                }
            }
        }
        return result

    }


}