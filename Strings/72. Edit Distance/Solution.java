// https://leetcode.com/problems/edit-distance/

class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m+1][n+1];
        
         // fill 1st column
        for(int i=1 ; i<=m ; i++){
            dp[i][0] = i; 
        }
        
        
        // fill 1st row
        for(int j=1 ; j<=n ; j++){
            dp[0][j] = j; 
        }
        
       
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){ // if ith == jth
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j-1] , Math.min(dp[i-1][j] , dp[i-1][j-1]));
                }
            }
        }
        
        return dp[m][n];
    }
}

/*
TC :  O(m.n) 
SC :  O(m.n) extra space, where m is the length of the first string and n is the length of the second string
*/