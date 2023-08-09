class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int n = nums.length;
        
        int count = 0;
        
        for(int i=0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if( Math.abs(nums[i] - nums[j]) == k){
                    count++;
                }
            }
        }
        
        return count;
    }
}

/*

TC : O(n^2)
SC : O(1)

*/




class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int n : nums){
            map.put(n , map.getOrDefault(n,0) + 1); // put all elements in map with their frequency //  1 - 2 , 2 - 2
        }
        
        for(int n : nums){
            if(map.containsKey(n + k)){ // k is always greater than 0 , so skip k = 0 conditions
                count += map.get(n+k);
            }
        }
        return count;
    }
}

/*

TC : O(n) 
SC : O(n) -- hashmap

*/