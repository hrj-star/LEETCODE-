class Solution {
    public int addDigits(int num) {
        if(num <= 9){
            return num;
        }
        
        int ans = computeSum(num);
        return ans;
    }
    
    private int computeSum(int n){
        int sum = 0;
        int digit = 0;
        while (n / 10 != 0){
            sum = 0;
            while(n != 0){
                digit = n%10;
                sum += digit;
                n /= 10 ;
            }
            n = sum;
        }
        
        return sum;
    }
}

/*
Complexity Analysis :
=======================

TC : O(n)
SC : O(1)



Verdict :
=======================

Runtime: 2 ms, faster than 59.15% of Java online submissions for Add Digits.
Memory Usage: 41.4 MB, less than 8.38% of Java online submissions for Add Digits.
*/


class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return num;
        }
        
        if(num % 9 == 0){
            return 9;
        }
        else{
            return num % 9;
        }
    }
}

/*
Complexity Analysis :
=======================

TC : O(n)
SC : O(1)



Verdict :
=======================

Runtime: 1 ms, faster than 98.89% of Java online submissions for Add Digits.
Memory Usage: 42.1 MB, less than 5.27% of Java online submissions for Add Digits.
*/