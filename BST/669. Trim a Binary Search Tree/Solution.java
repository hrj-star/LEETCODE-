// https://leetcode.com/problems/trim-a-binary-search-tree/
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
traverse in inorder - root , left , right fashion , if current root's value is within [low , high] , then recurse and attach returned left subtree to its left and right subtree to its right . 
Else if current root's value is less than low , then all its left subtree will also be less , recur right . Else if current root's value is  greater than high , then recur right as root + all right subtrees values needs to be discarded.

*/
class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return null;
        }
        
        if(root.val >= low && root.val <= high){
            root.left = trimBST(root.left,low,high);
            root.right = trimBST(root.right,low,high);
           
        }
        else if(root.val < low){
            return trimBST(root.right,low,high);
        }
        else if(root.val > high){
            return trimBST(root.left,low,high);
        }
        
        return root;
    }
}

/*


Complexity Analysis :
------------------------------

TC : O(logn) - best case , O(n) / O(h) - worst case 
SC : O(h) - recursion stack

*/
