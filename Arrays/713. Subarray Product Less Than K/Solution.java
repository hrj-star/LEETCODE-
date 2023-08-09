/*

The main idea is to maintain a window with product less than K .Each window will give subarrays equal to its size
Eg : Suppose we have arr=[1,2,3,4] and k=20 which is greater than product of all the elements

Window    -->   Product -->     Subarrays
[1]       -->     1     -->     [1]
[1,2]     -->     2     -->     [1,2] , [2]
[1,2,3]   -->     6     -->     [1,2,3] , [2,3] , [3]
[1,2,3,4] -->     10    -->     [1,2,3,4], [2,3,4] , [3,4] , [4]

*/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        
        if(k <= 1){
            return 0;
        }
        
        int subarrayCount = 0;
        int product = 1;
        int left = 0;
        int right = 0;
        
        while(right < n){
            product *= nums[right];
            while(product >= k){
                product /= nums[left];
                left++;
            }
            subarrayCount += right - left + 1;
            right++;
        }
       return subarrayCount; 
    }
}

/*
TC : O(n)
SC : O(1)
*/