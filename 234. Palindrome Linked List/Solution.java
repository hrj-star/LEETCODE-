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
    public boolean isPalindrome(ListNode head) {
        
         // get middle
		ListNode slow = head;
		ListNode fast = head;

		while(fast != null && fast.next!= null){
			slow = slow.next;
			fast = fast.next.next;
		}
		// got middle at slow , assign to curr 
		// reverse from curr / middle to end
		ListNode curr = slow;
		ListNode prev = null;
		while(curr != null){
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev =  curr;
			curr = nextNode;
		}

		// now prev pointing to last .  (fast/head) 1 -> 2 -> 3 <- 2 <- 1 (prev)
		//                                				      ⬇								
		//                                        			 null

		fast = head;
		while(prev != null){
			if(fast.val != prev.val){
				return false;
			}
			fast = fast.next;
			prev = prev.next;
		}
		return true;
        
    }
}


/*

Complexity Analysis :
-----------------------
TC : O(N)
SC : O(1)

*/