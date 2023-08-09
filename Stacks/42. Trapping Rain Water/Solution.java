// https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        
        
        // find maxLeft from left for each indexes
        
        int n = height.length;
        
        if(n <= 0){
            return 0;
        }
        
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
 
        int max = height[0];
        
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max , height[i]);
            maxLeft[i] = max;
        }
        
        // find maxRight from right for each indexes
        max = height[n-1];
        
         for(int i = n - 1 ; i >= 0 ; i--){
            max = Math.max(max , height[i]);
            maxRight[i] = max;
        }
        
 
        int[] water = new int[n];
        
        int trapped = 0;
        
        // sum of Min(leftmax , rightmax) - currentHeight
        for(int i=0 ; i<n ; i++){
            trapped +=  Math.min(maxLeft[i] , maxRight[i]) - height[i];
        }
        
        return trapped;
    }
}

/*
TC : O(n)
SC : O(n)
*/