class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0, total = 0, idx = 0;
        
        for(int i=0;i<gas.length;i++){
           int unitConsumed = gas[i] - cost[i];
            tank += unitConsumed;
            if(tank < 0){
                idx = i + 1;
                tank = 0;
            }
            
            total += unitConsumed;
        }
        
        if(total < 0){
            return -1;
        }
        else{
            return idx;
        }
    }
}

/*

Complexity :
-------------------------

TC : O(n) - optimized
SC : O(1)

Verdict :
-------------------------
Runtime: 3 ms, faster than 46.62% of Java online submissions for Gas Station.
Memory Usage: 63.8 MB, less than 34.97% of Java online submissions for Gas Station.

To-Do :
-------------------------
Brute Force
*/