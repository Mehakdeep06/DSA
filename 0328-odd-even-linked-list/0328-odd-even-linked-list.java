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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        int ct =0;
        while(temp != null){
            ct++;
            temp = temp.next;
        }
        int size = ct;
        int arr[] = new int[size];
        temp = head;
        int k = 1; int i=0;
        while(temp != null){
            if(k%2!=0){
                arr[i++] = temp.val;
            }
            k++;
            temp = temp.next;
        } int j=1; temp = head;
         while(temp != null){
            if(j%2==0){
                arr[i++] = temp.val;
            }
            j++;
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        for(int m=0;m<size;m++){
            res.next = new ListNode(arr[m]);
            res = res.next; 
        }
        return dummy.next;

    }
}