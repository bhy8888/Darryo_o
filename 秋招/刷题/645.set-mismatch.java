/*
 * @lc app=leetcode.cn id=645 lang=java
 * @lcpr version=30204
 *
 * [645] 错误的集合
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n+1];
        for(int x: nums){
            newNums[x] ++;
        }
        int[] ans = new int[2];
        for(int i = 1; i <= n; i++){
            if(newNums[i] == 0) ans[1] = i;
            if(newNums[i] == 2) ans[0] = i;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

 */

