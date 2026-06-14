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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        while( temp.next != null  ){
            if( temp.val == temp.next.val){
                ListNode temp2 = temp.next;
                while(temp2.next != null && temp2.val == temp2.next.val){
                    temp2 = temp2.next;
                }
                temp.next = temp2.next;
            }
            if(temp.next != null ){
                temp = temp.next;
            }
        }
        return head;
    }
}
