class Solution {
    public int removeDuplicates(int[] nums) {
    
        int n = nums.length;
        
        // base case if n can be 0
   //     if(nums == null || n == 0 ){
    //        return 0;
   //     }
            
        int index = 1; // first element is always unique
        for(int i = 1 ; i < n ; i++){
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

/*
TC : O(n)
SC : O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 43.6 MB, less than 88.52% of Java online submissions for Remove Duplicates from Sorted Array.


class Solution {
    public int removeDuplicates(int[] nums) {
    
         Set<Integer> set = new HashSet<>();
          int index = 0;
          for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
                nums[index++] = i; 
             } 
          }
        return index;
    }
}


TC : O(n)
SC : O(n) - using extra space

Runtime: 4 ms, faster than 11.66% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 48.3 MB, less than 7.16% of Java online submissions for Remove Duplicates from Sorted Array.

*/

