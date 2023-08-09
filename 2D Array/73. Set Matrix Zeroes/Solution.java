// https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        
        
        for(int i=0 ; i < row; i++){
            for(int j=0 ; j < col ; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        
        for(int r : rowSet){
            for(int j = 0 ; j <  col ; j++){
                matrix[r][j] = 0;
            }
        }
        
        
        for(int c : colSet){
            for(int i = 0 ; i <  row ; i++){
                matrix[i][c] = 0;
            }
        }
        
    }
}

/*

TC : O(row * col)
SC : O(row + col)

To do : In-place

*/