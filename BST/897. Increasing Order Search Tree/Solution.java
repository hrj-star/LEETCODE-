// https://leetcode.com/problems/increasing-order-search-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Recursive :

class Solution {
    
    TreeNode head = null;
    TreeNode prev = null;
    
    public TreeNode increasingBST(TreeNode root) {
      
        if(root == null){
            return null;
        }
        
        
        increasingBST(root.left);
        
        
          
        // initially if head == null , assigned first popped as top
        if(head == null){
            head = root;
        }
        
        
        if(prev !=  null){
            root.left = null;
            prev.right = root;
        }
        
        
        
        prev = root;
        
        increasingBST(root.right);
            
        return head;
    }
}

/*


Complexity Analysis :
------------------------------

TC : O(logn) - best case , O(n) / O(h) - worst case 
SC : O(h) - recursion stack

*/

 // Iterative DFS
class Solution {
    public TreeNode increasingBST(TreeNode root) {
      
        
        TreeNode head = null;
        TreeNode prev = null;
        TreeNode curr = root;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(!stack.isEmpty() || curr != null){
            
            while(curr != null){
                
                stack.push(curr);
                curr = curr.left;  
                
            }// 1 (top) 5 
       
        
        TreeNode top = stack.pop();
        top.left = null;
        
        // initially if head == null , assigned first popped as top
        if(head == null){
            head = top;
        }
        
        if(prev !=  null){
            prev.right = top;
        }
        
        prev = top;
        curr = top.right;
            
         } 
        
        return head;
    }
}

/*
TC : O(n)
SC : O(n)
*/