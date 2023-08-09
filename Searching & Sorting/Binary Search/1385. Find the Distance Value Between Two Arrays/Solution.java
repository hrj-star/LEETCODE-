// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2); 
        
        /*
        arr2 : 1,8,9,10
        4 -> next closest -> 8 , 8-4 = 4 > 2 -> count++
        5 -> next closest -> 8 , 8-5 = 3 > 2 -> count++
        8 -> next closest -> 8 , 8-8 = 0 < 2 
        
        
        */
        
        int distanceCount = 0;
        
        for(int n : arr1){
            if(!findClosest(arr2 , n + d , n - d)){
                distanceCount++;
            }
        }
        
     
        return distanceCount;
        
    }
    
    private boolean findClosest(int a[] , int rightClosest , int leftClosest){ // right closest is closest greater , leftClosest is closest smaller
        int n = a.length;
        
        int low = 0;
        int high =  n - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(a[mid] <= rightClosest && a[mid] >= leftClosest){
                return true;
            }
            else if(a[mid] < leftClosest){
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

TC : O(nlogn + log n) // sort + binary search
*/