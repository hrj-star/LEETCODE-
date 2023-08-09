// https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {
        if(s.length() < 2){
            return s;
        }
        
        char[] ch = s.toCharArray();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : ch){
            map.put(c , map.getOrDefault(c, 0) + 1);
        }
        
        // System.out.println(map);// - {r=1, t=1, e=2}
        
           // make a minheap and store according to frequency / map values  in ascending order
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
              pq.offer(entry);
        }
        
         // System.out.println(pq); //- [e=2, t=1, r=1]
        
        // now as queue contains <char,value> in descending order , take out first element and loop till queue not empty
        
        s = ""; // first empty current string to only append ans
        while(!pq.isEmpty()){
            
            Map.Entry<Character,Integer> curr  = pq.poll();
            int curr_freq = curr.getValue();
          
            while(curr_freq --> 0){
                s += String.valueOf(curr.getKey());
            }
        }
        return s;
    }
}

/*
TC : O(nlogn)
SC : O(n)
*/