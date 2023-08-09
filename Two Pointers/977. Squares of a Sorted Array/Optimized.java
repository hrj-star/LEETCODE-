
// Using 2 pointer - Optimized Solution.

class Optimized {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] result = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            if(Math.abs(nums[left]) > nums[right]){
                result[i] = nums[left] * nums[left];
                left++ ;
            }
            else{
                result[i] = nums[right] * nums[right];
                right-- ; 
            }     
        }
        return result;
    }
}

/*



nums[]  = [-4,-1,0,3,10]
result[] = [0,0,0,0,0]

fill from right to left as square of initial input array(sorted) would be filled at end , it its smaller than next element and if not , then next element's square would be filled.


nums[]  = [-4,-1,0,3,10]
           l          r
           
Math.abs[-4] = 4 > 10 = false , 10*10 =100

result[]     = [0,0,0,0,100]
right --

---------------------------------------------
nums[]  = [-4,-1,0,3,10]
           l       r
           
Math.abs[-4] = 4 > 3 = true , 4*4 = 16
result[]     = [0,0,0,16,100]
left++

----------------------------------------------

nums[]  = [-4,-1,0,3,10]
               l   r
           
Math.abs[-1] = 1 > 3 = false , 3*3 = 9
result[]     = [0,0,9,16,100]
right--


----------------------------------------------

nums[]  = [-4,-1,0,3,10]
               l r
           
Math.abs[-1] = 1 > 0 = true , 1*1 = 1
result[]     = [0,1,9,16,100]
left++

----------------------------------------------

nums[]  = [-4 , -1 , 0 , 3 , 10]
                    l r
           
Math.abs[-0] = 0 > 0 = false , 0*0 = 0
result[]     = [0,1,9,16,100]

result[] filled , return result[].


----------------------------------------------
           
           
           
Complexity Analysis :

TC : O(n)

SC : O(n) - for result array filling.


Verdict : Runtime: 1 ms, faster than 100.00% of Java online submissions.


*/
