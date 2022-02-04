class Optimized {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
            
        }

        // maintain min seen so far , maintain profit so as to maximize it by taking maximum of current vs current price - min

        int profit=0;
        int max=0,min =Integer.MAX_VALUE;  // want to find min
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
                min=prices[i];
            else 
                max=Math.max(max,prices[i]-min);
            } 
        return max;
        
    }
}


/*


Complexity Analysis

Time complexity : O(n). Only a single pass is needed.

Space complexity : O(1). Only two variables are used.

*/
