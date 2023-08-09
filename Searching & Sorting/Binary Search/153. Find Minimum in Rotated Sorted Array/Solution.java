// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        
        // if(n == 0){
        //     return -1;
        // }
        
        if(n == 1){
            return nums[0];
        }
        
        int left = 0;
        int right = n-1;
        
        // if array is already sorted or in multiples rotation of same length
        if(nums[left] <= nums[right]){
            return nums[0]; // return first element
        }
        
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(nums[mid] > nums[mid+1]){ // if mid is greater than right one , then min lies to its right and is start of second sorted part
                return nums[mid + 1];
            }
            else if(mid > 0 && nums[mid] < nums[mid - 1]){ // if mid is lesser than left one , then its the min element 
                return nums[mid];
            }
            else if(nums[mid] >= nums[left] && nums[mid] > nums[right]){ // if left part is sorted , move to right
                left = mid + 1;
            }
            else{ // if right part is sorted , move to left part
                right = mid - 1;
            }
            
        }
        
        return -1;
        
    }
}

/*
Complexity Analysis :
---------------------------
TC : O(logn)   // binary search
SC : O(1)  



*/