// https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        
          if(root == null){
            return mainList;
        }
 
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> subList = new ArrayList<>(); // subList will be inside while loop as it is initialized at each level
            int size = queue.size();
            
            while(size --> 0){
                TreeNode curr = queue.remove();
                subList.add(curr.val);
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                
                if(curr.right != null){
                    queue.add(curr.right);
                }
               
            }
             mainList.add(subList);
        }
        
        return mainList;
    }
}

/*

TC : O(n) : n - total nodes in binary tree.

SC : O(L) - levels in queue.

*/