/*
Rotate Matrix Clock-wise , Anti-Clock-wise

n*n -> rows == cols

1 2 3
4 5 6
7 8 9

Clockwise :
7 4 1
8 5 2
9 6 3

1. Transpose the matrix , turn rows to cols / cols to rows -> A[i][j] <--> A[j][i]

1 4 7
2 5 8
3 6 9

2. Flip horizontally -> reverse row wise ->  A[i][j] <--> A[i][n-j-i]

7 4 1
8 5 2
9 6 3

This is resultant clockwise rotated.

Anti-Clockwise :

1. Reverse row wise

3 2 1
6 5 4
9 8 7

2. Transpose


3 6 9
2 5 8
1 4 7

This is resultant anti-clockwise rotated.




*/

class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length; // n is enough as n == m
        
       //  1. Transpose the matrix , turn rows to cols / cols to rows -> A[i][j] <--> A[j][i]
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // 2. Flip horizontally -> reverse row wise ->  A[i][j] <--> A[i][n-j-i]
        
          
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){ // go till half
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}

/*

TC : O(n*n)
SC : O(1)
*/