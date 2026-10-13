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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode sec = head;
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            size++; temp = temp.next;
        }
        temp = head; int cout =0;
         while(temp!=null){
            cout++;
            if(cout == k){
                first = temp;
            }
            if(cout == size-k+1){
                sec = temp;
            }
             temp = temp.next;

        }
       
         
         int temp1 = first.val;
         first.val = sec.val;
         sec.val = temp1;

        return head;

    }
}