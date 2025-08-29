/*
 * @lc app=leetcode.cn id=11 lang=java
 * @lcpr version=30204
 *
 * [11] 盛最多水的容器
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while(left < right){
            int w = right - left, h = Math.min(height[left], height[right]);
            int size = w * h;
            ans = Math.max(ans, size);
            if(height[left] >= height[right]){
                right --;
            } else{
                left ++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,8,6,2,5,4,8,3,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

 */

