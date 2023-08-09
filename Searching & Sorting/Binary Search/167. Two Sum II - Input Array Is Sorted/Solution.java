// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        
        for(int i = 0 ; i < n ; i++){
            int diffPair =  target - numbers[i];
            
            int findDiffPairIndex = binarySearch(i + 1 , numbers,diffPair);
            
            if(findDiffPairIndex != -1){
                ans[0] = i + 1; // 1 - based
                ans[1] = findDiffPairIndex + 1; // 1 - based
            }
            
        }
        return ans;
    }
    
     private int binarySearch(int startSearchFrom , int[] nums, int target) {
        int n = nums.length;
        
        int low = startSearchFrom , high = n-1;
        
        while(low <= high){
            
            int mid = low + (high-low) / 2; // avoid overflow
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return -1;
    }
}

/*
TC : O(nlogn)
SC : constant
*/