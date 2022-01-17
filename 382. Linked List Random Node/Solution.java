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
    
    ArrayList<Integer>  arr = new ArrayList<>();
    
    public Solution(ListNode head) { // TC : O(N) , SC : O(N)
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        
    }
    
    public int getRandom() { // TC : O(1)
        return arr.get((int)(Math.random() * arr.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
 


 /*

 Complexity Analysis :
 -----------------------------

 TC : O(N)
 SC : O(N)


 Verdict : 
 -----------------------------

Runtime: 20 ms, faster than 20.09% of Java online submissions for Linked List Random Node.
Memory Usage: 47.4 MB, less than 11.01% of Java online submissions for Linked List Random Node.

*/