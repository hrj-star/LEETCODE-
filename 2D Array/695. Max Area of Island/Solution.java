/*

Link : https://leetcode.com/problems/max-area-of-island/
Similar to : https://leetcode.com/problems/number-of-islands/ -- just find maxArea of 1's

DFS Traversal
*/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int maxArea  = 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea , changeLandToWater(grid,i,j));
                    
                }
            }
        }
        return maxArea;
    }
    
    private int changeLandToWater(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        
        // as we visited current 1 , change to 0 to mark visited
        grid[i][j] = 0;
        
        return 1 + changeLandToWater(grid , i-1 , j) + // up
        changeLandToWater(grid , i+1 , j) + // down
        changeLandToWater(grid , i , j-1) +  // left
        changeLandToWater(grid , i , j+1); // right 
    }
}

/*
TC : O(m*n)
SC : O(m*n)

*/