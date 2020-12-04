class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
            
        }
        int max_profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                max_profit+=prices[i+1]-prices[i];
            }
        }
        return max_profit;
        
    }
}

/*

Complexity Analysis :

O(N) - TC as traversing array in Single pass.
O(1) - SC as no extra space , constant space - max_profit variable .

