class Solution {
    public char findTheDifference(String s, String t) {
        int total_s1 = 0;
        int total_s2 = 0;
        for(int i = 0; i<s.length(); i++){
            total_s1 += s.charAt(i);
        }
        
        for(int i = 0; i<t.length(); i++){
            total_s2 += t.charAt(i);
        }
        
        int diff = total_s2 - total_s1;
        
        return (char)diff;
    }
}

/*

Complexity Analysis :
----------------------
TC : O(n) - where n is the number of letters in string t.
SC : O(1) - constant variables


Verdict :
------------------------
Runtime: 2 ms, faster than 75.61% of Java online submissions for Find the Difference.
Memory Usage: 42.2 MB, less than 10.86% of Java online submissions for Find the Difference.

*/