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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int arr[] = new int[size];
        temp = head;
        for(int j =0;j<size;j++){
            arr[j] = temp.val;
            temp = temp.next;
        }
        int ans[] = new int[size];
        Stack<Integer> st = new Stack<>();
        for(int i=size-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}