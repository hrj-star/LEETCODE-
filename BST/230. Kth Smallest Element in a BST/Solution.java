// https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    List<Integer> sortedList = new ArrayList<>();
    
    public int kthSmallest(TreeNode root, int k) {
       inOrder(root);
       return sortedList.get(k-1);
    }
    
    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        sortedList.add(root.val);
        inOrder(root.right);
          
    }
}

/*

TC : O(logn) - best case , O(n) / O(h) - worst case 
SC : O(n) + recursion stack

*/