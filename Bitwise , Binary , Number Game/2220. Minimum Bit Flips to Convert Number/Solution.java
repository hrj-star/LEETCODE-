class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        
        // count Set bits in xor
        int countSetBits = 0;
        
        while(xor != 0){
            countSetBits++;
            xor = xor & (xor - 1);
        }
        
        return countSetBits;
    }
}

/*
start = 10 = 1010
goal = 7 = 0111

xor :

1010
0111
------
1101
------

Count set bits in 1101 : 3

*/