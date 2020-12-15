
class Optimized {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n : nums){
            if(i == 0 || i == 1 || n!=nums[i-2]) // i-2 : check if current not equal to previous second element 
                nums[i++] = n;
        }
        
        return i;
    }
}


/*

if i is at 0th or 1th index , can place directly and then from third , compare third with first , fourth with second and so on.

eg   : 1  1  1  2  2  3

After placing 1st two elements , nums[] = 1 1 
          
compare 1  1  2  2  3 : 1 != 2 , nums[] = 1 1 2
        ^     ^

compare 1  1  2  2  3 : 1 != 2 , nums[] = 1 1 2 2
           ^     ^

compare 1  1  2  2  3 : 2 != 3 , nums[] = 1 1 2 2 3
              ^     ^
     

Complexity Analysis :

TC : O(n)
SC : O(1) - inplace

Verdict : Runtime: 0 ms, faster than 100.00% of Java .  

*/
