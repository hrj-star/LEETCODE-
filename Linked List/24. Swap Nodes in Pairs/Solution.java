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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1); // dummy node at start
        dummy.next = head;
        ListNode prev  = dummy;
        
        while(prev.next != null && prev.next.next != null){
            // initialize
            ListNode current = prev.next;
            ListNode forward = current.next;
            ListNode temp = forward.next;
            
            // compute pointers
            prev.next = forward;
            forward.next = current;
            current.next = temp;
            

            prev = current;
                 
        }
        return dummy.next; // return head
    }
}


/*
Complexity Analysis :
----------------------

TC : O(n)
SC : O(1)


Verdict :
-----------------------

Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
Memory Usage: 42.3 MB, less than 5.51% of Java online submissions for Swap Nodes in Pairs.


*/