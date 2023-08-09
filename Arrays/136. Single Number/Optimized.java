
/*

using XOR -> same two numbers cancel out each other(as they appear twice) and return 0.  [4,1,2,1,2] = 1^1^2^2^4= 0^0^4 = 4.

a⊕b⊕a=(a⊕a)⊕b=0⊕b=b

code walkthrough and xor updation : xor = 4  , 4 ^ 1 = 5 , 5 ^ 2 = 7 , 7 ^ 1 = 6 , 6 ^ 2 = 4 ; ans = xor = 4.

*/

class Optimized {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor^=i;
        }
        
        return xor;
    }
}


/*

Complexity analysis :
----------------------------
TC : O(N) - iterate through array to compute xor .
SC : O(1) - constant space for xor .

Verdict :
----------------------------
Runtime: 1 ms, faster than 95.92% of Java online submissions for Single Number.
Memory Usage: 50.1 MB, less than 36.16% of Java online submissions for Single Number.

*/
