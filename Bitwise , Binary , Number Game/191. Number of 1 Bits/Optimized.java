
public class Solution {
    // you need to treat n as an unsigned value
    
    // Approach : Count number of set bits
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n = n & (n-1);
            count++;  
            
        }
        
        return count;
        
    }
}

/*

Brian Kernighan Algorithm : When 1 is subtracted from any number then all the bits after rightmost bit having value 1(set bit) and including the right-most set bit itself gets flipped. Repeat this again and again until all the bits converted to unset bits or number converts to 0.
In each turn every right-most set bit will get flipped so, count of set bits will be equal to number of turns/loops required to make number equal to 0.

Example & Code Walkthrough :
----------------------------

n=12 : 00001100 , count set bits in 12 

Initially , count = 0;


1) 12 & 11

    00001100 
& 
    00011011
-----------------
    00001000  = 8
------------------

count = 0+1 = 1


2) 8 & 7

    00001000
&
    00000111
-------------------
    00000000 = 0
-------------------

count = 1+1 = 2 

n=0 , stop processing .

count = 2 , it took 2 turns / loops from 12 to 0.
So , set bits in 12 = 2.



------------------------------



Complexity : TC :  O(logn) - As its loops over the binary number to flip everytime the right-most set bit until the number get equals to 0.

*/

