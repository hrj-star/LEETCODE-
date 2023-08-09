/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

/*

Approach :
--------------------------

Without using  any map and ds

3 steps :
--------------------------

1. Create duplicates nodes -> 1 (curr) - 1(currNext) - 2 - 2 - 3 - 3 - 4 - 4 - null
2. Set Random pointers = set currNext.random = curr.random.next; 
3. Set node links - for original as well duplicates.

*/

class Solution {
    public Node copyRandomList(Node head) {
        
        // base case
        if(head == null){
            return null;
        }
        
        
        // create duplicate nodes
        
        Node original = head;
        while(original != null){
            Node originalNext = original.next;
            Node copy = new Node(original.val);
            copy.next = originalNext;
            original.next = copy;
            original = originalNext;
        }
        
        // set random pointers
        
        original = head;
        Node currOriginalNext = head.next;
        Node newHead = head.next;
        
        while(original != null && currOriginalNext != null){
            if(original.random != null){
                currOriginalNext.random = original.random.next;
            }
            original = currOriginalNext.next; // move original
            
            if(original != null){
                currOriginalNext = original.next; // move currOriginal
            }
        }
        
        // resetting next nodes to separate copy and original list - 1 -> 1 -> 2 -> 2 -> 3 -> 3 -> null
        
        Node copyHead = head;
        Node copyHeadNext = head.next;
        
        while(copyHead != null){
            copyHead.next = copyHeadNext.next; // connect first 1 to first 2
            copyHead = copyHead.next; // move forward to 2
            
            if(copyHead != null){
                copyHeadNext.next = copyHead.next; // connect second 1 to first 2's next
                copyHeadNext = copyHead.next; // set copyHeadNext to 2's next i.e , second 2 will be new copyHeadNext

            }  
        }
            
        return newHead;
    }
}

/*

TC : O(n) -- iterating through entire list
SC : O(n) -- creating n new copy nodes

Runtime: 0 ms, faster than 100.00% of Java online submissions for Copy List with Random Pointer.
Memory Usage: 46.8 MB, less than 6.79% of Java online submissions for Copy List with Random Pointer.


*/