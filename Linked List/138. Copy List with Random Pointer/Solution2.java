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
use Map data structure to create mapping of old & new copy nodes which holds old nodes as keys and new nodes as its values. 

*/

class Solution2 {
    public Node copyRandomList(Node head) {
        
        // base case
        if(head == null){
            return null;
        }
        
        // use map to create mapping of old & new copy nodes which holds old nodes as keys and new nodes as its values. 
        
        Map<Node , Node> map = new HashMap<>();
        Node curr = head;
        
        while(curr != null){
            map.put(curr , new Node(curr.val));
            curr = curr.next; // move curr forward
        }
        
        // now that copy nodes values are put inside map , store random and next pointers too
        
        for(Node old : map.keySet()){
            Node copy = map.get(old); // as old is key , we get copy node as its value
            copy.next = map.get(old.next); // set copy's next pointer
            copy.random = map.get(old.random);
        }
        
        return map.get(head); // copy node head starts as value of map.get(head)
    }
}

/*

TC : O(n) - traversing and putting in map
SC : O(n) - uses map

Runtime: 1 ms, faster than 41.95% of Java online submissions for Copy List with Random Pointer.
Memory Usage: 46.4 MB, less than 6.79% of Java online submissions for Copy List with Random Pointer.

*/