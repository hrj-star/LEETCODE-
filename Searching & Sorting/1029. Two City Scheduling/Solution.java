/*
1. subtract aCost - bCost.
        10,20  = 10 - 20 = -10
        30,200 = 30 - 200 = -170
        400 - 50 = 350
        30 - 20 = 10
2. Sort the array

-170
-10
350
10

Negatives signify that B is costlier and A is better  , choose A
Positives signify B is better , choose B.

So till length / 2 , keep adding A's cost
After that , keep adding B's cost.

*/

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs , (a,b) -> {
           return(a[0] - a[1]) - (b[0] - b[1]); 
        });
        
        int total = 0;
        
        int n = costs.length;
        
        for(int i=0 ; i < n ; i++){
            if(i < n / 2){
                total += costs[i][0]; // select A
            }
            else{
                total += costs[i][1]; // select B
            }
        }
        
        return total;
    }
}

/*
TC : O(nlogn)
SC : O(1)
*/