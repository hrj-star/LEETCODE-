// https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        // replacing nodes , instead of deleting 
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}

/*
Complexity Analysis :
-----------------------------
TC : O(n)
SC : O(1)


*/