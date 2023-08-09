// https://leetcode.com/problems/search-a-2d-matrix/ 


// brute force - O(m*n)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
      
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<cols ; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        
        // not found
        return false;
    }
}

/*

Complexity Analysis
---------------------------------

Time Complexity: O(m*n)

Space Complexity: O(1)

Optimization : Binary Search as sorted matrix
*/

// as sorted apply binary search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = cols - 1;
        
        while(left < row && right >= 0){
            if(matrix[left][right] == target){
                return true;
            }
            else if(matrix[left][right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        
        // not found
        return false;
    }
}

/*

Complexity Analysis
---------------------------------

Time Complexity: O(log(m*n)) =O(log(m) + log(n))

Space Complexity: O(1)
*/