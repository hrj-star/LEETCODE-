// naive approach = maintain 2 loops i , j ,j from  i to n to maintain subarray , maintain count of 0's , 1's  and return max length subarray

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int nZeroes , nOnes;
        int maxi = 0;
        
        for(int i=0;i<n;i++){
           nZeroes = 0;
           nOnes = 0;
            
            for(int j=i;j<n;j++){
                if(nums[j] == 0){
                    nZeroes++;
                }
                else{
                    nOnes++;
                }
                
                if(nZeroes == nOnes){
                    maxi = Math.max(maxi , nZeroes * 2);
                }
            }
        }
        
        return maxi;
    }
}


/* 

Complexity Analysis  :
----------------------------

TC : O(n^2) --  2 loops
SC : O(1)

Verdict :
-----------------------------

TLE

*/

