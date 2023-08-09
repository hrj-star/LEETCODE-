// https://leetcode.com/problems/maximum-erasure-value/

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int currSum = 0 , maxSum = 0 , left = 0 , n = nums.length;
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i=0 ; i < n ; i++){
            
                     // if element already present in map ,  remove all elements from map which were pushed till that element, keep decrementing currSum and move left pointer forward 
            
            if(map.containsKey(nums[i])){
                
                while(map.containsKey(nums[i])){
                        map.remove(nums[left]);
                        currSum -= nums[left];
                        left++;
                }
            }

                // put element in map for first time , add curr element and increment left pointers
                
                map.put(nums[i] , 1);
                currSum += nums[i];
                maxSum = Math.max(maxSum , currSum);
        }
        
        return maxSum;
    }
}

/*
TC : O(n)
SC : O(n)

*/


// space optimized 

class Solution {
  public int maximumUniqueSubarray(int[] nums) {
    int[] freq = new int[10001]; // 10^4 -> 10001

    int left = 0, currSum = 0, maxSum = 0, n = nums.length;

    for (int i = 0; i < n; i++) {

      while (freq[nums[i]] > 0) { // if repeating
        freq[nums[left]]--;
        currSum -= nums[left];
        left++;
      }

      freq[nums[i]]++;
      currSum += nums[i];
      maxSum = Math.max(currSum, maxSum);

    }

    return maxSum;
  }
}

/*
TC : O(n)
SC : O(1)
*/