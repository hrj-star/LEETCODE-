// https://leetcode.com/problems/largest-rectangle-in-histogram/

class Solution {
  public int largestRectangleArea(int[] heights) {

    if (heights.length == 0) {
      return 0;
    }

    if (heights.length == 1) {
      return heights[0];
    }

    int n = heights.length;
    Stack < Integer > stack = new Stack < > ();


    int max = -1;

    int i = 0;

    while (i < n) {
 
      int arr_curr = heights[i];
   //   int arr_top =;
      if (stack.isEmpty() || arr_curr >=  heights[stack.peek()]) {
        stack.push(i++);
      } else {
          int popped = heights[stack.pop()];
          if (stack.isEmpty()) {
            max = Math.max(max,popped * i);
          } else {
            max = Math.max(max,popped * (i - stack.peek() - 1));
          }
      }
    }

    while (!stack.isEmpty()) {

        int popped = heights[stack.pop()];

        if (stack.isEmpty()) {
          max = Math.max(max,popped * i);
        } else {
          max = Math.max(max,popped * (i - stack.peek() - 1));
        }
    }

    return max;
  }
}


/*
Complexity Analysis :
-------------------------

TC : O(n)
SC : O(n)


Runtime: 170 ms, faster than 5.06% of Java online submissions for Largest Rectangle in Histogram.
Memory Usage: 72.9 MB, less than 45.99% of Java online submissions for Largest Rectangle in Histogram.

*/