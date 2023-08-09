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

https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

1. Insert the middle element in tree as it is root and left and right sub-tree would be equal to ensure minimal heights.

2. Insert left array elements to left subtree.

3. Insert right array elements to right subtree.

4. Recurse.
*/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createMinimalBST(nums , 0 , nums.length - 1);
    }
    
    private TreeNode createMinimalBST(int[] nums , int leftSubtree , int rightSubtree){
        
        // base case
        
        if(leftSubtree > rightSubtree){
            return null;
        }
        
        int mid = leftSubtree + (rightSubtree - leftSubtree)/2;
        TreeNode node = new TreeNode(nums[mid]); // assign mid as root 
        node.left = createMinimalBST(nums , leftSubtree , mid-1);
        node.right = createMinimalBST(nums , mid+1 , rightSubtree);
        return node;
    }
}

/*
TC : O(n)
SC : O(logn) - average , O(n) - worst
*/