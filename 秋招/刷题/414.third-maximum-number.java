/*
 * @lc app=leetcode.cn id=414 lang=java
 * @lcpr version=30204
 *
 * [414] 第三大的数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()<3){
            return list.get(list.size()-1);
        }else{
            return list.get(list.size()-3);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3, 2, 1]\n
// @lcpr case=end

// @lcpr case=start
// [1, 2]\n
// @lcpr case=end

// @lcpr case=start
// [2, 2, 3, 1]\n
// @lcpr case=end

 */

