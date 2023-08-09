class Solution {
    
    // public boolean isValid(char c){
    //     if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
    //         return true;
    //     }
    //     return false;
    // }
    
    private String reverse(String strs){
        
        char[] ch = strs.toCharArray();
        
        int left = 0;
        int right = ch.length-1;
    
        while(left < right){
      
                 char temp = ch[left]; // s[i] : as it is char array itself
                 ch[left] = ch[right];
                 ch[right] = temp;

                 left++;
                 right--;
        }
        
        return new String(ch);
    }
    
    public String reverseWords(String s) {
        String[] splitted = s.split("\\s+");
        
        s = ""; // empty given string first
        for(String word : splitted){
            s += reverse(word) + " ";
        }
    
        return s.trim();
    }
}

// O(n)