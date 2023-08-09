// https://leetcode.com/problems/rank-transform-of-an-array/


class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int n = arr.length;
        
       int[] copy = Arrays.copyOf(arr , n);
        
       Arrays.sort(copy);
        
       HashMap<Integer, Integer> map = new HashMap<>();
        
       for(int nums : copy){
           if(!map.containsKey(nums)){
               map.put(nums , map.size() + 1);
           }
       }
        
        for(int i = 0 ; i < n ; i++){
           copy[i] = map.get(arr[i]);
        }
        
        return copy;
    }
}

/*
TC : O(n)
SC : O(n)
*/