
// TC = O(n)  , SC = O(n) - dp , find ans at min of last two positions

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp=new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
     
        
        for (int i=2;i<n;i++){
          dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
       
        }
        
        // if not swap , then answer is minimum of last two states
        
        return Math.min(dp[n-1],dp[n-2]);
        
        
        
    }
}



/*


1 100 1 1 1 100 1 1 100 1

min(1,100)=1

1) at   = 1 100 1  = 1+1=2
   dp[] = 1 100 2 
   
2) at   = 1 100 1 1 = 1+min(2,100)=3
   dp[] = 1 100 2 3
   
3) at   = 1 100 1 1 1 = 1+min(2,3)= 1+2 =3
   dp[] = 1 100 2 3 3
   
4) at   = 1 100 1 1 1 100 = 100+min(3,3)= 100+2 =102
   dp[] = 1 100 2 3 3 102
   
5) at   = 1 100 1 1 1 100 1= 1+min(102,3)= 1+3 =4
   dp[] = 1 100 2 3 3 102 4
   
6) at   = 1 100 1 1 1 100 1 1 = 1+min(102,4)= 1+4 =5
   dp[] = 1 100 2 3 3 102 4 5
   
7) at   = 1 100 1 1 1 100 1 1 100 = 100 + min(4,5)= 100+4 = 104
   dp[] = 1 100 2 3 3 102 4 5 104
   
   
8) at   = 1 100 1 1 1 100 1 1 100 1 = 1 +min (104,4)= 1 + 5  = 6
   dp[] = 1 100 2 3 3 102 4 5 104 6
   
   
   thus , ans = min(104,6) = 6 

