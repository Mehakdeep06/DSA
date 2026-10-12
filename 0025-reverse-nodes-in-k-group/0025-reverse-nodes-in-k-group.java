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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int ct =0;
        while(temp!=null){
            ct++; temp = temp.next;
        }
        int size = ct;
        int arr[] = new int[size];
        temp = head;
        for(int i=0;i<size;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        for(int j=0;j+k<=size ; j+=k){
            int right = j+k-1;
            int left = j;
            while(right>left){
                int temp1 = arr[left];
                arr[left]  = arr[right];
                arr[right] = temp1;
                left++; right--;
            }

        }
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        for(int l=0;l<size;l++){
            res.next = new ListNode(arr[l]);
            res = res.next;
        }
        return dummy.next;

    }
}