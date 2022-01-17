class Solution {
    public int myAtoi(String s) {
        
        // return 0 for empty string as no valid converison to be done
        if(s == null || s.length() == 0){
            return 0;
        }
        
        int n = s.length() , i = 0;
        
        //ignoring the whitespaces -  traverse till end and check for ' '(spaces) and keep incrementing if any space (i++) to skip it
        
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        
        
        // if all spaces , then return 0
        if(i >= n){
            return 0;
        }
        
        // check for sign
        int sign = 1; // let sign be positive for final value , initially
        
    
        // change to -1 if '-' sign , skip the sign index position
        
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
           sign = s.charAt(i++) == '+' ? 1 : -1;
        }
        
        
        long  res = 0;
        
        while(i < n && Character.isDigit(s.charAt(i))){
            res = res * 10 +  (s.charAt(i++) - '0');
            if(res * sign > Integer.MAX_VALUE || res * sign < Integer.MIN_VALUE){
                 return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        
        return (int) (res * sign);
    }
}

/*

Complexity Analysis :
-----------------------------
TC : O(n) , n - length of string , traversing string and applying checks
SC : O(1)

Verdict :
-----------------------------
Runtime: 1 ms, faster than 100.00% of Java online submissions for String to Integer (atoi).
Memory Usage: 39 MB, less than 70.82% of Java online submissions for String to Integer (atoi).

*/