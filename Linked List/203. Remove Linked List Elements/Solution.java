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
    public ListNode removeElements(ListNode head, int val) {
        
       
        ListNode dummy = new ListNode(0);
        
        dummy.next = head; // [0 (dummy) ,1 (head) ,2,6,3,4,5,6]
        
        ListNode prev = dummy , curr = head;
        
        while(curr != null){
            
            if(curr.val == val){ // at 6 ,  6 == 6 , yes , point 2's next to 6's next
                prev.next = curr.next;
            }
            
            else{
                prev = prev.next; // move prev ahead
            }
            
            curr = curr.next; // move curr ahead
        }
        
        return dummy.next; //returns  head
    }
}

/*
Complexity Analysis :
-----------------------------
TC : O(n)
SC : O(1)


*/


// similar approach without prev pointer

class Solution {
   public ListNode removeElements(ListNode head, int val) {
       
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while(cur.next != null) {
            
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            
            else{
                cur = cur.next;
            }    
        }
       
        return dummy.next;
    }
}