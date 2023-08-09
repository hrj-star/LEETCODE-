/*
Sort and 2 Pointer Approach :
---------------------------------------

Sorted array : [1,2,2,3] , limit = 3
Initial boatCount = 0;

1. Element at left = 1 , right = 3 , right == limit , boatCount ++ = 1 , right --

2. Element at left = 1 , right = 2 , right < limit , meaning can add 2 peeps , 1+2 = 3 , boatCount ++ = 2 , left++,  right --

3. Element at left = 2 , right = 2 , 2 < 3 , boatCount++ = 3

*/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int n = people.length;
        int boatCount = 0;
        
        // sort array
        Arrays.sort(people);
        
        // fix 2 pointers
        int light = 0;
        int heavy = n - 1;
        
        while(light <= heavy){
             if(people[light] + people[heavy] <= limit){
                boatCount++;
                light++;
                heavy--;
            }
            else{
                boatCount++;
                heavy--;
            }
        }
        
        return boatCount;
    }
}

/*
TC : O(nlogn)
SC : O(1)
*/