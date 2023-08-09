//https://leetcode.com/problems/guess-number-higher-or-lower/
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


// binary search as we are dealing with sorted numbers from 1 to n.

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            int returned = guess(mid);
            
            if(returned == 0){
                return mid;
            }
            else if(returned == 1){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return -1;
    }
}

/*
TC : O(log n)
SC : O(1)
*/