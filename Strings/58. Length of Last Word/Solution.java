// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        
        if (s == null || s.length() == 0){
             return 0;
        }
           
        
        String[] separated = s.split("\\s+");
        String last = separated[separated.length-1];
        
        return last.length();
    }
}