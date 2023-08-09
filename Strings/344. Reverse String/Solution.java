
// two pointer solution

class Solution {
    public void reverseString(char[] s) {
        
        int start = 0;
        int end = s.length-1 ;  // till end - 1
        
        while(start<end){
            
            char temp = s[start]; // s[i] : as it is char array itself
            s[start] = s[end];
            s[end] = temp;
            
            start++;
            end--;
            
        }
       
    }
}

/*

Complexity Analysis :

TC : O(N/2) = O(N) : traverse till middle on;y 

s[] = h e l l o

start = 0 = h , end = 4 = o 
swap 
start = o , end = h

------------------------------

start = 1 = e , end = 3 = l
swap 
start = l , end = e

-------------------------------
start = 2 = l  , end = 2 = l

while(2<2) , out of loop 

return : olleh


SC : O(1) = inplace 

*/

