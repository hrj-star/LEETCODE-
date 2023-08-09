// https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        
           for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums2[j]);
                    break;
                }
            }
        }
        
        int[] ans = new int[set.size()];
        
        int k = 0;
        
        for(int n : set){
            ans[k++] = n;
        }
        
        return ans;
        
    }
}

/*
TC = O(N*M), 
SC = O(N)
where N = nums1.length, M = nums2.length
*/
// To-do : Binary - search