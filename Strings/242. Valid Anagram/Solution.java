class Solution {
    public boolean isAnagram(String s, String t) {
       int[] freq = new int[26];
      
        
        for(char charS : s.toCharArray()){
            freq[charS -'a']++;
        }
        
        for(char charT : t.toCharArray()){
            freq[charT -'a']--;
        }
        
        
        for(int i : freq){
            if(i != 0){
                return false;
            }
        }
        
        return true;
    }
}

/*

TC : O(n)
SC : O(n)

*/

// map solution may work for follow - up -> unicode characters
 
class Solution {
     public boolean isAnagram(String s, String t) {
         
        if (s == null && t == null){
            return true;
        } 
        else if (s == null || t == null){
            return false;
        } 
        else if (s.length() != t.length()){
            return false;
        } 
        
        Map<Character, Integer> map = new HashMap<>();
         
        for(char c : s.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0) + 1); 
        }
         
        for(char c : t.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0){
                return false;
            } 
            else {
               map.put(c, count - 1); 
            }
        }
        
        return true;
    }
}

/*

TC : O(n)
SC : O(n)

*/