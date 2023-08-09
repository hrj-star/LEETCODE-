class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>(); // prevent duplicates

        if(nums.length < 3) return new ArrayList<>(ans);
		
		int n = nums.length;
		Arrays.sort(nums);
		//int count = 0;
        
		for(int i = 0 ; i <= n-3 ; i++){
			// 3 pointers , current , left , right
			int current = nums[i];
			int left = i+1;
			int right =  n-1;
			
			while(left < right){
				if(current + nums[left] + nums[right] == 0){
					//count++;
                    ans.add(Arrays.asList(current , nums[left] , nums[right]));
					//System.out.println(current + " " + A[left] + " " + A[right]);
				
					left++;
					right--;
				}
				else if(current + nums[left] + nums[right] < 0){
					left++;
				}
				else{
					right--;
				}
			}
		}
		
		 return new ArrayList<>(ans);
    }
}

/*
TC : O(n^2)
SC : O(n) - as set
*/