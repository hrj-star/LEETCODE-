// https://leetcode.com/problems/intersection-of-two-arrays-ii/


// 2 pointers
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums2[j]);
                    nums2[j] = -1; // set -1 to avoid  comparison if pair does not exist in nums2 // [1,2,2,1] , [2] => [2]
                    break;
                }
            }
        }
        
        int[] ans = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}

/*
TC : O(m * n) - while m = nums1.length , n = nums2.length
SC : O(intersecting elements)
*/

// If arrays are sorted we can use 2 pointers to build the result array
// If arrays are sorted and one is larger than the other we can use binary search on the larger one

// 2-pointers 

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0,j=0;
        
        int n1 = nums1.length, n2 = nums2.length;
        
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int[] ans = new int[list.size()];
        
        for(int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        
        return ans;
    }
}

/*
TC : O(nlogn) 
SC : O(intersecting elements) / O(1)
*/


// Freq Array 

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
   

        // making  freq array
        int[] freq =  new int[1001];
        
        for(int n : nums1){
            freq[n]++; // [1,2,2,1] -> [0,2,2,0,.......]
        }
      
        
        
        for(int n: nums2){
            if(freq[n] > 0){
                list.add(n); // [2,2]
                freq[n]--;
            }
        }
        
        // [0,2,0,0.....]
        
         
        
        int[] ans = new int[list.size()];
        
        for(int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }
        
        return ans;
    }
}

/*
TC : O(n) 
SC : O(intersecting elements) / O(1)
*/

// To-Do : Binary Search