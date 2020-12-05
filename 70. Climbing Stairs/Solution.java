
// Resursive Solution 

/*
0 : 1 [0] 
1 : 1 [1]  
2 : 2 [1,1] ,[2]
3 : 3 [1,1,1] ,[1,2],[2,1]  i.e (2+1=3) 
4 : 5 [1,1,1,1],[1,2,1],[2,1,1],[2,2],[2,1,1]  add previous two ways : (3+2) = 5

and so on 



count[n] =count[n-1]+count[n-2];
*/


class Solution {
    public int climbStairs(int n) {
       if (n==0 || n==1)
            return 1;
        else
            return climbStairs(n-1) + climbStairs(n-2);

        
       
            
        
    }
}



/* Complexity Analysis :
    
   TC : O(2^n) : exponential - as two step problem 
   SC : O(1)   : constant space (?)
   
   
   
   Verdict : TLE for larger input as recursive calls are made.
   
   
