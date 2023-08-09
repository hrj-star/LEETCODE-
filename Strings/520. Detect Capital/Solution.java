class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals = 0;
        boolean firstLetterCapital = false;
        int n = word.length();
        
        for(int i=0 ; i<n ; i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                capitals++;
                if(i==0){
                    firstLetterCapital = true;
                }
            }
        }
        
        return capitals == n || capitals == 0 || (capitals == 1 && n >= 1 && firstLetterCapital);
    }
}


/*

Complexity Analysis :
---------------------------
TC : O(n)
SC : O(1)

Verdict :
---------------------------
Runtime: 2 ms, faster than 59.30% of Java online submissions for Detect Capital.
Memory Usage: 38.6 MB, less than 55.23% of Java online submissions for Detect Capital.

*/