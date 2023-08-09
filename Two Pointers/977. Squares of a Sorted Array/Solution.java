
// Using sort technique - O(nlogn)

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length; i++)
            nums[i] *= nums[i] ;
        Arrays.sort(nums);
        return nums;
    }
}

/*
Complexity Analysis :

TC : O(nlogn)

SC : O(1)


*/
