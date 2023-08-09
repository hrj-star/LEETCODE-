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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
      
        if(root == null){
            return 0;  
        }
        
         int currVal = root.val;
        
         if(currVal < low){ // if the value is less than the low, then we need to move right
            return rangeSumBST(root.right , low , high);
        }
        
        else if(currVal > high){ // if the value is more than the high, then we need to move left
             return rangeSumBST(root.left , low , high);
        }
        else{
            return root.val + rangeSumBST(root.left , low , high) + rangeSumBST(root.right, low , high);
        }
    }
}

/*

TC : O(n) - n denotes number of nodes
SC : O(n) - recursion stack

Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
Memory Usage: 66.7 MB, less than 37.29% of Java online submissions for Range Sum of BST.

*/