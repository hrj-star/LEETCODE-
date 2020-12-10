
// HashSet 

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set =  new HashSet<Integer>();
        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                set.remove(n);
            }
        }
        
        return set.iterator().next();
    }
}


/*

Complexity analysis :

TC : O(N) - O(N) for traversing in for loop , O(1) for HashSet operations -> O(N.1) = O(N)
SC : O(N) - space by hashset to hold array elements.

*/
