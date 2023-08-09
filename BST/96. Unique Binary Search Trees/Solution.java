// https://leetcode.com/problems/unique-binary-search-trees/

class Solution {
    public int numTrees(int n) {
        
        int[] dp = new int[n+1];
        
        dp[0] = dp[1] = 1;
        
        for(int level = 2 ; level <= n ; level++){
            for(int root =  1; root <= level ; root++){
                dp[level] += dp[root - 1] * dp[level - root]; // cartesian product of left and right sub-trees
            }
        }
        
        return dp[n];
    }
}

/*
TC : O(n^2)
SC : O(n)

Bottom - Up DP - Catalan Number logic


Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
Memory Usage: 40.9 MB, less than 35.74% of Java online submissions for Unique Binary Search Trees.
*/