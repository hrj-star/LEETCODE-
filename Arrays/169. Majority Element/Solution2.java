
// Using Sorting and returning the middle element.

class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}


/*

Complexity Analysis :

TC : O(nlogn) - sorting used

SC : >= O(n) [Ω(log n) extra space]

*/
