/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        
    
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        queue.add(null); // add null marker after each level
        
        while(!queue.isEmpty()){
            Node curr = queue.peek();
            
            queue.remove(curr);
            
            if(curr == null && !queue.isEmpty()){
                queue.add(null);
         
            }
             else if (curr != null){
                 curr.next = queue.peek();
                if(curr.left != null){
                    queue.add(curr.left);
                }
                
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
        return root;
    }
}


/*
TC : O(n) -- traversing all nodes level by level
SC : O(n) -- queue

To-do : recursion
*/