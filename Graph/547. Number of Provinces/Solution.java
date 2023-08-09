// https://leetcode.com/problems/number-of-provinces/

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        
        boolean[] visited = new boolean[n];
        
        int count = 0 ;
        
        for(int i=0 ; i<n ; i++){
            if(!visited[i]){
                dfs(i, isConnected , visited);
                count++;
            }
        }
        return count;
    }
        
        public void dfs(int source , int[][] isConnected , boolean[] visited){
            visited[source] = true;
            for(int j = 0 ; j < isConnected[source].length ; j++){
                if( isConnected[source][j] == 1 && visited[j] == false){
                    dfs(j , isConnected , visited);
                }
            }
      }
 }