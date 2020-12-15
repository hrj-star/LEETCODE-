
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

// Iterative solution

class Iterative {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        
        return prev;
    }
}

/*

Complexity Analysis : 

TC : O(N)
Aux SC : O(1)

Verdict : Runtime: 0 ms, faster than 100.00% of Java online submissions

*/

