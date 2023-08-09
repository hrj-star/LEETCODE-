/*

Input: s = "abcdecba"
Output: true

If equal , move forward .
If unequal ,
skip any one and check if another palindrome or not

left = 0 ,
right = n-1

s[left] = a
s[right] = a
a == a , move forward - left ++ , right --
b == b , move forward - left ++ , right --
c == c , move forward - left ++ , right --
d != e , skip any one 
let e be skipped - right -- 
d == d , yes 
return true as string is palindrome by skipping atmost one char

*/

class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        
        int left = 0;
        int right = n-1;
        
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
        }
        
        return true;
    }
    
    public boolean isPalindrome(String s , int i , int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/*
Time Complexity :- O(n)
Space Complexity :- O(1)
*/