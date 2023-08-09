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
        ListNode fast = head;
        ListNode slow = head;
        
        // Implementing Floyd's Cycle Hare-Tortoise algo 
        // fast - move by 2 jumps , slow by 1 jump . If they meet , cycle exists else fast will reach till end 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

/*

Complexity Analysis :
-----------------------------------

TC : O(n) // single traversal
SC : O(1) // constant space


Verdict :
-----------------------------------

Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
Memory Usage: 43.1 MB, less than 72.99% of Java online submissions for Linked List Cycle

*/