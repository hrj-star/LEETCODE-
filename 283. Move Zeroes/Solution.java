
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0 ;i < nums.length ; i++ ){
             if(nums[i] != 0){
                nums[index++] = nums[i];
              }
            } // for close
        
             while(index<nums.length){
                nums[index++] = 0;
             }  
        }
    }


/*

Complexity analysis :

TC : O(N) - traversing through elements in input array.
SC : O(1) - inplace

verdict :Runtime: 0 ms, faster than 100.00% of Java online submissions.


*/

