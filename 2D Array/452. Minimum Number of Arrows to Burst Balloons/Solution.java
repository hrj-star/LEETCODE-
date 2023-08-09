class Solution {
    public int findMinArrowShots(int[][] points) {
        
        // base case
        if(points.length == 0){
            return 0;
        }
        
        Arrays.sort(points , (a,b) -> Integer.compare(a[1],b[1])); // sort entire pairs by xend in sorted order
        
        int arrows = 1; // if arr.length > 0 , will need atleast one pair
        
        int xend = points[0][1];
        
        for(int i = 1 ; i < points.length ; i++){
            if(xend >= points[i][0]){ // continue if current xend is greater than xstart of all pairs 
                continue;
            }
            arrows++; // increase arrows count
            xend =  points[i][1]; // set current points[i][1] as new xend
        }
        return arrows;
    }
}

/*
Complexity Analysis :
-----------------------
TC : O(nlogn) // traversing after sorting
SC : O(1)

Verdict :
-----------------------

Runtime: 50 ms, faster than 92.98% of Java online submissions for Minimum Number of Arrows to Burst Balloons.
Memory Usage: 70.7 MB, less than 57.97% of Java online submissions for Minimum Number of Arrows to Burst Balloons.

*/