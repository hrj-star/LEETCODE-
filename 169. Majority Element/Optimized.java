
/* Optimized Solution : Moore's Majority Voting Algorithm  */


// Steps : find major candidate element and then count for > n/2 times


class Optimized {
    
    public int findCandidate(int[] nums) {
        
        int majority_count=0;
        int n=nums.length;
        int max_count=n/2;
        
        for(int i=0;i<n;i++){
            
          if(nums[i] == majorityElement(nums))
              majority_count++;
        
        
          if(majority_count > max_count)
               return nums[i];
         }
        
        return -1;
    }

        
        
    public int majorityElement(int[] nums) {
            
        int count = 0 ;
        int major = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(count == 0){
                major = nums[i];
                count = 1;  
            }
            
            else if(major == nums[i])
                count++;
            
            else
                count--;
    
        } // for close
        
        return major;
        
    }
    
    
}

/*
class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        
        int majority = nums[0];
        int count = 1;
        
        for(int i=1;i<n;i++){
            if(nums[i] == majority){
                count++;
            }
            else{
                count--;
            }
            
            if(count == 0){
                // reset majority element and count
                majority = nums[i];
                count = 1;
            }
        }
        return majority;
    }
}

*/
        
        

/* 

Code walkthrough :

nums[] = [2,3,4,3,3]

Initially , count == 0
2 :
major = 2
count = 1 

--------------------------------

3 : 2 !=3
count = 0
major = 3
count = 1 

--------------------------------


4 : 3!=4
count = 0
major = 4
count = 1 

--------------------------------

3 : 4!=3
count = 0
major = 3
count = 1 

--------------------------------

3 : 3==3
count = 2
major = 3


After the end of the loop , found major as 3 , this is only 'candidate' for majority element , to check for majority , check its count > n/2 .



------------------------------------------------------------------------------

Complexity Analysis :

TC : O(N)  - loop through array only once ,  Linear traversal of array for candidate element / major + Finding frequency of nums[major] = O(N) + O(N) = O(N).

SC : O(1) - constant space 

Verdict : Runtime: 1 ms, faster than 99.84% of Java online submissions.

*/
