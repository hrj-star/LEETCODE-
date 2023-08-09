// https://leetcode.com/problems/remove-element/

// similar to 283. Move Zeroes
class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int index = 0;
        
        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        
        return index;
    }
}

// if nums = [1] , val = 2 , returns [1]

/*

Complexity analysis :

TC : O(N) - traversing through elements in input array.
SC : O(1) - inplace

*/