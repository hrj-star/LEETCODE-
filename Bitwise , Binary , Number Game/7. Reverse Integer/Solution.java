// https://leetcode.com/problems/reverse-integer/

class Solution {

    public int reverse(int x) {
        
        long reverseNum = 0;
        
        while(x != 0){
            reverseNum = reverseNum *10 + x % 10; // -5 , -54
            x /= 10; // -4 , 0    
        }
        
        if(reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE){
            return 0 ;
        }
        
        return (int)reverseNum;
    }
}

// To-do : Without long
//https://leetcode.com/problems/reverse-integer/discuss/1195169/JAVA-faster-than-100.00-less-than-99.22-(abiding-all-rules)