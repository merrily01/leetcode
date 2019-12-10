//Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Example: 
//
// 
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
// 
// Related Topics Array Hash Table

object TwoSum {

    def main(args: Array[String]): Unit = {
        // Solution.methodName()
        val solution = Solution
        solution.twoSum(Array(3, 2, 4), 6)
    }


    // Attention：may not use the same element twice.
    //leetcode submit region begin(Prohibit modification and deletion)
    object Solution {
        def twoSum(nums: Array[Int], target: Int): Array[Int] = {
            for (i <- nums.indices) {
                val diff = target - nums(i)
                for (j <- i + 1 until nums.length) {
                    if (diff == nums(j)) {
                        return Array[Int](i, j)
                    }
                }
            }
            throw new Exception("null")
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


  }