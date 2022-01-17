/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for(int i=1;i<n;i++){
            if(isBadVersion(i)){
                return i;
            }
        }
        return n;
    }
}

Complexity Analysis :
---------------------------
TC : O(n) // Linear Scan
SC : O(1) 

Verdict :
---------------------------
TLE

Optimized Approach :
---------------------------
Use Binary Search
*/


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low <  high){
            int mid = low + (high - low) / 2;
            if(isBadVersion(mid)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}

/*
Complexity Analysis :
---------------------------
TC : O(logn) // Binary Search - as its sorted -  1 to n
SC : O(1) 

Verdict :
---------------------------
Runtime: 30 ms, faster than 8.99% of Java online submissions for First Bad Version.
Memory Usage: 37.6 MB, less than 19.71% of Java online submissions for First Bad Version.

*/