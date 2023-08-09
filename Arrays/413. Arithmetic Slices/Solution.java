class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int n = nums.length;
        
        if(n < 3){
            return 0;
        }
        
        int currsum = 0 , sum = 0;
        
        for(int i = 2 ; i < n ; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                currsum += 1;
                sum += currsum;
            }
            else{
                currsum = 0;
            }
        }
        
        return sum;
    }
}


/*

TC : O(n) , where n = nums.length
SC : O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Arithmetic Slices.
Memory Usage: 40 MB, less than 48.80% of Java online submissions for Arithmetic Slices.
*/]