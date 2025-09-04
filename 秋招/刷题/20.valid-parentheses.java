/*
 * @lc app=leetcode.cn id=20 lang=java
 * @lcpr version=30204
 *
 * [20] 有效的括号
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Deque<Character> dq = new ArrayDeque<>();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            char x = c[i];
            if(x == '(' || x == '{' || x == '['){
                dq.push(x);
            } else {
                if(dq.isEmpty()){
                    return false;
                }
                if(x == ')'){
                    if(dq.pop() != '(') return false;
                }
                if(x == '}'){
                    if(dq.pop() != '{') return false;
                }
                if(x == ']'){
                    if(dq.pop() != '[') return false;
                }
            }
        }
        return dq.isEmpty();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "()"\n
// @lcpr case=end

// @lcpr case=start
// "()[]{}"\n
// @lcpr case=end

// @lcpr case=start
// "(]"\n
// @lcpr case=end

// @lcpr case=start
// "([])"\n
// @lcpr case=end

// @lcpr case=start
// "([)]"\n
// @lcpr case=end

 */                     

