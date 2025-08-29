/*
 * @lc app=leetcode.cn id=5 lang=java
 * @lcpr version=30204
 *
 * [5] 最长回文子串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        // 动态规划
        int len = s.length();
        if(len < 2){
            return s;
        }
        char[] c = s.toCharArray();
        Boolean[][] dp = new Boolean[len][len];
        int maxLen = 1, begin = 0;
        for(int i = 0; i < len; i ++){
            dp[i][i] = true;
        }
        for(int j = 1; j < len; j++){
            for(int i = 0; i < j; i++){
                if(c[i] != c[j]){
                    dp[i][j] = false;
                } else {
                    if(j - i < 3){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                    
                }
                if(dp[i][j] && j-i+1 > maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);




    }
}
// @lc code=end



/*
// @lcpr case=start
// "babad"\n
// @lcpr case=end

// @lcpr case=start
// "cbbd"\n
// @lcpr case=end

 */

