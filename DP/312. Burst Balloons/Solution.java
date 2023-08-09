// need some optimization , either to find min or max , and entire range of balloons is the larger problem , and smaller range of balloons is smaller problem ==> Applying DP

class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j+i < n ; j++){
                int k = j+i;
                
                for(int range = j ; range <= k ; range++){
                    int leftBoundary = j == 0 ? 1 : nums[j - 1]; // given
                    int rightBoundary = k == n-1 ? 1 : nums[k + 1]; // given
                    
                    int left = range == j ? 0 : dp[j][range - 1]; // if 1st
                    int right = range == k ? 0 : dp[range + 1][k]; // if last
                    
                    dp[j][k] = Math.max(dp[j][k] , leftBoundary * nums[range] * rightBoundary + left + right);
                }
            }
        }
        return dp[0][n-1];
    }
}



/*

Complexity Analysis :
------------------------------

TC : O(n^3) -> 3 loops
SC : O(n^2) -> 2D DP array


Verdict :
-------------------------------

Runtime: 74 ms, faster than 95.91% of Java online submissions for Burst Balloons.
Memory Usage: 41.6 MB, less than 5.13% of Java online submissions for Burst Balloons.


*/