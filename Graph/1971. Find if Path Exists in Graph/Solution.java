
// https://leetcode.com/problems/find-if-path-exists-in-graph/

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(i,new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a); // do not add in DAG
            
        }
        
        boolean[] visited = new boolean[n];
        return dfs(graph , visited , source , destination);
    }
    
    private boolean dfs(List<List<Integer>> graph , boolean[] visited ,int source, int destination){
      
        Stack<Integer> stack = new Stack<>();
        
        stack.push(source);
        visited[source] = true;
        
        while(!stack.isEmpty()){
            int curr = stack.pop();
            if(curr == destination){
                return true;
            }
            
            // visit unvisited neighbours
            for(int neighbour : graph.get(curr)){
                if(!visited[neighbour]){
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }          
            }
        }
        return false;
    }
}

/*
O(V+E)
O(V+E)
*/