//Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: "Hello"
//Output: "hello"
// 
//
// 
// Example 2: 
//
// 
//Input: "here"
//Output: "here"
// 
//
// 
// Example 3: 
//
// 
//Input: "LOVELY"
//Output: "lovely"
// 
// 
// 
// Related Topics String

object ToLowerCase {

    def main(args: Array[String]): Unit = {
        // Solution.methodName()
        val solution = Solution
        println(solution.toLowerCase("Hello"))
    }
    
    

//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def toLowerCase(str: String): String = {
        str.toLowerCase()
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}