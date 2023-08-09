class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices==null || prices.length==0){
            return 0;
            
        }
        
        int profit=0;
        int max=0;
        
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                
                profit=prices[j]-prices[i];
                max=Math.max(max,profit);
                
                }
            }
        
        return max;
        
    }
}


/*


Complexity Analysis : Brute force method :

Time complexity : O(n ^ 2). Two for loops run n(n-1)/2 times.

Space complexity : O(1). Only two variables are used - max and profit.

Verdict :
------------------
TLE

*/
