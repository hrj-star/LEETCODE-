// 4) O(n) , O(1) - when cannot change position of elements - Cycle Detection using hare and tortoise approach - 2 pointers - slow and fast , slow moves by one step , fast by 2 steps

class Solution {
    public int findDuplicate(int[] nums) { 
        
        int n = nums.length;
        
        // Cycle Detection using hare and tortoise approach - 2 pointers - slow and fast , slow moves by one step , fast by 2 steps
        int slow = nums[0]; // 1
        int fast = nums[0]; // 1
        
        while(true){
            slow = nums[slow]; // hop by 1 - slow = 3
            fast = nums[nums[fast]]; // double indexing will move fast by 2 hops // fast = nums[nums[1]] = nums[3] = 2  
            if(slow == fast){ // cycle detected - slow = 2 , fast = 2
                break;
            }
        }
        
        slow = nums[0]; // start of slow pointer
        
        /*
            
            iterate until they both meet at same element , thats the 1st element in cycle and also the duplicate --> [1 - 3 - 4 - 2(fast,slow) - 2]
                                                                                                                                  ^______________|
                                   
        */   

        while(slow != fast){ 
            slow = nums[slow];
            fast = nums[fast]; // 2 - 4 - 2
        }
        
        return slow;
    }
}

/*

1) Brute Force :  O(n^2) - TLE
-----------------------

    public int findDuplicate(int[] nums) { // O(n^2) - TLE
        
        int n = nums.length;
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    return nums[i]
                }
            }
        }
        return 0; // or whatever
    }




2) Sorting :  TC : O(nlogn) , SC : O(1) -- when changes in element position allowed
--------------------------------


    public int findDuplicate(int[] nums) { 
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for(int i=1;i<n;i++){
             if(nums[i] == nums[i-1]){
                 return nums[i];
             }
         }

        return 0; // or whatever
    }



3) Using Freq array / visited array /  Set :  TC : O(n) , SC : O(n) -- when extra space allowed
--------------------------------


    public int findDuplicate(int[] nums) { 
        
        int n = nums.length;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : nums){
             if(!set.add(num)){
                 return num;
             }
         }

        return 0;
    }




    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int xor = nums[i] ^ nums[i+1];
            if(xor==0){
               return nums[i];
            } 
        }
        return -1;
    }


==> Below code wont work for [2,2,2,2,2] where repeated appears multiple times
class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        
        int xor  = 0;
        
        for(int i=0 ; i<n ; i++){
            xor ^= nums[i];
        }
        
        for(int i=1 ; i<=n-1 ; i++){
            xor^=i;
        }
        
        return xor;
    }
}
*/