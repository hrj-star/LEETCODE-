// https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        if(m == 0 || n == 0){
            return list;
        }
        
       
       int top = 0 , left = 0 , bottom = m - 1, right = n - 1;
        
       int dir = 0;
        
      while(left <= right && top <= bottom ){
            if(dir == 0){ // --> left to right
                for(int i = left; i <= right; i++){
                    list.add(matrix[top][i]);
                }
               
                dir = 1;
                top++;
            }
          
          
          else if(dir == 1){ // top to bottom
                for(int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
                }
               
                dir = 2;
                right--;
            }
          
          
           else if(dir == 2){ // <-- right to left
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
               
                dir = 3;
                bottom--;
               
            }
          
          else if(dir ==3){ // bottom to tp
              for(int i = bottom; i >= top; i--){
                  list.add(matrix[i][left]);
              }
              
              
              dir = 0;
              left++;
          }
        }
        
        return list;
    }
}
/*
TC : O(m*n)
SC : O(m*n)
*/