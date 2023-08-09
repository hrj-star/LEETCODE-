// https://leetcode.com/problems/kth-largest-element-in-a-stream/

class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        
        for(int n : nums){
            add(n);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val); // add elements in minheap
        
        while(minHeap.size() > k){
            minHeap.poll();
        }
        
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

/*

TC : O(nlogk)
SC : O(k)
    
*/