class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int compute[] = new int[1001];
        
        // for each trip , at any point , add the passengers at from index(boards the car) and subtract the passengers at to index  (gets down from car).
       /*
        for(int trip[] : trips){
            compute[trip[1]] += trip[0];
            compute[trip[2]] -= trip[0];
       }
       */
        
        for(int i=0 ; i < trips.length ; i++){
            compute[trips[i][1]] += trips[i][0];
            compute[trips[i][2]] -= trips[i][0];
        }
        
        // now iterate over compute array to find cummulative sum at any point of time , if that is greater than capacity , then return false else true.
        
        int start = 0;
        for(int i : compute){
            start += i;
            if(start > capacity){
                return false;
            }
        }
        
        return true;
    }
}


/*

Complexity Analysis :
-----------------------------------

TC : O(sum(trip distance))
SC : O(max(trip distance))


Verdict :
-----------------------------------

Runtime: 1 ms, faster than 98.57% of Java online submissions for Car Pooling.
Memory Usage: 39.2 MB, less than 31.71% of Java online submissions for Car Pooling.
*/