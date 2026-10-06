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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int ct =0;
         while(temp != null){
            ct++; temp = temp.next;
         }
         int size = ct;
         temp = head;
         int arr[] = new int[size]; int i=0;
         while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
         }
        int j= size-1;
        for(int k=0;k<size;k++){
            if(arr[k] != arr[j--]) return false;
        }
        return true;
    }
}