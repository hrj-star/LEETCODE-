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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode oddList = head;
        ListNode evenList = head.next;
        ListNode evenHead = evenList;
        
        while(evenList != null && evenList.next != null){
            oddList.next = evenList.next;
            oddList = oddList.next;
            evenList.next = oddList.next;
            evenList = evenList.next;
        }
        oddList.next = evenHead;
        return head;
    }
}



/*

Verdict :
---------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
Memory Usage: 38.5 MB, less than 78.92% of Java online submissions for Odd Even Linked List.

Complexity Analysis :
---------------------------

TC : O(n)
SC : O(1)

*/