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
    public int pairSum(ListNode head) {
        if(head.next.next == null){
            return head.val + head.next.val;
        }
        ListNode slow = new ListNode(-1);
        slow.next = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reverse,current,nextNode;
        reverse = null;
        current = slow.next;
        nextNode = current.next;
        while(current != null){
            current.next = reverse ;
            reverse = current;
            current = nextNode;
            if(nextNode!=null)
            nextNode = nextNode.next;
        }
        int max = 0;
        while(reverse!=null){
            max = Math.max(head.val + reverse.val,max);
            head = head.next;
            reverse = reverse.next;
        }
        return max;
    }
}