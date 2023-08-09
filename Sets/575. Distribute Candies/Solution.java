class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candySet = new HashSet<>();
        
        for(int candy : candyType){
            candySet.add(candy);
        }
        
        return Math.min(candyType.length / 2 , candySet.size());
    }
}

/*

TC : O(n)
SC : O(n)

Runtime: 88 ms, faster than 11.58% of Java online submissions for Distribute Candies.
Memory Usage: 111.6 MB, less than 34.23% of Java online submissions for Distribute Candies.
*/