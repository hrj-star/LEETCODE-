// https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        
        int max = Integer.MIN_VALUE;
        int ones = 0;
        
        for(int num : nums){
            if(num == 1){
                ones++;
            }
            else{
                ones = 0; // reset
            }
            
            max = Math.max(max,ones);
        }
        return max;
    }
}

/*
TC : O(n)
SC : O(1)


42 / 42 test cases passed.
Runtime: 3 ms
Memory Usage: 58.3 MB

*/