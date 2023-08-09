// https://leetcode.com/problems/sum-of-square-numbers/

// Brute-Force

class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            for (long b = 0; b * b <= c; b++) {
                if (a * a + b * b == c)
                    return true;
            }
        }
        return false;
    }
}

/*


Time complexity : O(c). Two loops upto sqrt{c} . Here, cc refers to the given integer(sum of squares).

Space complexity : O(1)O(1). Constant extra space is used.


*/

// 2 - pointers
class Solution {
    public boolean judgeSquareSum(int c) {
        
        long low = 0;
        long high = (int)Math.sqrt(c);
        
        while(low <= high){
          
                long sqr = (low * low) + (high * high);
           
            
                if(sqr == c){
                    return true;
                }
                else if(sqr > c){
                    high--;
                }
                else if(sqr < c){
                    low++;
                }

        }
   
        
        return false;
    }
}

/*
TC : O(sqrt(c))
*/

// To - do : Binary Search