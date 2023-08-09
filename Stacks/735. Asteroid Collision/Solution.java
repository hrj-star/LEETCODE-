
/*

Explanation :
--------------

positives moves right -> , negatives moves left <- .

array : 10  2  -5

move  : ->  ->  <-

Now , we only care about -> <- opposite directions 

if we find positives , push it into stack and move forward.
Once , if negative found after a positive , i.e [2 , -5], compare abs(-5) = 5,5>2 so 2 is destroyed and now :
Array : [10 , -5]
         ->    <-
         
Compare abs(-5) = 5 < 10 , 5 is destroyed ,and now :

Array :[10]

Thus , return the array .
         
Special case : [10 5 -5] : abs(-5)=5 , 5 == 5 , destroy  both the asteriods.    




*/



class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<asteroids.length;i++){
            int asteroid = asteroids[i];
            // if +ve asteroid , push into stack.
            
            if(asteroid > 0){
                stack.push(asteroid);
            }
            else{
                
                // check for stack empty as we dont want to pop from empty stack , and top is positive and   less than abs of current , then pop / destroy the smallest asteroid . Eg : [2 -5] -> 2 is destroyed -> [-5]
                
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid){
                    stack.pop();
                } // while close 
                
                // after while loop done , if stack is empty and  we see an element , we push that in stack , or if stack top is negative ,  we push current negative asteriod to stack , as they both move in same direction.
                
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(asteroid);
                }
                
                // if both elements are equal -> [5 , -5] , pop 5 and do not push -5.
                else if(stack.peek() == -asteroid){
                    stack.pop();
                }
                
            }
        } // for close 
        
        
        // return the array , reverse way as we remove fron stack
        
        
        int[] arr = new int[stack.size()];
        
        for(int i=stack.size()-1 ; i >= 0 ; i--){
            arr[i] = stack.pop();
        }
        
        
        return arr;
        
    }
}





/* 

Complexity Analysis:

TC : O(N) , linearly traverse given array

SC : O(N) , based on while and if-else condition , push and pop every single element  to and from stack .

Verdict : Runtime: 5 ms, faster than 57.73% of Java online submissions for Asteroid Collision.


*/

