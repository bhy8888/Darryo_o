/*
 * @lc app=leetcode.cn id=628 lang=java
 * @lcpr version=30204
 *
 * [628] 三个数的最大乘积
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(
            nums[len-1] * nums[len-2] * nums[len-3],
            nums[0] * nums[1] * nums[len-1] 
        );
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [-1,-2,-3]\n
// @lcpr case=end

 */

