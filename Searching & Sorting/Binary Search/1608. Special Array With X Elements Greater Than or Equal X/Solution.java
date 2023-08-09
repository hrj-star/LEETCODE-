/*

https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/


Understanding the question : 


in the given array , start from 1 till max element , for each 1 to max , check that each element is greater or equal to it , if yes increment count 

[0,4,3,0,4]

1 -> no.of elements >= 1 -> 3 , 1 != 3 

2 -> no.of elements >= 1 -> 3 , 2 != 3 

3 -> no.of elements >= 3 -> 3 , 3 == 3 , return 3 as it is special

*/
class Solution {
    
    public int findMax(int[] nums){
       int max = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        return max;
    }
    
    public int specialArray(int[] nums) {
        int n = nums.length;
        
        int maxi = findMax(nums);
      
        
        for(int i=1 ; i <= maxi ; i++){ // can be [100,100,100,100]
            int count = 0;
            
            for(int num : nums){
                if(num >= i){
                  count++;
                }
            }
            
            if(i == count){
                return i;
            }
        }
        return -1;
    }
}

/*
TC : O(n*max) / O(n^2)

do binary search 
*/
