/*
 * @lc app=leetcode.cn id=495 lang=java
 * @lcpr version=30204
 *
 * [495] 提莫攻击
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0, last = -1;
        for(int s: timeSeries){
            int e = s + duration - 1;
            if(last < s){
                ans += duration;
            }else{
                ans += e - last;
            }
            last = e;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,4]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n2\n
// @lcpr case=end

 */

