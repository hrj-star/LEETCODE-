class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        // traverse breadth - wise using Queue
        Queue<Integer> queue = new LinkedList<Integer>();
        
        // maintain boolean array to mark visited
        boolean[] visited = new boolean[n];
        
        // add start index into queue
        queue.offer(start);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                Integer head = queue.poll(); // remove top element
                if(arr[head] == 0){ // if element at the index is 0
                    return true;
                }
                
                if(!visited[head]){
                    int forwardJump = head  + arr[head];
                    if(forwardJump >= 0 && forwardJump < n){
                        queue.offer(forwardJump);
                    }
                    
                    int backJump = head  - arr[head];
                    if(backJump >= 0 && backJump < n){
                        queue.offer(backJump);
                    }
                    visited[head] = true; // mark current as  visited
                }
            }
        }
        
        return false;
    }
}



/*

Complexity Analysis :
-----------------------

TC : O(n) -- traversing visited array
SC : O(n) -- by using queue


Verdict :
-----------------------
Runtime: 17 ms, faster than 6.70% of Java online submissions for Jump Game III.
Memory Usage: 54 MB, less than 29.25% of Java online submissions for Jump Game III


Follow - Up :
-----------------------
https://leetcode.com/problems/jump-game-iv/

*/