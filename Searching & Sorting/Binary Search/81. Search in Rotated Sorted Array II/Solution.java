// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/


class Solution {
  public boolean search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (target == nums[mid]) {
        return true;
      }
      // check if left part is sorted or not
      if (nums[low] < nums[mid]) {
        if (target < nums[low] || target > nums[mid]) { // target lies in right part
          low = mid + 1;

        } else {
          // target lies within this left part
          high = mid - 1;
        }
      } else if (nums[low] > nums[mid]) {
        // right part is sorted
        if (target < nums[mid] || target > nums[high]) {
          high = mid - 1;
        } else {
          // target lies within the right part boundaries
          low = mid + 1;
        }
      } else {

        // duplicates
        low++; // for duplicates to scan further ->  111111112
      }

    }

    // not found

    return false;
  }
}

/*
TC : O(logn)
*/