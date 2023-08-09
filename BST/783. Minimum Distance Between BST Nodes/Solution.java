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

// traverse in InOrder - Left - Root - Right fashion

class Solution {
    Integer res = Integer.MAX_VALUE, pre = null;
    public int minDiffInBST(TreeNode root) {
        
         if (root.left != null){
             minDiffInBST(root.left);
         }
        
         if (pre != null){
             res = Math.min(res, root.val - pre);
         } 
        
         pre = root.val;
        
        
        
        if (root.right != null){      
            minDiffInBST(root.right);
        }
        
        return res;
    }
}

/*
Time complexity : O(n). 
Space complexity : O(h).

Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Distance Between BST Nodes.
Memory Usage: 40 MB, less than 59.53% of Java online submissions for Minimum Distance Between BST Nodes.

*/