
/* Simple Solution

[1,0,0,0,1] => n=1 , can change to [1,0,1,0,1] , hence return true.

[1,0,0,0,1] => n=2 , can only change one zero to one , [1,0,1,0,1] and not both , hence false. 

eg 1 0 0 0 1 -> 1 0 1 0 1 , check for prev and next , if 0 , change current to 1 ,and do n--
                  ^ ^ ^
                  p c n
                  
Eg : 0 0 0 0 0 0 0 ,at max can plant  n <= 4 flowers but not greater than that

     1 0 1 0 1 0 1 (true) but if n > 4 ,cannot plant.

                  
if n is exhausted , i.e n<=0 , return true else false . 
edge cases check : 
              
             0 0 1 -> 1 0 1
             1 0 0 -> 1 0 1




*/



class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count=0;
        
        // if n==0
        
        if (n == 0)
            return true;  
        
        // if array is empty
        
        if(length == 0)
            return false;
        
        // if length is 1
        
        if(length == 1){    // if(length==1) { return n==1 && flowerbed[0]==0 } ;
            if(flowerbed[0] == 0){
                flowerbed[0]=1;
                count++;        
            }
        }
    
        
       for(int i=0 ; i<length ; i++){
           
           // edge case , if [ 0 0 1 ] change to [ 1 0 1 ]
           
           // if first element 
           
           if(i==0){   
               if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                   flowerbed[i]=1;
                   count++;
                   
               }
           }
           
           
           // if last element and in form [ 1 0 0] -> [ 1 0 1 ]
           
           
          else if(i==length-1){   
               if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                   flowerbed[i]=1;
                   count++;
              
               }
           }
           
           // for any middle element -> 1 0 0 0 1 -> 1 0 1 0 1
           
           else if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                       flowerbed[i]=1;
                      count++;

                   }
       } // for loop close
    
    // if n is exhausted , properly placed 1's in required positions only return true else false.
    
    return count>=n;
        
    }
}


/*

Complexity Analysis :

TC : O(N)
SC : O(1) - constant space used.

*/

