// https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // need to fill pixels with newColor
        
        if(image[sr][sc] != newColor){
            dfs(image , sr , sc , image[sr][sc] , newColor); // image[sr][sc] represents current color
        }
        
        return image;
    }
    
    private void dfs(int[][] image, int i, int j, int currentColor , int newColor){
         if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != currentColor){
            return;
        }
        
        // color the pixel
        image[i][j] = newColor;
        
        dfs(image , i + 1 , j , currentColor, newColor); // up
        dfs(image , i - 1 , j , currentColor ,  newColor); // down
        dfs(image , i,  j - 1 ,  currentColor, newColor); // left
        dfs(image , i , j + 1 , currentColor, newColor); // right
    }
}

/*
TC : O(m*n)
SC : O(m*n) - dfs recursion space
*/