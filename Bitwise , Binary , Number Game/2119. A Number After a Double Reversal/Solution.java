// https://leetcode.com/problems/a-number-after-a-double-reversal

class Solution {
    
    public int reverse(int n){
        int rev = 0;
        
        while(n != 0){
            rev = rev * 10 + n % 10;
            n/=10;
        }
        
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        
        if(num == 0){
            return true;
        }
        
        int original = num;
        
        // trim trailing 0's
        while(num % 10 == 0){
            num /= 10;
        }
        
        int reversed1 = reverse(num);
        int reversed2 = reverse(reversed1);
        
        if(original == reversed2){
            return true;
        }
        
  
        
        return false;
    }
}

// simple check , if number is like 1800 i.e has trailing zeroes then double reverse would not give same number , return false else true.

class Solution {
    
    public boolean isSameAfterReversals(int num) {
        
        if(num == 0 || num % 10 != 0)
            return true;
        
        return false;
    }
}

/*
TC : O(1)
SC : O(1)
*/