# TWO SUM LEETCODE
Here we are practicing some **LeetCode** Easy exercises

# Description
---

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to the target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Examples

### Example 1:

```python
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2:

```python
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

### Example 3:

```python
Input: nums = [3,3], target = 6
Output: [0,1]
```

## Constraints:

- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.

## Follow-up:

Can you come up with an algorithm that is less than O(n^2) time complexity?

# SOLUTION

As for practicing **Kotlin** we are doing it at this programming language

First of all is to do a **For loop** so we can iterate the array, now we have to compare all the elements in the array 

Now to do the **SUM** with the other elements on the same array we must iterate the array again doing another **For loop**

```Kotlin
for (i in nums.indices){
            for(j in nums.indices){}}
```

This has a Big problem that the excercise description told us not to do it.

we are iterating equals positions with i and J, so the **Array[0]** is going to be compared with **Array[0]** when **J** and **I** have the same value

To solve this problema we can do this simple *IF* condition

```Kotlin
 if (i!=j){}
```

Then, we solve the Sum and and compare it with the **Target** given as a function parameter, so if the result is correct, we break the loop and return the result 
With the position of **I and J**


## SOLUTION

```Kotlin
    class Solution {
    fun twoSum(nums:IntArray,target:Int):IntArray{
        var pos:IntArray = IntArray(2)
        for (i in nums.indices){
            for (j in nums.indices){
                if (i!=j){
                    var sum = nums[i] + nums[j]
                    if (sum == target){
                        pos[0] = i
                        pos[1] = j
                        break;
                    }
                }

            }
        }

        return pos

    }
}
```

Solution in Android Studio
---

```Kotlin
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
```
