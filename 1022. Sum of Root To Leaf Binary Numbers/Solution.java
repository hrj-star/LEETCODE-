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
 
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root,0);
        
    }
    
    int helper(TreeNode root , int currsum){
        
        // base case
        if(root == null){
            return 0;
        }
        
        // calculate currsum
        currsum = currsum * 2  + root.val;
        
        // if reached leaf node return currsum
        if(root.left == null && root.right == null){
            return currsum;
        }
        
        // else recur
        
        return helper(root.left,currsum) + helper(root.right,currsum);
    }
}


/*
Complexity Analysis :
----------------------------
TC : O(n) , n = number of nodes in the tree
SC : O(h) , h = height of tree / O(1) - aux


Verdict :
----------------------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Root To Leaf Binary Numbers.
Memory Usage: 39.7 MB, less than 15.88% of Java online submissions for Sum of Root To Leaf Binary Numbers.

*/
