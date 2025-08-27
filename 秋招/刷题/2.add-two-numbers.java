/*
 * @lc app=leetcode.cn id=2 lang=java
 * @lcpr version=30204
 *
 * [2] 两数相加
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwo(l1, l2, 0);
    }

    // 创造新节点
    public ListNode addTwo(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }

        int sum = carry;
        if(l1 != null){
            sum += l1.val;
            l1 = l1.next;
        }

        if(l2 != null){
            sum += l2.val;
            l2 = l2.next;
        }

        return new ListNode(sum % 10, addTwo(l1, l2, sum/10));
    }

    // 迭代做法
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null || l2 != null || carry != 0){
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 !=null ? l2.val : 0;
            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            cur.next = new ListNode(val);
            cur = cur.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 !=null ? l2.next : null;
        }
        return dummy.next;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,4,3]\n[5,6,4]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n[0]\n
// @lcpr case=end

// @lcpr case=start
// [9,9,9,9,9,9,9]\n[9,9,9,9]\n
// @lcpr case=end

 */

