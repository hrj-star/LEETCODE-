
// Recursive Solution - Converting to bottom up DP (looking for trivial solutions then going up ) , memoized dp , storing previous answers so that it doesnt compute again.

/*
0 : 1 [0] 
1 : 1 [1]  
2 : 2 [1,1] ,[2]
3 : 3 [1,1,1] ,[1,2],[2,1]  i.e (2+1=3) 
4 : 5 [1,1,1,1],[1,2,1],[2,1,1],[2,2],[2,1,1]  add previous two ways : (3+2) = 5

and so on 



count[n] =count[n-1]+count[n-2];
*/



class DpSolution {
    public int climbStairs(int n) {
        int[] dp = new int [n+1];  // 0 to n
        dp[0]=1;
        dp[1]=1;
       for(int i=2 ; i<=n ;i++){
           dp[i] = dp[i-1] + dp[i-2];
       }
        
        return dp[n];  // last element will store the final answer 
          
    }
}


/* Complexity Analysis :
    
   TC : O(N) 
   SC : O(N)   : Dp array
   
   
   
   Verdict : Runtime: 0 ms, faster than 100.00% of Java online submissions
   
   
 */
