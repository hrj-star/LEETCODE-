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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        // if tree is empty , insert new node and make it the root node
        if(root == null)
            return new TreeNode(val);
        
        TreeNode curr =  root; // temporary node - set to root and modify while traversing
        
        while(true){
             // new value is greater than curr node value
            if(curr.val <= val){
                // if right child is filled , make it curr node and traverse right
                if(curr.right != null){
                    curr = curr.right;
                }
               
                else{
                    // else insert the node with new value to curr's right
                    curr.right = new TreeNode(val);
                    break; 
                }
            }
             // new value is less than curr node value
            else{
                // new value is less than curr node value
                if(curr.val >= val){
                    // if left child is filled , make it curr node and traverse left
                    if(curr.left != null){
                        curr = curr.left;
                    }
                    
                    else{
                      // else insert the node with new value to curr's left
                        curr.left = new TreeNode(val);
                        break;
                    }
                }
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

Verdict :
------------------------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
Memory Usage: 51.5 MB, less than 16.64% of Java online submissions for Insert into a Binary Search Tree.
*/