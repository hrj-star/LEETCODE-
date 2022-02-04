class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
    
        // sum of 1 and 3 , and putting in map
        for(int i : nums1){
            for(int j : nums2){
                int sum = i + j;
                map.put(sum,map.getOrDefault(sum,0) + 1);
            }
        }
        
        // a + b + c + d = 0 , so a + b = -(c+d) , getting occurrences of -(c+d) in hashmap. count 
        
         for(int k : nums3){
            for(int l : nums4){
                int sum = k + l;
                count += map.getOrDefault(-sum,0);
            }
        }
        
        return count;
    }
}


/*

Complexity Analysis :
-----------------------------------

TC : O(n^2) // iterating over 2 loops for each paira
SC : O(n^2) // max map can contain O(n^2) combinations

*/