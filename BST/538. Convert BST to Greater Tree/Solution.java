// https://leetcode.com/problems/convert-bst-to-greater-tree/
// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

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

// Recursive 


class Solution {
    
    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        
        // as left subtrees would have less values , iterate to right and add values + root.value itself
        
        convertBST(root.right);
        
        sum += root.val;
        root.val = sum;
        
        // traverse the left subtree 
        
        convertBST(root.left);
        
        return root;
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
    
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        
   
        
        Stack<TreeNode> stack = new Stack<>();
        
        int sum = 0;
        
        TreeNode curr = root;
        
     
        while(!stack.isEmpty() || curr !=  null){
       
            
            while(curr != null ){
                stack.push(curr);     
                curr = curr.right;
            }
            
            curr = stack.pop();
            
            sum += curr.val;
            curr.val = sum;
            
            curr = curr.left;
            
        }
        
        return root;
    }
}


/*


Complexity Analysis :
------------------------------

TC : O(n) 
SC : O(n) -  stack

*/