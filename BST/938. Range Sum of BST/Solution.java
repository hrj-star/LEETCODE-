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
        
        int sum = 0;
        
        // Iterative BFS approach
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            TreeNode curr = queue.poll();
            int currVal = curr.val;
            
            if(currVal >= low && currVal <= high){
                sum += currVal;
            }
            
            if(curr.left != null){
                queue.add(curr.left);
            }
            
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
        return sum;
    }
}

/*

TC : O(n) - n denotes number of nodes
SC : O(n) - as queue used
*/