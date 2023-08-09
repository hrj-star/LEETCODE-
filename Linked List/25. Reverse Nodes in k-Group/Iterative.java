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
    
    public void reverse(ListNode start , ListNode end){
        ListNode prev = null;
        ListNode current = start;
        ListNode next = start.next;
        while(prev != end){
            
           /// ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        // base case
        
        if(head == null || head.next == null || k <=1){
            return head;
        }
        
       // make dummy before head
        ListNode dummy = new ListNode(-1);
        
        dummy.next = head;
        
        ListNode beforeStart = dummy;
        ListNode end = head;
        
        int count = 0;
        
        while(end != null){
            count++;
            
            if(count % k == 0){ 
                ListNode start = beforeStart.next;
                ListNode nextToCurrLast = end.next; // eg : -1(beforeStart) 1(start) 2(end) 3(nextToCurrLast)
                
                reverse(start,end); //  -1 2 1 3
                
                beforeStart.next = end;
                start.next = nextToCurrLast;
                
                // set beforestart & end , start will be resetted by above  start = beforeStart.next
                
                beforeStart = start;
                end = nextToCurrLast;
                
            }
            
            else{
                end = end.next; //  move end ahead 
            }
            
        }
        
        return dummy.next; // head
    }
}

/*


TC :  O(n)
SC : O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Nodes in k-Group.
Memory Usage: 45.7 MB, less than 45.00% of Java online submissions for Reverse Nodes in k-Group.
*/