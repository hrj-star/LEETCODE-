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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0,head); // dummy initialized with 0 and next as head
        ListNode prev = dummy ; // assign dummy to prev to preserve dummy at end 
        
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                // skip nodes equal to head
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                prev = prev.next;
            }
            // every case , move head
            head = head.next;
        }
        return dummy.next; // returns head
    }
}

/*
TC : O(n)
SC : O(1)
*/