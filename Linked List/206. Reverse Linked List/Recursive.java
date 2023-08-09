
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

// Recursive solution

class Recursive {
    public ListNode reverseList(ListNode head) {
        
       ListNode  first,rest;
        
        if(head==null){
            
            return head;
            
        }
        
        first = head ;       //  let first = {1,2,3}
        rest  = head.next ; // rest = {2,3}
        if(rest == null){
            return head;
        }
      
        rest = reverseList(rest) ; // recursively reverse rest , rest = {3,2}
            
        first.next.next = first; // first element at end
            
        first.next = null ;     //  first.next = null
        
        head = rest ; // reset head pointer
        
        return head;
    }
}

/*

Complexity Analysis : 

TC : O(N)
SC : O(N) - recursion stack

Verdict : Runtime: 0 ms, faster than 100.00% .

*/
