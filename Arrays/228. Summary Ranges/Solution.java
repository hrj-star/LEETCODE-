// https://leetcode.com/problems/summary-ranges/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int start = nums[i];
            while(i+1 < n && nums[i+1] == nums[i] + 1){
                i++;
            }
                if(start != nums[i]){
                    list.add("" + start + "->" + nums[i]);
                }
                else{
                    list.add(""+ start);
                }
         }
        return list;
    }
}

/*

TC : O(n)
SC : O(n)

Runtime: 9 ms, faster than 49.47% of Java online submissions for Summary Ranges.
Memory Usage: 42.4 MB, less than 21.59% of Java online submissions for Summary Ranges.

*/