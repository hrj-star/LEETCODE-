class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        for(int i=0 ; candies > 0 ; ++i){
            arr[i % num_people] += Math.min(candies ,  i + 1);
            candies -= i+1;
        }
        return arr;
    }
}

/*

Time O(sqrt(candies) + n)
Space O(n) for output

The number of given candies is i + 1, which is an increasing sequence.
The total number distributed candies is c * (c + 1) / 2 until it's bigger than candies.
So the time it takes is O(sqrt(candies))

*/

  