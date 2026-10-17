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
    public boolean hasCycle(ListNode head) {
        //!st Method 
        // ListNode fast = head;
        //  ListNode slow = head;
        //  while(fast != null && fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        //     if(slow == fast) return true; 
        //  }
        //  return false;

        // 2nd Method
        // HashSet<ListNode> set = new HashSet<>();
        // while(temp != null ){
        //     temp = temp.next;
        //     if(set.contains(temp)) return true;
        //     set.add(temp);
        // }
        // return false;

        // 3rd Method:->
        ListNode temp =head;
        HashMap<ListNode,Integer> map  = new HashMap<>();
        while(temp!=null){
            map.put(temp,map.getOrDefault(temp,0)+1);
            if(map.get(temp) == 2) return true;
            temp = temp.next;
        }
        return false;


    }
}