// Kadanes Algo

class Optimized {
    public int maxSubArray(int[] nums) {
        int curr_sum=nums[0],overall_sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            // if curr_sum is positive and beneficial , add current element and curr_sum
            
            if(curr_sum>=0){
                curr_sum+=nums[i];
                
            }
            // if curr_sum is negative or less , start new subarray from current element.
            else{
                curr_sum=nums[i];
            }
       
            // logic for getting 'max' subarray.
        
            if(curr_sum > overall_sum){
                overall_sum = curr_sum;
            }
         }
        return overall_sum;
        
    }
}


/*

Complexity analysis : Kadanes Algo

Time  : O(N) - scans entire array exactly once.

Space : O(1) - constant space

