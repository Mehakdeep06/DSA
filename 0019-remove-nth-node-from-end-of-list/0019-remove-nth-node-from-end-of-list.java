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

        
        ListNode temp = head;
        int ct=0;
        while(temp != null){
            ct++; temp = temp.next;
            
        }
        int size = ct;
         if (n == size) {
            return head.next;
        }
        int ptr =0;
        temp = head;
        while(temp != null){
            ptr ++;
            if(ptr ==  size-n){
               
                temp.next = temp.next.next;
            }
            
            temp = temp.next;
            }
        

        return head;

    }
}