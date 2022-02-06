class Solution {
    public String modifyString(String s) {
        // base cases
        
        int n = s.length();
        
        if(s == null || n <= 0){
            return s;
        }
        
        if(n == 1 && s.charAt(0) == '?'){
            return "a";
        }
        
        char[] ch = s.toCharArray();
        
        
        for(int i=0 ; i < ch.length ; i++){
            if(ch[i] == '?'){
                for(int c = 'a' ; c <= 'c' ; c++){
                    if(i - 1 >= 0 && c == ch[i-1]){
                        continue;
                    }
                    else if(i + 1 < ch.length && c == ch[i+1]){
                        continue;
                    }
                    else{
                        ch[i] = (char)c;
                        break;
                    }
                }
            }
        }
        
        return String.valueOf(ch);
    }
}

/*
Complexity Analysis : 
-----------------------------
 TC: O(n)
 SC: O(n) == string to char array and back to string

Verdict :
-----------------------------
Runtime: 2 ms, faster than 68.12% of Java online submissions for Replace All ?'s to Avoid Consecutive Repeating Characters.
Memory Usage: 43.4 MB, less than 5.69% of Java online submissions for Replace All ?'s to Avoid Consecutive Repeating Characters.
*/