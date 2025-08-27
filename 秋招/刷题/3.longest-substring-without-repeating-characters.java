/*
 * @lc app=leetcode.cn id=3 lang=java
 * @lcpr version=30204
 *
 * [3] 无重复字符的最长子串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length(), left = 0;
        int ans = 0;
        for(int right = 0; right < n; right ++){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c)+1);
            }
            map.put(c, right);
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcabcbb"\n
// @lcpr case=end

// @lcpr case=start
// "bbbbb"\n
// @lcpr case=end

// @lcpr case=start
// "pwwkew"\n
// @lcpr case=end

 */

