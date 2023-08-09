// https://leetcode.com/problems/reverse-nodes-in-k-group/

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
class Recursive {
    public ListNode reverseKGroup(ListNode head, int k) {
        // base case
        
        if(head == null || head.next == null || k <=1){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head;

        
        for(int i=0 ; i<k ; i++){ // compute if k-group exits
            
            if(temp == null){
                return head;
            }
            
            temp = temp.next;
        }
        
        // reverse k group
        
         for(int i=0 ; i<k ; i++){
            temp = curr.next ; // hold curr.next to not lose it
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
         
        head.next = reverseKGroup(curr,k);
        
        return prev;
    }
}

/*


TC :  O(n)
SC : Recursion space O(n/k) else Constant

Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in k-Group.
Memory Usage: 45.7 MB, less than 45.00% of Java online submissions for Reverse Nodes in k-Group.
*/