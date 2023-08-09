class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length < n-1){
            return -1;
        }
        
         // have to return label from 1 to n , so indegree and outdegree arrays of n+1
        
        int[] indegree = new int[n+1];
        int[] outdegree = new int[n+1]; 
        
        for(int arr[] : trust){
            outdegree[arr[0]]++;
            indegree[arr[1]]++;
        }
        
        // from 1 to n
        
        for(int i = 1; i <= n ; i++){
            if(indegree[i] == n-1 && outdegree[i] == 0){
                return i;
            }
        }
        
        return -1;
    }
}


/*

Complexity Analysis :
----------------------------
TC : O(n)
SC : O(n) where  n = no of nodes

Verdict :
----------------------------
Runtime: 3 ms, faster than 81.43% of Java online submissions for Find the Town Judge.

*/