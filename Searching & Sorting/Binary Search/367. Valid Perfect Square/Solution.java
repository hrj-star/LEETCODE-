/*
left = 1
right = 8
1+8 = 9 / 2 = 4 
if 4*4 == 16 , yes return true

else if(mid * mid < num) :
left = mid+1

else :
right = mid-1


*/

class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num <= 1){ // base case
            return true;
        }
        
        long low = 1;
        long high = num/2; // sqrt of n will be always lesser than num / 2 search space
        
        while(low <= high){
            long mid = low + (high - low) / 2;
            
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid < num) {
                low = mid + 1;
              }
            else{
                high = mid - 1;
            }
         }
        
        return false;
    }
}

/*
TC : O(logn)
SC : O(1)
*/