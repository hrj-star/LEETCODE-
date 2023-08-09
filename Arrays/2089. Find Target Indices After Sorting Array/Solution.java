// https://leetcode.com/problems/find-target-indices-after-sorting-array/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        
       List<Integer> ans = new ArrayList<>();
        
       for(int i = 0 ; i < n ; i++){
          if(nums[i] == target){
              ans.add(i);
          }
       }
        
        return ans;
    }
}

/*
O(n) traversal
*/