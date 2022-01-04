class Solution {
    public int bitwiseComplement(int n) {

        // base case
        if(n == 0){
         return 1;
        }

        int i = 0  , j = 0;  // i = set all bits , eg : i = 7 = 111 , j =  loop for power of 2 through 7

        while(i < n){
            i += Math.pow(2,j);
            j++;
        }

        // if n = 5 , i = 7 , j = 3
        // now 7^5 = 0111 ^ 0101 = 0010 = 2 

      return n ^ i;
    }

}


/*

Complexity Analysis :
------------------------------

TC : O(logN)
SC : O(1)

Verdict :
------------------------------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Complement of Base 10 Integer.

*/