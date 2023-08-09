// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
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
    public ListNode swapNodes(ListNode head, int k) {
        
        // find length of linkedlist
        
        int length = 0;
        ListNode temp = head;
        
        while(temp != null){
            length++;
            temp = temp.next;
        }
        // 2 traversals - 1 - k , 2 - n-k
        
        ListNode fromLeft = head;
        
        for(int i=1 ; i<k ; i++){
            fromLeft = fromLeft.next;
        }
       // System.out.println(fromLeft.val);
        
        ListNode fromRight = head;
        
        for(int i=1 ; i<length-k + 1; i++){ // 5 - 2 + 1 , 4 is at 4th pos
            fromRight = fromRight.next;
        }
       // System.out.println(fromRight.val);
         int  tempSwap = fromLeft.val;
         fromLeft.val = fromRight.val;
         fromRight.val = tempSwap;
        
        return head;
        
    }
}


/*
TC : O(n) - 2 traversals - O(k), O(n-k)
SC : O(1)
*/