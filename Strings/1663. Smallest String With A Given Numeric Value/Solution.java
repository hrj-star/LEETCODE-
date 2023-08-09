// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/

class Solution {
    public String getSmallestString(int n, int k) {
        
        char[] ch = new char[n];
        
        // fill all with a's and reduce one k 
        for(int i=0 ; i<n ; i++){
            ch[i] = 'a';
            k--;
        }
        
        // start from last index and fill with other chars
        int index = ch.length - 1;
        
        while(k >= 26){
            ch[index] = 'z';
            k = k + 1 - 26;
            index--;
        }
        
        ch[index] = (char)(k + 'a');
        return new String(ch);
    }
}

/*

TC : O(n)
SC : O(n)

*/