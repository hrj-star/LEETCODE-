class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        
        // some base cases
        
        if(n == 1){
            return 0;
        }
        
        int reachable = 0; // keep the track of max index reachable currently - apply greedy approach
        int jumps = 0;
        int currReach = 0;
        
        for(int i=0; i<n-1; i++){
            reachable = Math.max(reachable , i + nums[i]);
            if(i >= currReach){
                jumps++;
                currReach = reachable;
            }
        }
        return jumps;
    }
}

/*

Complexity Analysis :
-----------------------

TC : O(n)
SC : O(1)


Verdict :
-----------------------
Runtime: 2 ms, faster than 64.58% of Java online submissions for Jump Game II.
Memory Usage: 46.5 MB, less than 13.19% of Java online submissions for Jump Game II.


Follow - Up :
-----------------------
https://leetcode.com/problems/jump-game-iii/

*/