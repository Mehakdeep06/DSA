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
        if (head == null || head.next == null) {
            return null;
        }
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            size++; temp = temp.next;
        }
        temp = head;
        int cout =0;
        while(temp != null){
            cout++;
            if(cout == size/2){
                temp.next = temp.next.next;
                
            }
            temp = temp.next;
        }
        return head;
     
    }
}