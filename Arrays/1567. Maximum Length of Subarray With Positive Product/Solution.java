// https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/

class Solution {
    public int getMaxLen(int[] nums) {
        
        int max = 0;
        int n = nums.length;
        
        for(int i=0 ; i<n ; i++){
            
            // for remaining ones - optimization step
            
            
            if(n - i <= max){
               return max; 
            }
            
            if(nums[i] != 0){
                int negatives = nums[i] < 0 ? 1 : 0;
                
                max = Math.max(max , nums[i] > 0 ? 1 : 0);
                
                for(int j = i+1 ; j < n ; j++){
                    if(nums[j] < 0){
                        negatives++;
                    }
                    else if(nums[j] == 0){
                        break;
                    }
                    
                    if(negatives % 2 == 0){
                        max = Math.max(max , j - i + 1);
                    }
                }
            }
        }
        
        return max;
    }
}

/*
TC : O(n^2)
Todo : Optimized
*/