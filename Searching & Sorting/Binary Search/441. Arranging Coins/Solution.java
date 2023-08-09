/* 1 , 2 , 3 ....k = arithmetic sequence : k * (k + 1) / 2

n = 5
low = 0 , high = 5
mid = 2

sum = 2*3/2 = 3


(3 < 5) , yes ,  go right

low = 3
high = 5
mid = 4
sum = 4*5 / 2 = 5
 DOOOOO

*/
class Solution {
    public int arrangeCoins(int n) {
        
       long low = 0, high = n;
        
        while(low <= high){
            
            long mid = low + (high-low) / 2;
            
            long sum = mid*(mid+1)/2;
            
            if(sum == n){
                return (int)mid;
            }
            else if(sum < n){
                low = mid + 1;
              
            }
            else{
               high = mid-1;
            }
        }
        return (int)high;
    }
}

/*

O(logn)
O(1)
DO - O(n)
*/