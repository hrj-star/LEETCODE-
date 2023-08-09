// https://leetcode.com/problems/contains-duplicate/

class Solution {
  public boolean containsDuplicate(int[] nums) {

    int n = nums.length;
    Arrays.sort(nums);

    for (int i = 1; i < n; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;
  }
}


/*

public boolean containsDuplicate(int[] nums) {
       int n = nums.length;
       
       for(int i=0; i<n; i++){
           for(int j = i+1; j<n; j++){
               if(nums[i] == nums[j]){
                   return true;
               }
           }
       }
        return false;
  }

TC : O(n ^ 2)
SC : O(1)

__________________________________________________________________________________________

public boolean containsDuplicate(int[] nums) {

    int n = nums.length;
    Arrays.sort(n);

    for (int i = 1; i < n; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }
    return false;
  }
  
  
TC : O(nlogn)
SC : O(1)


__________________________________________________________________________________________

public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        
        return false;
    }
    
    
TC : O(n)
SC : O(n)

*/