/*
 * @lc app=leetcode.cn id=697 lang=java
 * @lcpr version=30204
 *
 * [697] 数组的度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    int N = 50000;
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[N];
        int[] first = new int[N], last = new int[N];
        Arrays.fill(first, -1);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            max = Math.max(max, ++cnt[t]);
            if (first[t] == -1) first[t] = i;
            last[t] = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            if (cnt[t] == max) ans = Math.min(ans, last[t] - first[t] + 1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2,3,1,4,2]\n
// @lcpr case=end

 */

