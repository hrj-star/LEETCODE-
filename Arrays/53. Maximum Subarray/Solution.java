// Divide and Conquer - O(nlogn) - Less optimized than kadanes .

class Solution {
    public int maxSubArray(int[] A) {
        return maxSubArray(A, 0, A.length - 1);
    }
    
    public int maxSubArray(int[] A, int left, int right) {
		if (left == right) return A[left];
		int mid = left + (right - left) / 2 , leftMax, rightMax;
		leftMax = rightMax = Integer.MIN_VALUE;
		for (int i = mid, sum = 0; i >= left; --i) leftMax = Math.max(leftMax, sum += A[i]);
		for (int j = mid + 1, sum = 0; j <= right; ++j) rightMax = Math.max(rightMax, sum += A[j]);
		return Math.max(Math.max(maxSubArray(A, left, mid), maxSubArray(A, mid + 1, right)), leftMax + rightMax);
    }
