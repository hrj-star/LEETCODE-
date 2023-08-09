class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        int n = nums.length;
        
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}


/*
TC : O(n^2)
SC : O(1)

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); // stores <num , index> pair
        
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]); // get index of target-nums[i]
                ans[1] = i;
                break;
            }
            map.put(nums[i] , i);
        }
        return ans;
    }
}

/*
TC : O(n)
SC : O(n)

*/