class Recursive {
    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s , t , 0 , 0);
    }
    
    public boolean isSubsequence(String s , String t , int indexS , int indexT){
        if(indexS == s.length()){
            return true;
        }
        
        if(indexT == t.length()){
            return false;
        }
        
        if(s.charAt(indexS) == t.charAt(indexT))
           return isSubsequence(s , t , indexS + 1 , indexT + 1);
    
        else
           return isSubsequence(s , t , indexS , indexT + 1); 
    }
}

/*

TC : O(sLen + tLen) / O(min(sLen , tLen))
SC : Recursion Stack



To - do : Follow - up

*/
