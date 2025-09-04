/*
 * @lc app=leetcode.cn id=485 lang=java
 * @lcpr version=30204
 *
 * [485] 最大连续 1 的个数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for(int x : nums){
            if(x == 1){
                count ++;
                ans = Math.max(ans, count);
            }else{
                count = 0;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,0,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,1,1,0,1]\n
// @lcpr case=end

 */

