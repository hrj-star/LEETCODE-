// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class Solution {
    public int countNegatives(int[][] grid) {

        if(grid.length == 0 || grid == null){
            return 0;
        }


        int row =  grid.length;
        int col = grid[0].length;
        
        int count = 0;
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        
        return count;
    }
}

/*
TC  : O(row * col)
SC  : O(1)
*/


/* 
If the first element is negative, that means all elements after it are negative as array is sorted in descending order , eg : [-1,-1,-2,-3] as -1 < 0 , 4-0 = 4 , total 4 elements in this row are negative.


Start matrix with x - positive numbers, -x negatives:
 x  x  x -x
 x  x  x -x
 x  x -x -x
-x -x -x -x

Here is a path of binary search (idea is move from bottom left point to the up right point):
[-x] - point where we go to the row upper
(x)  - point where we go to the next (right) column

  x    x    x [-x]  (move up, result + 1)
  x    x   (x)[-x]  (move right, up, result + 1)
 (x)  (x) [-x] -x   (move right, right, up, result + 2)
[-x]  -x   -x  -x   (move up, result + 4)



*/

class Solution {
    public int countNegatives(int[][] grid) {
        
        if(grid.length == 0 || grid == null){
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        
        int i = rows - 1, j = 0; // start from left bottom
        int count = 0;
        
        while(i >=0  && j < cols){
            
            if(grid[i][j] < 0){
                count += cols - j;
                i--; // go to upper row
                
            }else{
                
                j++; // go to right col
                
            }
        }
        
        return count;
    }
}

/*
TC  : O(m + n)
*/


// binary search as matrix is sorted

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row : grid){
            count += binarySearch(row);
        }
        return count;
    }

       private int binarySearch(int[] row){
           
            int low = 0, high = row.length;
           
            while(low < high){
                
                int mid = low + (high - low) / 2;
                if(row[mid] < 0){
                     high = mid;
                }
                else{
                    low = mid + 1;
                }
                   
            }
            return row.length - l;
        }
}

/*
TC  : O(mlogn)
*/