class Optimized {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        // put in map
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        // map : 3 - 1 , 1 - 2 , 4 - 1, 5 - 1 
        // iterating over map keys for unique keys instead of iterating over array which would give duplicate values - if k > 0 , look for key + k in map and if it exists , increment count ,   if k == 0 , check if key exists more thatn 1 in map , if yes , increment count
        
        int count = 0;
        for(int key : map.keySet()){
            if(k > 0 && map.containsKey(key + k) || k == 0 && map.get(key) > 1){
                count++;
            } 
        }
        return count;
    }
}

/*

Complexity Analysis :
----------------------------

TC : O(n) - hashmap
SC : O(n) - hashmap

Verdict :
-----------------------------

Runtime: 14 ms, faster than 46.69% of Java online submissions for K-diff Pairs in an Array.
Memory Usage: 48 MB, less than 14.97% of Java online submissions for K-diff Pairs in an Array.


*/