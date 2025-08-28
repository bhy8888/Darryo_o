/*
 * @lc app=leetcode.cn id=4 lang=java
 * @lcpr version=30204
 *
 * [4] 寻找两个正序数组的中位数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        if ((total & 1) == 1) {
            // 奇数：找第 (total+1)/2 小
            return kth(nums1, nums2, (total + 1) / 2);
        } else {
            // 偶数：找第 total/2 和 第 total/2+1 小，取平均
            double left  = kth(nums1, nums2, total / 2);
            double right = kth(nums1, nums2, total / 2 + 1);
            return (left + right) / 2.0;
        }
    }

    // 返回两个有序数组的第 k 小（k 从 1 开始计数）
    private double kth(int[] A, int[] B, int k) {
        int i = 0, j = 0; // A、B 当前起点
        int m = A.length, n = B.length;

        while (true) {
            // 边界：某个数组已空，直接在另一个里取第 k 个
            if (i == m) return B[j + k - 1];
            if (j == n) return A[i + k - 1];
            if (k == 1) return Math.min(A[i], B[j]);

            // 计算本轮要比较的“第 k/2 个候选”
            int half = k / 2;
            int newI = Math.min(i + half, m) - 1; // A 的候选下标
            int newJ = Math.min(j + half, n) - 1; // B 的候选下标

            int pivotA = A[newI];
            int pivotB = B[newJ];

            if (pivotA <= pivotB) {
                // 丢弃 A[i..newI] 共 (newI - i + 1) 个元素
                k -= (newI - i + 1);
                i = newI + 1;
            } else {
                // 丢弃 B[j..newJ]
                k -= (newJ - j + 1);
                j = newJ + 1;
            }
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3]\n[2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[3,4]\n
// @lcpr case=end

 */

