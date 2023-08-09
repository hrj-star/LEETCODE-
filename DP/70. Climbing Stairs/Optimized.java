
// TC : O(N)  , SC : O(1) -just use variables for storing instead of array - Most optimized 

/*
0 : 1 [0] 
1 : 1 [1]  
2 : 2 [1,1] ,[2]
3 : 3 [1,1,1] ,[1,2],[2,1]  i.e (2+1=3) 
4 : 5 [1,1,1,1],[1,2,1],[2,1,1],[2,2],[2,1,1]  add previous two ways : (3+2) = 5

and so on 



count[n] =count[n-1]+count[n-2];
*/



class Optimized {
    public int climbStairs(int n) {
        int first=1,second=1;   // first for zeroth , second for oneth
        int ans=0;  // for storing answers
        
        // Fibonacci series space optimization technique.
        
        for(int i=2 ; i<=n ; i++){
            ans = first + second;
            first = second;
            second = ans;   // second var has answer stored
        }
        return second; 
   
    }
}


/* Complexity Analysis :
    
   TC : O(N) 
   SC : O(1)   : constant space by  variables.
   
   
   Verdict : Runtime: 0 ms, faster than 100.00% of Java online submissions
   
   
 */
