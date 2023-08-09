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

// rearrange same treenode , not to create new linkedlist.
class Solution {
    
    TreeNode previous = null;
    public void flatten(TreeNode root) {
        // go pre-order
     
        if(root == null){
            return;
        }
        
        flatten(root.right);
        flatten(root.left);
        
        
        root.right = previous;
        root.left = null;
        
        previous = root;
    }
}

/*
TC : O(n)
SC : O(n)
*/


class Solution {
    public void flatten(TreeNode root) {
        
        // base case
        if(root == null){
            return;
        }
        
        // get left and right nodes
        
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        
        root.left = null;
        
        flatten(leftNode);
        flatten(rightNode);
        
        // attach left to roots right
        
        root.right = leftNode;
        
        // get last rightnode
        
        TreeNode curr = root;
        
        while(curr.right != null){
            curr = curr.right;
        }
        
        // attach right after rightnodes in line
        
        curr.right = rightNode;
        
    }
}

/*
TC : O(n)
SC : Recursion space
*/


// Morris traversal - optimized
// Go to left , then it its not null , go till rightmost node (4) , connects this nodes right to roots right tree (4 --> 5 --> 6) , now make roots left to null to break link and make left subtree as roots right . Continue traversal by assigning root = root.right
class Solution {
    public void flatten(TreeNode root) {
        
        // base case
        if(root == null){
            return;
        }
        
        while(root != null){
            if(root.left != null){

                TreeNode leftNode = root.left;
                
                TreeNode current = leftNode;
                
                while(current.right != null){
                    current = current.right;
                }
                
                current.right = root.right;
                root.left = null;
                
                root.right = leftNode;
                
            }
            
            root = root.right;
        }   
    }
}

/*
TC : O(n)
SC : O(1)
*/