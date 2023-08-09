// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int n = letters.length;
        
        char ans = letters[0]; // for cyclic answer , if below conditions do not update ans value then its 'a'
        
        int low = 0;
		int high = n - 1;
        
        while(low <= high){
			int mid = low + (high-low) / 2;

			if(letters[mid] > target){
                ans = letters[mid]; // potential ans as we want next greater
                high = mid - 1; // if not , go to left part
				
			}
			else if(letters[mid] <= target){
				low = mid + 1;
			}
		}
        
        return ans;
    }
    
}

/*
TC : O(logn)
SC : O(1)

*/