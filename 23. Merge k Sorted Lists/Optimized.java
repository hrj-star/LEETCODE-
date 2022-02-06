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
    public ListNode mergeKLists(ListNode[] lists) {
        // base case 
        if(lists == null || lists.length == 0){
            return null;
        }
        
        return mergeKLists(lists,0,lists.length - 1);
    }
    
    private ListNode mergeKLists(ListNode[] lists , int left , int right){
        // if only one in list , return that
        
        if(left == right){
            return lists[left];
        }
        
        int mid = left + (right - left) / 2; // prevent overflow
        
        ListNode leftList = mergeKLists(lists,left,mid);
        ListNode rightList = mergeKLists(lists,mid + 1,right);
        
        return merge(leftList , rightList); 
    }
    
    private ListNode merge(ListNode l1 , ListNode l2){
        ListNode head = new ListNode(0); // initialize
        ListNode curr = head;
        
        while(l1 != null || l2 != null){
            if(l1 == null){
                curr.next = l2;
                l2 = l2.next;
            }
            else if(l2 == null){
                curr.next = l1;
                l1 = l1.next;
            }
            else if(l1.val  < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        return head.next ; // as currently curr is having dummy value 0
    }
}


/* 

Complexity Analysis :
-------------------------
TC : O(n * log(k)) // reducing lists at each level by k , k recursion levels and n = number of nodes when the nodes are merging together
SC : O(k) // k = recursive calls - takes stack space


Verdict :
--------------------------
Runtime: 1 ms, faster than 100.00% of Java online submissions for Merge k Sorted Lists.
Memory Usage: 44 MB, less than 54.84% of Java online submissions for Merge k Sorted Lists.

*/