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
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) { // if both have met together - cycle exists
                ListNode entry =  head; // start entry from start , move until entry =  slow , thats the node where cycle begins
                while(entry != slow){
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow; // or entry - any as they point to same node
            }
        }
        return null; // else return null
    }
}


/*

Complexity Analysis :
-----------------------------------

TC : O(n) // single traversal
SC : O(1) // constant space


Verdict :
-----------------------------------

Runtime: 1 ms, faster than 47.03% of Java online submissions for Linked List Cycle II.
Memory Usage: 40.5 MB, less than 45.40% of Java online submissions for Linked List Cycle II.
*/