class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // maintaining a new rotated array
        
        int[] rotatedArray = new int[n];
        
        // filling elements by shifting k places right in rotating array
        for(int i=0;i<n;i++){
            int rotated = (i+k)%n;
            rotatedArray[rotated] = nums[i];
        }
        
        // filling rotatedArray back to original array  
        for(int i=0;i<n;i++){
            nums[i] = rotatedArray[i];
        }
    }
}

/*

Complexity Analysis :
--------------------------------

TC : O(n)
SC : O(n)


Optimization :
--------------------------------
Doing it in-place - O(1) space


Verdict :
--------------------------------
Runtime: 1 ms, faster than 76.47% of Java online submissions for Rotate Array.
Memory Usage: 58 MB, less than 52.73% of Java online submissions for Rotate Array.
*/