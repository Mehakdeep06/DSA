/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     //if(head.next.next== null || head.next == null)   return head;
     ListNode temp = head;
     HashMap<ListNode,Integer> map = new HashMap<>();
     while(temp!=null){
        if(map.containsKey(temp)){
            return temp;
        }
        map.put(temp,0);
        temp = temp.next;
     }
     return null;
    }
}