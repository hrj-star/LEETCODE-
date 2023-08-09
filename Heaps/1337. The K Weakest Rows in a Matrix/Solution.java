/*
PQ -> int[] type -> 0 - soldiers / countOnes , 1 - index
a,b -> if soldiers  equal -> a[0] == b[0] , then return index in desc else return soldiers in desc -> b[0] - a[0] 
maintain maxHeap -> upto K eliminate max values

*/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> 
            (a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]) );
        
    
        
        int row = mat.length;
        int col = mat[0].length;
        
       
        
        for(int i = 0 ; i < row ; i++){
            int countOnes = 0;
            for(int j = 0 ; j < col ; j++){
                if(mat[i][j] == 1){
                    countOnes++;
                }
                else{
                    break;
                }
            }
            pq.offer(new int[]{countOnes , i});
        }
        
       //  for(int[] i : pq ){
         //  System.out.println(i[0] + " -> " + i[1]);
       // }
        
        // eliminate extra values
        while(pq.size() > k){
            pq.poll();
        }
       
       
        
        // fill result array
        
       int[] weakArray = new int[k];
       for(int i = k-1; i>=0 ;--i){
           weakArray[i] = pq.poll()[1];
       }
           
        return weakArray;
        
    }
}

/*

TC : O(m*n)
SC : O(m)

<5,4>
<4,1>
<1,2>
<2,0>
<2,3>


<5,4>
<4,1>
<1,2>
<2,0>

size > k = eliminate <5,4>

<4,1>
<1,2>
<2,0>
<2,3>

eliminate = <4,1>


PQ =>  <2,3> <2,0> <1,2> 

weakArray[i] = <2,0,3> ==> weakest to strongest - start filling from last.

*/