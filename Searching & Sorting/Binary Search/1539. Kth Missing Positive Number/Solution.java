/*

arr = [2,3,4,7,11], k = 5
       0 1 2 3 4
left = 0
right = arr.length = 5

mid =  (0+5)/2 = 2

missing numbers on left of mid = arr[mid] -  (mid+1) = 4 - 3 (include mid too) = 1 i.e 1 missing from 2,3,4

if(missing numbers >= k ){
go left;
}
else{
go right
}

return low + k;



*/


class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int num:arr){
            if(num<=k){
                k++;
            }
        }
        
        return k;
        
    }
}



class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low =  0;
        int high = arr.length;
        
        while(low < high){
            int mid = low + (high - low) / 2;
            
            
            int missing_numbers = arr[mid] - (mid + 1);
            
            
            if(missing_numbers >= k){
                high = mid;
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return low + k;
    }
}

/*

TC : O(log n)
SC : O(1)
*/