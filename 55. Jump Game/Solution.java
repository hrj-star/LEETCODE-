class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reachable = 0; // keep the track of max index reachable currently - apply greedy approach
        
        for(int i=0 ; i<n ; i++){
            if(i > reachable){
                return false;
            }
            reachable = Math.max(reachable , i + nums[i]);
        }
        return true;
    }
}

/*

Complexity Analysis :
-----------------------

TC : O(n)
SC : O(1)


Verdict :
-----------------------
Runtime: 3 ms, faster than 54.62% of Java online submissions for Jump Game.
Memory Usage: 63.9 MB, less than 26.67% of Java online submissions for Jump Game.


Follow - Up :
-----------------------
https://leetcode.com/problems/jump-game-ii/

*/
