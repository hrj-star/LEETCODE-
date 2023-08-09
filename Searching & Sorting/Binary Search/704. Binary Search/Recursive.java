
class Recursive {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target,0,nums.length-1);
    }
    
    private int binarySearch(int[] nums, int target, int low , int high){
        
        if(low > high){
            return -1;
        }
        
        int mid = low + (high - low) / 2;  // avoid overflow
        
        if(nums[mid] == target){
            return mid;
        }
        
        if(nums[mid] < target){
            return binarySearch(nums,target,mid+1,high);
        }
        else{
            return binarySearch(nums,target,low,mid-1);
        }
    }
}


/*

Complexity Analysis :
---------------------------
TC : O(logn)
SC : O(logn) // due to recursion stack -  there is no loop, and the new values are passed to the next recursion of the loop. Here, the max and min values are used as the boundary condition. 

Verdict :
---------------------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
Memory Usage: 51.8 MB, less than 14.06% of Java online submissions for Binary Search.
*/