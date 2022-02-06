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
        
        ArrayList<Integer> al = new ArrayList<>();
        
        // putting elements from list in arraylist -> O(n)
        for(ListNode list : lists){
            while(list != null){
                al.add(list.val);
                list = list.next;
            }
        }
        
        // sorting arraylist -> O(nlogn)
        Collections.sort(al);
        
        // putting elements back to linked-lists to return it -> O(n)
        
        if(al.size() == 0){
            return null;
        }
        if(al.size() == 1){
            return new ListNode(al.get(0));
        }
        
        ListNode head = new ListNode(al.get(0));
        ListNode curr = head;
        
        for(int i = 1 ; i < al.size() ; i++){
            curr.next = new ListNode(al.get(i));
            curr = curr.next;
        }
        
        return head;
    }
}


/* 

Complexity Analysis :
-------------------------
TC : O(nlogn) // put , sort , put back
SC : O(n) // maintaining arraylist


Verdict :
--------------------------
Runtime: 12 ms, faster than 30.16% of Java online submissions for Merge k Sorted Lists.
Memory Usage: 48 MB, less than 5.33% of Java online submissions for Merge k Sorted Lists.

*/