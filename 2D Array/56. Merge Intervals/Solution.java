/*

https://leetcode.com/problems/merge-intervals/

Sort on basis of increasing order of start - intervals[0]

1 3 
2 6
8 10
15 18

1. If first interval , then add 

2. compare next intervals start with previous's end , if smaller then set previous end to Max(previous end , current's end)

3. else add current interval
2 < 3 , yes then set 1,3 end to max(3,6) = 6 -> merged -> [[1,6],[8,10],[15,18]]
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> list = new ArrayList<>();
        
        // Sort on basis of increasing order of start - intervals[0]
        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
        
        for(int[] interval : intervals){
            // if first interval , add into list
            if(list.size() == 0){
                list.add(interval);
            }
            else{
                int previous[] = list.get(list.size() - 1);
                if(interval[0] <= previous[1]){ // [[1,4],[4,5]] ==> [[1,5]]
                    previous[1] = Math.max(interval[1] , previous[1]);
                }
                else{
                    list.add(interval); // else append after current
                }
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
/*
TC : O(nlogn)
SC : O(1)
*/