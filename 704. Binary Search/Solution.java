class Solution {
    public int search(int[] nums, int target) {
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
        
        return -1;
    }
}

/*

Complexity Analysis :
---------------------------
TC : O(logn)
SC : O(1)

Verdict :
---------------------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
Memory Usage: 51.8 MB, less than 19.33% of Java online submissions for Binary Search.

*/