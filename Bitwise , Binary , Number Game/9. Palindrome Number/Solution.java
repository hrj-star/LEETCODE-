// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
       
        if(x < 0){
            return false;
        }
        int original = x;
        int rev = 0;
        
        while(x != 0){
            int last = x % 10;
            rev = rev * 10 + last;
            x/=10;
        }
        
       
        return original == rev;
    }
}

/*
TC : O(d)
SC : O(1)
*/