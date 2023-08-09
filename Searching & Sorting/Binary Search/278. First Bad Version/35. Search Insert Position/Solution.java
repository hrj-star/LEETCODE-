// return ceil - next greater to current element or itself

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        
        int low = 0 , high = n-1;
        
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
        
        return low;
    }
}

/*

Complexity Analysis :
---------------------------
TC : O(logn)
SC : O(1)

Verdict :
---------------------------
Runtime: 1 ms, faster than 6.51% of Java online submissions for Search Insert Position.
Memory Usage: 40.7 MB, less than 17.33% of Java online submissions for Search Insert Position.

*/