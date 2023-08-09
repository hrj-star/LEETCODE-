// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0,head); // dummy's next is head
        
        ListNode slow = dummy;
        ListNode fast = head;
    
        
        if(head == null){
            return null;
        } 
        
        for(int i = 0 ; i < n ; i++){
            fast = fast.next;
        }
        
       
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        
        
        slow.next = slow.next.next;
        
        // return slow - gives nth node from end
        return dummy.next;
    }
}

/*

TC : O(n)
SC : O(1)

*/