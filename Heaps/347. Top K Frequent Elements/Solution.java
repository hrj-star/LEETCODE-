class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // create hashmap storing <elements , frequency> pair -> {1=3 , 2 = 2 , 3 = 1}
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n , map.getOrDefault(n, 0) + 1);
        }
        
        // make a minheap and store according to frequency / map values  in ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        
        int[] res = new int[k];
        
        for(Integer key : map.keySet()){
            pq.offer(key);
            
            while(pq.size() > k){
                pq.poll(); // will remove less freq 
            }
        } // [2,1]
        
        while(!pq.isEmpty()){
            res[--k] = pq.poll(); // [1,2]
        }
        
        return res;
    }
    
}

/*
TC : O(nlogk)
SC : O(k)
*/