class Optimized {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k % n;
        reverse(nums,0,n-1); // reverse entire array
        reverse(nums,0,k-1); // reverse first half till k
        reverse(nums,k,n-1); // reverse second half from k to n
    }
    
    public void reverse(int[] nums, int start , int end){
        while(start < end){
            int temp =  nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*

Complexity Analysis :
--------------------------------

TC : O(n)
SC : O(1)



Verdict :
--------------------------------
Runtime: 1 ms, faster than 76.47% of Java online submissions for Rotate Array.
Memory Usage: 64.4 MB, less than 5.22% of Java online submissions for Rotate Array.
*/