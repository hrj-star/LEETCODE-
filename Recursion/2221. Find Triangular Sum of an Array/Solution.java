class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int ans = helper(nums , n);
        return ans;
    }
    
    private int helper(int[] nums , int n){
              
        if(n == 1){
            return nums[0];
        }
        
 
        int newNums;
        for(int i=0 ; i<n-1 ; i++){
            newNums = (nums[i] + nums[i+1]) % 10;
            nums[i] = newNums;
        }
        
        helper(nums, n-1);
        
        return nums[0];
    }
    
}