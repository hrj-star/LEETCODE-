/*

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


As sorted , apply Binary Search

*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        
        int n = nums.length;
        
        // base case
        if(n == 0){
            return ans;
        }
        
        // can be multiple occurrences of element - {1,2,2,2,3} , target = 2 -> {1,3}
     
        
        int low = 0;
        int high = n-1;
        
        // search for first index
        while(low <= high){
            int mid = low + (high - low )/2;
            
            if(nums[mid] == target){
                ans[0] = mid;
        
                high = mid - 1; // continue searching left part
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        
         low = 0;
         high = n-1;
        
         // search for last index
        while(low <= high){
            int mid = low + (high - low )/2;
            
            if(nums[mid] == target){
                ans[1] = mid;
        
                low = mid + 1; // continue searching right part
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return ans;
    }
}

/*
TC : O(logn)
*/