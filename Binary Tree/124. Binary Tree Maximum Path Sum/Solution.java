// https://leetcode.com/problems/binary-tree-maximum-path-sum/

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


/*
1. if null return 0 to its parent.
Traverse PostOrder - Left , Right , Root
2. Compute max of ((left,right), root) 
3. Compute Sum of left , right , root , if left or right child returns negative , then bound it to 0 as adding them would only lower the sum.
*/

class Solution {
    
    private int maxPathSum = Integer.MIN_VALUE; // as -1000 <= Node.val <= 1000
    
    public int maxPathSum(TreeNode root) {
        
        postorder(root);
        
        return maxPathSum;
    }
    
    private int postorder(TreeNode root){
        
         if(root == null){
             return 0;
        }
        
        int left = Math.max(postorder(root.left) , 0); // if -ves , max will be 0
        
        int right = Math.max(postorder(root.right) , 0); // if -ves , max will be 0
        
        maxPathSum = Math.max(maxPathSum , left + right + root.val);
        
        return Math.max(left , right) + root.val;
    }
}


/*
TC : O(n)
SC : O(h)
*/