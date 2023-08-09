/*
https://leetcode.com/problems/search-in-rotated-sorted-array/


1. As sorted , apply Binary search.
2. Divide into 2 parts by mid - left , right.
3. If element at left is less than at mid , means 1st part is sorted with mid as highest , and if target < mid , so target will lie in right part.

 nums = [4,5,6,7,0,1,2], target = 0
         0 1 2 3 4 5 6
         
         
         
low = 0
high = 6

         
mid = 6/2 = 3

nums[mid] = 7
nums[low] = 4
nums[high] = 2

7 != 0


nums[low] <= mid -> 4 < 7 , yes meaning 4 to 7 part is sorted with 7 as highest, go to right

low = mid + 1

low = 4
high = 6

mid = 10/2 = 5
nums[mid] = 1
nums[low] = 0
nums[high] = 2

1 != 0

nums[low] = 0 < 1 yes 
if(0 >= 0) -- yes

high = mid - 1 = 5
low = 4

mid = 4

if(nums[mid] == target) -> yes return mid

 
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            // check if left is sorted
            else if(nums[low] <= nums[mid]){
                // now left part is sorted , check if target >= nums[low] && target < mid , then reduce search space to left part
                if(target >= nums[low] && target < nums[mid]){ // greater than equal to low , less than mid 
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(nums[high] >= nums[mid]){
                if(target > nums[mid] && target <= nums[high]){ // greater than mid , less than equal to high
                  low = mid + 1;  
                } 
                else{
                    high = mid - 1;
                }
            }
        }
        
        // not found
        
        return -1;
    }
}

/*

TC : O(logn)

*/