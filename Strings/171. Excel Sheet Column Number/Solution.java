class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i=0 ; i<columnTitle.length() ; i++){
            char c = columnTitle.charAt(i);
            int convertChar = c -'A' + 1 ; // convert to char and add 1 as A -> 1 in question
            ans = ans * 26 + convertChar;
        }
        
        return ans;
    }
}


/*

AB = 
A = 'A' - 'A' + 1 = 1
ans = 0*26 + 1 = 1

B = 'B' - 'A' + 1 = 2
ans = 1*26 + 2 = 26 + 2 = 28

Complexity Analysis :
--------------------------
TC : O(n)
SC : O(1)


Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 41.2 MB, less than 35.03% of Java online submissions for Excel Sheet Column Number.
*/