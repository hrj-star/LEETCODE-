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
class Recursive {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        // if tree is empty , insert new node and make it the root node
        if(root == null)
            return new TreeNode(val);
   
        // recursive approach
        
        if(root.val <= val){
            root.right =  insertIntoBST(root.right,val);
        }
        else{
            root.left =  insertIntoBST(root.left,val);
        }
        
        return root;
    }
}

/*

Complexity Analysis :
------------------------------

TC : O(logn) - best case , O(n) / O(h) - worst case 
SC : O(h) - recursion stack

Verdict :
------------------------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
Memory Usage: 51.8 MB, less than 6.75% of Java online submissions for Insert into a Binary Search Tree.
*/