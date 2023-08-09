class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int oddCount = 0;
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 ==  1){
                oddCount++;
            }
            else{
                oddCount = 0;
            }
            
            if(oddCount == 3){
                return true;
            }
        }
        
        return false;
    }
}

/*
TC : O(n)
SC : O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Three Consecutive Odds.
Memory Usage: 43.2 MB, less than 19.34% of Java online submissions for Three Consecutive Odds.

*/