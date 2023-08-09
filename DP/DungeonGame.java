class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        
        int row = dungeon.length + 1;// 4
        int col = dungeon[0].length + 1; // 4
        
        int[][] dp = new int[row][col]; // 4*4 , last at (3,3) - queen
        
        for(int r = row - 1 ; r >= 0 ; r--){
            for(int c = col - 1; c >= 0 ; c--){
                if(r == row - 2 && c == col - 2){
                    dp[r][c] = dungeon[r][c] <= 0 ? -dungeon[r][c] + 1 : 1; // for last where queen placed
                }
                else if(r == row - 1 ){
                    dp[r][c] = Integer.MAX_VALUE;
                }
                else if(c == col - 1){
                    dp[r][c] = Integer.MAX_VALUE;
                }
                else{
                    int right = dp[r][c+1];
                    int down = dp[r+1][c];
                    
                    int mini = Math.min(right,down);
                    
                    int health = mini - dungeon[r][c];
                    
                    int ans;
                    
                    if(health >= 1){// >0
                        ans = health;
                    }
                    else{
                        ans = 1;
                    }
                    
                    dp[r][c] = ans;
                }
            }
        }
        
        return dp[0][0];
    }
}