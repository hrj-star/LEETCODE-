class Optimized {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k % n;

        // 1,2,3,4,5,6,7 , k = 3 
        reverse(nums,0,n-1); // reverse entire array - 7,6,5,4,3,2,1 
        reverse(nums,0,k-1); // reverse first half till k - 5,6,7 , 4,3,2,1 
        reverse(nums,k,n-1); // reverse second half from k to n - 5,6,7,1,2,3,4 
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