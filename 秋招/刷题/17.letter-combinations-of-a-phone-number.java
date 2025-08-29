/*
 * @lc app=leetcode.cn id=17 lang=java
 * @lcpr version=30204
 *
 * [17] 电话号码的字母组合
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] MAPPING = new String[]{
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public final List<String> ans = new ArrayList<>();
    private char[] digits;
    private char[] path;

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if(n == 0) return List.of();
        this.digits = digits.toCharArray();
        this.path = new char[n];
        dfs(0);
        return ans;
    }

    public void dfs(int i){
        if(digits.length == i){
            ans.add(new String(path));
            return;
        }
        for(char c: MAPPING[digits[i] - '0'].toCharArray()){
            path[i] = c;
            dfs(i+1);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "23"\n
// @lcpr case=end

// @lcpr case=start
// ""\n
// @lcpr case=end

// @lcpr case=start
// "2"\n
// @lcpr case=end

 */

