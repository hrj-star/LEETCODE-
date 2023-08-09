// find floor of a number = number lesser or equal to curr number 

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
		return high; // will point to floor -  immediate next smaller to target
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 8, 10, 10, 12, 19};
		int n = arr.length;

		int target = 3;
		int ceilingIdx = getCeiling(arr,n,target);
		System.out.println(arr[ceilingIdx]);
	}
}

/*
if target = 3 or 2 , ans = 2


TC : O(logn)
*/