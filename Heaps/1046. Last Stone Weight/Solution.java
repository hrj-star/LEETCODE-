class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int n = stones.length;
        
        // sort array
        Arrays.sort(stones);
        
        // go from right to left , subtract greate - smaller , put in smallers place and again sort array to simulate again
        
        for(int i = n-1 ; i > 0 ; i--){
            stones[i - 1] = stones[i] - stones[i-1];
            Arrays.sort(stones);
        }
        
        return stones[0];
    }
}

/*
TC : O(nlogn) * O(nlogn)
SC : O(1)
*/

/*
2,7,4,1,8,1

Max heap :

8,7,4,2,1,1 -> 8-7 = 1
4,2,1,1,1   -> 4 - 2 = 2
2,1,1,1     -> 2 - 1 = 1
1,1,1       -> 1-1 = 0
1,0         -> 1 - 0 = 1
1


2. 2,7,7
PQ => 7,7,2 => 7 == 7 , remove both , hence only 2 remains in queue
*/
class Solution {
    public int lastStoneWeight(int[] stones) {
        // defining maxheap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int stone : stones){
            pq.offer(stone);
        }
        
        
        while(pq.size() > 1){
            int max = pq.poll();
            int secondmax = pq.poll();
            
            if(max != secondmax){
                pq.offer(max - secondmax);
            }
            System.out.println(pq);
        }
        
        return pq.isEmpty() ? 0 : pq.peek();
    }
}

/*
TC : O(nlogn) 
SC : O(n)
*/