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
        ListNode res = new ListNode();
        res.next = null;
        int carry = 0;
        int result = 0;
        ListNode current = res;
        while (l1 != null || l2 != null) {
            if (l2 == null && l1 != null) {
                result = carry + l1.val;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                result = carry + l2.val;
                l2 = l2.next;
            } else {
                result = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = 0;
            if (result > 10) {
                carry = result / 10;
                result = result % 10;
            } else if (result == 10) {
                carry = 1;
                result = result % 10;
            }
            ListNode list = new ListNode(result);
            current.next = list;
            current = current.next;
        }
        if (carry == 1) {
            ListNode list = new ListNode(carry);
            current.next = list;
            current = current.next;
        }
        return res.next;
    }
}