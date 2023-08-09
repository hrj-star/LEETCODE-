// https://leetcode.com/problems/shortest-path-visiting-all-nodes/

/*

Bit Vector can be generally used in place of arrays when the problem needs the state which can vary from 0 to 2^n-1, n being the length of the array which is nodes in this case. Helps with saving space, CPU operations are also faster on bits.

not a typical BFS problem as can't maintain visited nodes array as edges / nodes can be traversed more than once as given in question -> 1 , 0 , 2 , 0 , 3

need to avoid loops by maintaining visited state : eg : need to avoid - 0 , 1 , 0 , 1 etc
*/

class Solution {
    public int shortestPathLength(int[][] graph) {
        // if only one node , return 0 as no paths can be formed
        if(graph.length == 1){
            return 0;
        }
        
        int finalState = (1 << graph.length) - 1; // eg : if 3 nodes then final state is 2 ^ 3 - 1 = 7 = 111 - left shift = (1 << 2^3) - 1
        
        int shortestPath = 0;
        
        Queue<int []> queue = new LinkedList<>(); // type as array of integers - {i , currentBitState}
        
        // adding all nodes into queue as we start from anywhere
        for(int i=0;i<graph.length;i++){
            queue.add(new int [] {i , 1 << i}); // 0 - 0001 , 1 - 0010 , 2 - 0100 , 3 - 1000
        }
        
        
        // [no of nodes] [each node having 2^n visited bit]
		int [][] visitedState = new int [graph.length][finalState+1];
        
        while(!queue.isEmpty()){
            int size = queue.size(); 
            shortestPath++; // visiting first node
            
            for(int i=0;i<size;i++){
                // retrieve topmost head from queue
                int[] head = queue.poll();
                int node = head[0];
                int nodeVisitedBitState = head[1];
                
                // iterate to neighbours
                for(int neighbor : graph[node]){
                    int newVisitedBitState = nodeVisitedBitState | (1 << neighbor); // calculate new visited bit state while visiting neighbors
                    
                    // if new visited bit state is already visited continue else put + 1 to mark visited state
                    
                    if(visitedState[neighbor][newVisitedBitState] == 1){
                        continue;
                    }
                    else{
                        visitedState[neighbor][newVisitedBitState] = 1;
                    }
                    
                    // if new bit state == final state return shortest path
                    if(newVisitedBitState ==  finalState){
                        return shortestPath;
                    }
                       
                    // add current neighbor and its state in queue
                    queue.add(new int[] {neighbor , newVisitedBitState });
                }
            }
            
        }
        
        return -1;
    }
}

/*
TC: O(2^n * n^2) ; SC: O(n * 2^n)
Runtime: 7 ms, faster than 100.00% of Java online submissions for Shortest Path Visiting All Nodes.
Memory Usage: 42.3 MB, less than 85.58% of Java online submissions for Shortest Path Visiting All Nodes.

https://leetcode.com/problems/shortest-path-visiting-all-nodes/discuss/549233/Breadth-First-Search(BFS)with-intuitive-approach-Thinking-process-or-13-ms

*/