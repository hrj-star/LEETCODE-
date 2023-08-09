/*
https://leetcode.com/problems/sqrtx/

Using Binary Search

*/

class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x/2;
        
        int ans = 0;
        
        // base cases
        
        if(x <= 1){
            return x;
        }
        
        while(low <= high){
            int mid = low + (high - low) / 2; 
            
            if(mid <= x / mid) { // mid * mid <= x , mid can be one possible answer -> take mid to right side
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return ans;
    }
}

/*

TC : O(logn)
SC : O(1)
*/