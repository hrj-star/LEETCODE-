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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return root;
        }
        
        if(val == root.val){
           return root;
        }
        else if(val < root.val){
            return searchBST(root.left , val);
        }
        else{
            return searchBST(root.right , val);
        }
        
    }
}

/*


Complexity Analysis :
------------------------------

TC : O(logn) - best case , O(n) / O(h) - worst case 
SC : O(h) - recursion stack

*/


// Iterative

class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return root;
    }

    while (root != null && root.val != val) {
      if (val < root.val) {
        root = root.left;
      } else {
        root = root.right;
      }
    }
    return root;
  }
}

/*


Complexity Analysis :
------------------------------

TC : O(logn) - best case , O(n) / O(h) - worst case 
SC : O(1)
*/