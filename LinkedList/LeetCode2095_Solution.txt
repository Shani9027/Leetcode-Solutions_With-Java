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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            head = null;
            return head;
        }
        ListNode temp = head;
         if(temp.next.next == null){
            temp.next = null;
            return head;
        }
        if(temp.next.next.next == null){
            temp.next = temp.next.next;
            return head;
        }
        ListNode temp2 = head;
        int count = 0;
        while(temp.next != null){
            temp = temp.next;
            count += 1;
        }
        if(count%2 == 0 ){
        count = (count/2)-1;
        }else if(count == 3){
            count = 1;
        }else{
        count = (count/2);
        }        
        for(int i = 0 ; i < count  ; i++){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;

        return head;
    }
}