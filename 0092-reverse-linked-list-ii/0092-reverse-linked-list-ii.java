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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int ct =0; ListNode temp = head; ListNode prev;
         
        while(temp!=null){
            ct ++;
           temp = temp.next;
        }
        int size = ct; int i=0;
        int arr[] = new int[size];
        temp = head;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
           int res[] = new int[size]; int k=0;
        for(int j=0;j<left-1;j++){
            res[k++] = arr[j];
        }
         for(int j=right-1;j>=left-1;j--){
            res[k++] = arr[j];
        }
         for(int j=right;j<size;j++){
            res[k++] = arr[j];
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int j=0;j<size;j++){
            curr.next = new ListNode(res[j]);
            curr = curr.next;
        }
        return dummy.next;


    }
}