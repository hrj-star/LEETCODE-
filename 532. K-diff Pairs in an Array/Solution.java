class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>(); // want only unique count for each element
        
        Arrays.sort(nums); // sort array - O(nlogn) ->  1 1 3 4 5
        
        for(int i=0 ; i<n-1 ; i++){
            if(Arrays.binarySearch(nums , i + 1 , n , nums[i] + k) > 0){ // O(logn)
                set.add(nums[i]);
            }
        }
        
        return set.size();
    }
}

/*

Complexity Analysis :
----------------------------

TC : O(nlogn) + O(nlogn) = O(2nlogn) = O(nlogn)
SC : O(n) - hashset

Verdict :
-----------------------------

Runtime: 8 ms, faster than 74.00% of Java online submissions for K-diff Pairs in an Array.
Memory Usage: 47.6 MB, less than 16.79% of Java online submissions for K-diff Pairs in an Array.


*/