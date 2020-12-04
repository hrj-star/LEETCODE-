// TC = O(n)  , SC = O(1) - constant space by zeroth and first
class Optimized {
    public int minCostClimbingStairs(int[] cost) {
        int zeroth=cost[0];
        int first=cost[1];
        for (int i=2;i<cost.length;i++){
           int  ans=cost[i]+Math.min(zeroth,first);
            // swap zeroth with first , first with ans 
            // update last two stairs as value as ans depends on min of them 
            
            zeroth=first;
            first=ans;
            
            
        }
        return Math.min(zeroth,first);

    }
}
