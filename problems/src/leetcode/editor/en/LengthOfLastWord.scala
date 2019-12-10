//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string. 
//
// If the last word does not exist, return 0. 
//
// Note: A word is defined as a character sequence consists of non-space characters only. 
//
// Example: 
//
// 
//Input: "Hello World"
//Output: 5
// 
//
// 
// Related Topics String

object LengthOfLastWord {

    def main(args: Array[String]): Unit = {
        // Solution.methodName()
        val solution = Solution
        val length = solution.lengthOfLastWord("Hello World")
        println(length)
    }
    
    

//leetcode submit region begin(Prohibit modification and deletion)
object Solution {
    def lengthOfLastWord(s: String): Int = {
            s.trim.split(" ").last.length
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}