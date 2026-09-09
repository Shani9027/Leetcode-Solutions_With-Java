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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int countNode = 0 ;
        ListNode temp = head ;
        while(temp != null ){
            countNode++;
            temp = temp.next;
        }
        if( countNode == 1 ) return null;
        n = countNode - n + 1 ;
        if( n == 1 ) {  return head.next ; }
        
        temp = head ;
        while( n > 2 ){
            n--;
            temp = temp.next ;
        
        }
      
        temp.next = temp.next.next;
        return head;
    }
}