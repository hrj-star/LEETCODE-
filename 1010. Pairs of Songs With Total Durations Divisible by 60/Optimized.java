class Optimized {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        int freqmap[] =  new int[60]; // making a freq array of 60
        int counter = 0;
        for(int i = 0 ; i < n ; i++){ // putting remainders in map
            freqmap[time[i] % 60]++;
        }

        for(int i = 0 ; i <= 30 ; i++){
            // special case for i=0,i=30
            if(i == 0 || i == 30){
                int curr = freqmap[i];
                counter += (curr *(curr - 1))/2; 
            }
            else{ // perform at opposite ones -- eg ==> 1 : 59 , 2 : 58 and so on.
                counter += freqmap[i] * freqmap[60 - i]; // count pairs
            }
        }
        return counter;
    }
}


/*

Complexity Analysis :
------------------------------------
TC : O(n)
SC : O(1) / O(60)

Verdict :
------------------------------------
Accepted

*/