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
    public ListNode rotateRight(ListNode head, int k) {
        
        // base case -  if head is null or k == 0 , return null / head
        
        if(head == null || head.next == null || k == 0){
            return head;
        }
        
        ListNode tail = head; // initialize tail as head - as first element of the list
        
        // keep track of length of list
        
        int n = 1; // initialize to 1 as after passing the above base condition , list would have atleast 1 node
        
        while(tail.next != null){ // keep iterating till end of list
            tail = tail.next;
            n++;
        }
        
        tail.next = head; // to make circle
        
        k = k % n; // for rotate formula
        
        
        int rotatePoint = n - k; // formula : length - k % length gives rotate point - eg : 1 2 3 4 5 , k = 2 , we put last k elements at first and 5 - 2 = 3 , after 1 , 2 , 3 , we need to rotate list
        
        // reach till  rotatePoint (here 3rd element)
        
        for(int i = 0 ; i < rotatePoint ; i++){
            tail = tail.next;
        }
        
        head = tail.next; // point tail's next to head -- here head = 3
        tail.next = null; // here 3.next = null
        
        return head; // return list - new head        
    }
}

/*

TC : O(n) - n - number of nodes
SC : O(1) - constant space

Runtime: 1 ms, faster than 75.83% of Java online submissions for Rotate List.
Memory Usage: 43.2 MB, less than 31.88% of Java online submissions for Rotate List.

*/