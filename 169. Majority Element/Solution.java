// Brute Force Approach

class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        int max_count=n/2;
    
        for(int i=0;i<n;i++){
            int count=0;
            
            for(int j=0;j<n;j++){
                
                if(nums[i] == nums[j]){
                    count++;
                }
            }     // inner for close 
            
            if(count > max_count)
                return nums[i];
 
        } // outer for close
        
        return -1;
    
    }
}




/* 

Complexity Analysis :

TC : O(n^2)  - The brute force algorithm contains two nested for loops that each run for n iterations, adding up to quadratic time complexity.

SC : O(1) - constant space 

*/



