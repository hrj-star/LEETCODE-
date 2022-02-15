
// using HashSet - iterate elements , if duplicate found then keep removing from set , at last , set will contain single unique number -- 2 , 2 , 1 => set => [2] => [] => [1] , return 1

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
----------------------------
TC : O(N) - O(N) for traversing in for loop , O(1) for HashSet operations -> O(N.1) = O(N)
SC : O(N) - space by hashset to hold array elements.


Verdict :
-----------------------------
Runtime: 19 ms, faster than 18.72% of Java online submissions for Single Number.
Memory Usage: 54.2 MB, less than 5.21% of Java online submissions for Single Number.

*/
