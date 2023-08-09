// https://leetcode.com/problems/spiral-matrix-ii/ -  same as Spiral 1 - just start from one and increment value till n^2 and allocate it to matrix[i][j]

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom =  n-1;
        
        int fillData = 1;
        
        while(left <= right && top <= bottom ){
            
            for(int i = left; i <= right; i++){
               matrix[top][i] = fillData++;
            }
            
            top++;
            
            for(int i = top; i <= bottom; i++){
               matrix[i][right] = fillData++;
            }
            
            right--;
            
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = fillData++;
            }
            
            bottom--;
            
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = fillData++;
            }
            
            left++;
        }
        
        return matrix;
    }
}

/*
TC : O(n^2) // n*n matrix
SC : O(n^2) // n*n matrix
*/