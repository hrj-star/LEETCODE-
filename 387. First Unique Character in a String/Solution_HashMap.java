
// Using HashMap 



class Solutionz {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] ch = s.toCharArray();
        for(char c : ch ){
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            else{
                map.put(c,1);
            }
            
        }
        
       for(int i=0 ; i<s.length(); i++){
           if(map.get(s.charAt(i)) == 1){
               return i;
           }
       }
        
        return -1; // if not exists
        
        
    }
}


/*

1) Create one frequency map.
2) For each character c in the string, do :

 i) if c is not in frequency, then insert it into frequency, and put value 1
 otherwise, increase the count in frequency.
 
3). Scan the string and check if the value of the ith character in the map    is 1 then return i.

4. Return -1, in case of the value of each character in the map, is greater than 1




Complexity analysis : 

TC : O(2N) --> O(N)  - Building hashmap and traversing for unique char - we traverse entire string twice.

SC : O(1) - considering constant O(26) or O(N).

*/


