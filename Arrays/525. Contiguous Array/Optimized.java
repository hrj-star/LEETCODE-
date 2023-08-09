//Optimized in time : Maintain hashmap with <K,V> as <sum , idx> and if sum has encountered before , extract index and compare with max else put the <sum , idx> pair in  map :  Longest Subarray with Equal 0's and 1's

class Optimized {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
   
        int sum = 0;
        int maxi = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); // put <sum , idx> as <K,V> pair
        map.put(0,-1); // initially put 0 at -1 index in map , to nullify impact of 1 with -1 from 0th index itself as subarray can start from starting itself
        
        for(int i=0;i<n;i++){
            sum += nums[i] == 0 ? -1 : 1; // compute -1 for 0 , 1 for 1
            
            if(map.containsKey(sum)){ // if sum is contained in map before
                int getMapIndex = map.get(sum); // get the index of sum is contained in map before
                int currLen = i - getMapIndex; // get window length from current index i to getMapIndex
                
                // compare maxi with current length
                if(currLen > maxi){
                    maxi = currLen;
                }    
            }
            else{
                map.put(sum,i); // else put sum , current idx as <K,V> in map
            }
        }
        
        return maxi;
    }
}


/* 

Complexity Analysis  :
----------------------------

TC : O(n) -- iterating over element to fill map
SC : O(n) -- map used

Verdict :
-----------------------------

Runtime: 55 ms, faster than 13.45% of Java online submissions for Contiguous Array.
Memory Usage: 73.4 MB, less than 56.63% of Java online submissions for Contiguous Array.


Optimization :
-----------------------------

Use array instead of map for space optimization - To Do
*/

