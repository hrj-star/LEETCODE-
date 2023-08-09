class Solution {
    public int brokenCalc(int startValue, int target) {
        
        // if s = 8 , t = 5 , we can only subtract
        if(startValue >= target){
            return startValue - target;
        }
        
        int countSteps = 0;
        
        // reverse operations
        
        while(target > startValue){
            if(target % 2 == 0){ // if target even then % by 2
                target /= 2;
                countSteps++;
            }
            else{
                target += 1;
                countSteps++;
            }
        }
        
        return countSteps + (startValue - target);
    }
}

/*

TC : O(logn) -- reduce possibilities by 1
SC : O(1)

*/