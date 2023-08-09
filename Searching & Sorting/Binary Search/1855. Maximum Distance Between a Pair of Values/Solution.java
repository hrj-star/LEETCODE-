// https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/

// Brute Force

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxi = 0;
        
        for(int i = 0 ; i<nums1.length ; i++){
            int currLength = 0;
            
            for(int j = i ; j<nums2.length ; j++){
                
                if(nums1[i] <= nums2[j]){
                    currLength = j-i;
                }
            }
            
            maxi = Math.max(maxi,currLength);
        }
        return maxi;
    }
}

/*
Complexity Analysis :
--------------------------

TC : O(n^2)

*/

// Optimised Brute Force

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxi = 0;
        
        // consider numbers from i+max and avoid unnecessary comparisons
        for(int i=0 ; i<nums1.length ; i++){
            int currLength = 0;
            if(i + maxi < nums2.length){
                
                for(int j = i + maxi; j<nums2.length ; j++){
                    if(nums1[i] <= nums2[j]){
                        currLength = j-i;

                        }
                        else{
                            break;
                        }
                 }
            }
      
            maxi = Math.max(maxi,currLength);
        }
        
        return maxi;
    }
}

/*
Complexity Analysis :
--------------------------

TC : O(n^2)

*/

// Two - Pointers

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0 , j = 0 , maxi = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                maxi = Math.max(maxi , j-i);
                j++;
            }
            else{
                i++;
            }
        }
        
        return maxi;
    }
}

/*
Complexity Analysis :
--------------------------

TC : O(n + m) , n = nums1.length , m = nums2.length
Better than binary search in any problem if both the arrays are of equal size - faster , less overhead
Else binary search is better - O(nlogm) - if both of different lengths.

https://stackoverflow.com/questions/37418916/on-log-m-vs-onm-which-is-better

*/