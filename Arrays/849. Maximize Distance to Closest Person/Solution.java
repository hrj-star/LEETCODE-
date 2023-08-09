class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int alex = 0;
        int zeroes = 0; // current longest group of empty seats together
        
        // base cases
        if(seats == null || seats.length == 0){
            return 0;
        }
        
        // case 1 : Alex sits in  middle of empty seats -  1, 0, 0, 0, 1 ->  1, 0, A, 0, 1
        for(int i=0;i<n;i++){
            if(seats[i] == 1){ // if filled , reset zeroes counter
                zeroes = 0;
            }
            else{
                zeroes++; // increment counter of empty seats 
                alex = Math.max(alex , (zeroes+1) / 2); // find max distance
            }
        }
        
        
        // case 2 : Alex sits in leftmost seat and need to find maximum distance between next occuring 1 (left to right) -  0, 0, 0, 1 -> A, 0, 0, 1
        
        for(int i=0;i<n;i++){
            if(seats[i] == 1){
                alex = Math.max(alex , i);
                break; // found one maximized distance , break out of loop
            }
        }
        
        // case 3 : Alex sits in rightmost seat and need to find maximum distance between previous occuring 1 (right to left) - 1, 0, 0, 0 -> 1, 0, 0, A
        
        for(int i=n-1;i>=0;i--){
            if(seats[i] == 1){
                alex = Math.max(alex , n-1-i);
                break; // found one maximized distance , break out of loop
            }
        }
        
        return alex;
    }
}


/*

Complexity Analysis :
-----------------------

TC : O(n)
SC : O(1)


Verdict :
-----------------------
Runtime: 4 ms, faster than 29.52% of Java online submissions for Maximize Distance to Closest Person.
Memory Usage: 46.2 MB, less than 28.75% of Java online submissions for Maximize Distance to Closest Person.

*/