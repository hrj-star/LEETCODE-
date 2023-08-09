
/*

Link : https://leetcode.com/problems/path-with-maximum-gold/
Similar to :  https://leetcode.com/problems/max-area-of-island/

DFS Traversal

*/

class Solution {
    public int getMaximumGold(int[][] grid) {
        
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int maxGold = 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        // maintain visited array
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0 ){ // never visit 0 , so visit cells > 0
                     maxGold = Math.max(maxGold , findMaxGold(grid , i , j , visited));
                }
            }
        }
        return maxGold;
    }
    
    private int findMaxGold(int[][] grid, int i, int j , boolean[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]){ // if boundary ,  0  and already visited - return 0
            return 0;
        }
        
        // mark current visited
        visited[i][j] = true;
        
        int up = findMaxGold(grid , i - 1 , j , visited); // up
        int down = findMaxGold(grid , i + 1 , j , visited); // down
        int left = findMaxGold(grid , i , j - 1 , visited); // left
        int right = findMaxGold(grid , i , j + 1 , visited); // right 
        
        // current is visited , mark it false
        visited[i][j] = false;
        
        return Math.max(up , Math.max(down , Math.max(left,right))) + grid[i][j];
    }
}

/*
TC : O(m*n)
SC : O(m*n)

*/