/*

Approach  :
------------------------------------
Brute Force - maintain 2 pointers i and j and keep adding the pairs whose sum is perfectly divisible by 60 and maintain a counter that counts the pairs and return it.

*/


class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        int counter = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++ ){ // j would start from i+1 as we do not want to count (i,j) , (j,i) / duplicate pairs
                if((time[i] +  time[j]) %  60 == 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}

/*

Complexity Analysis :
------------------------------------
TC : O(n^2) as 2 for loops.

Verdict :
------------------------------------
TLE

*/