// https://leetcode.com/problems/number-of-matching-subsequences/

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        Map<String,Boolean> map = new HashMap<>();
        
        for(String word : words){
            if(isSubsequence(word , s , map)){
                count++;
            }
        }
        
        return count;
    }
    
    public boolean isSubsequence(String sSource , String tDest , Map<String,Boolean> map){
        
        int sLen = sSource.length();
        int tLen = tDest.length();
        
        if(sLen == 0){
            return true;
        }
        
        if(map.get(sSource) != null) {
            return map.get(sSource);
        }
        
        int indexS = 0 , indexT = 0;
        
        while(indexS < sLen && indexT < tLen){
            if(tDest.charAt(indexT) == sSource.charAt(indexS)){
                indexS++;
            }
            
            if(indexS == sLen){
                map.put(sSource,true);
                return true;
            }
            
            indexT++;
        }
        
        map.put(sSource,false);
        return false;
    }
}

/*

TC : O(n)
SC : O(n)
*/