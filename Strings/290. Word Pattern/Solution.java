// pattern = "abba", s = "dog cat cat dog"
class Solution {
    public boolean wordPattern(String pattern, String s) {
        // mapping : a - dog , b - cat , b - cat , a - dog  --> true 
        // mapping : a - dog , b - cat , b - cat , a - fish  --> false as  a is mapped to dog
        
        String[] words = s.split(" ");
        
        // corner case
        if(words.length != pattern.length()){
            return false;
        }
        
        
        // Hashmap of <Character,String> , eg : < a , dog >
        Map<Character,String> map = new HashMap<Character,String>();
        
        for(int i=0 ; i<pattern.length() ; i++){
            Character key = pattern.charAt(i);
            String value = words[i];
            
            if(map.containsKey(key)){ // if key present , check for corresponding equal mapped value , if not return false
                String existingValue = map.get(key);
                if(!existingValue.equals(value)){
                    return false;
                }
            }
            
            else if(map.containsValue(value)){ // return false if value is already present in map but key isn't
                return false;
            }
            else{ // add <K,V> pair in map if not already exists
                map.put(key,value);
            }
        }
        
        return true;
    }
}


/*

Complexity Analysis :
------------------------------

TC : O(n) : check for n - length of the pattern
SC : O(n) : value pairs in map - n - length of the pattern


Verdict :
------------------------------

Runtime: 2 ms, faster than 30.18% of Java online submissions for Word Pattern.
Memory Usage: 38.5 MB, less than 36.39% of Java online submissions for Word Pattern.

*/