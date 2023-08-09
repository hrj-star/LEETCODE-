// find ceiling of a number = number greater or equal to curr number 

class Solution{

	static int getCeiling(int[] arr , int n , int target){
		int low = 0;
		int high = n - 1;

		if(n == 0){ // arr of length 0 - return -1
			return -1;
		}

		while(low <= high){
			int mid = low + (high-low) / 2;

			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}

		}
		return low; // will point to ceil - immediate next greater to target
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 8, 10, 10, 12, 19};
		int n = arr.length;

		int target = 7;
		int ceilingIdx = getCeiling(arr,n,target);
		System.out.println(arr[ceilingIdx]);
	}
}

/*
if target = 8 or 7 , ans = 8


TC : O(logn)
*/