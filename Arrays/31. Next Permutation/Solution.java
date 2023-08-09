/*

https://leetcode.com/problems/next-permutation/


12451
go from right to left , point left at 4 - which is first lowest then element at its right.
go from right to left , point right at next greater than 4 , i.e 5 
Swap left , right -> 1 2 5 4 1
Now , swap all from left + 1 , end ==> 1 2 5 1 4

For , 3 2 1 , left  = -1 , less than 0 , simply reverse entire array -> 1 2 3

*/
class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        
        if(n <= 1){
            return;
        }
        
        int left = n-2;
        
        while(left >=0 && nums[left] >= nums[left+1]){
            left--;
        }
        
        // if left >= 0 , find right , swap , reverse else reverse
        
        if(left >=0){
            int right = n - 1;
            while(right >=0 && nums[left] >= nums[right]){
                right--;
            }
            swap(nums,left,right);
        }
    
        reverse(nums , left+1 , n-1); // else reverse for both cases
        
    }
    
    public static void swap(int[] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public static void reverse(int[] nums , int left , int right){
        while(left < right){
            swap(nums ,left, right);
            left++;
            right--;
        }
    }
}

/*
TC : O(nlogn) + O(n)

*/