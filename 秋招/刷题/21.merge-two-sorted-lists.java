/*
 * @lc app=leetcode.cn id=21 lang=java
 * @lcpr version=30204
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode(0, null);
        ListNode cur = dummy;
        while(list1!=null && list2!=null){
            int val1 = list1.val, val2 = list2.val;
            if(val1 <= val2){
                cur.next = list1;
                list1 = list1.next;
            } else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 == null){
            cur.next = list2;
        }
        if(list2 == null){
            cur.next = list1;
        }
        return dummy.next;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,4]\n[1,3,4]\n
// @lcpr case=end

// @lcpr case=start
// []\n[]\n
// @lcpr case=end

// @lcpr case=start
// []\n[0]\n
// @lcpr case=end

 */

