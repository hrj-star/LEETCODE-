class Solution {
  public int minJumps(int[] arr) {
    int n = arr.length;

    // populate graph with indexes of same values in  a map
    Map < Integer, List < Integer >> map = new HashMap < > ();

    for (int i = 0; i < n; i++) {
      map.computeIfAbsent(arr[i], list -> new ArrayList < > ()).add(i);
    }

    // BFS using Queue
    Queue < Integer > queue = new LinkedList < Integer > ();

    // maintain boolean array to mark visited
    boolean[] visited = new boolean[n];

    int jumps = 0; // final ans

    queue.offer(0); // pushing 0th index into queue as - initially positioned at first index

    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size--> 0) {
        Integer head = queue.poll(); // remove top element

        if (head == n-1) { // if at last index
          return jumps;
        }

        // if out of bounds and already visited , then ignore

        if (head < 0 || head >= n || visited[head]) {
          continue;
        }

        // jump to i + 1
        if (head + 1 < n && !visited[head + 1]) {
          queue.offer(head + 1);
        }

        // jump to i - 1  
        if (head - 1 > 0 && !visited[head - 1]) {
          queue.offer(head - 1);
        }

        // jump to j where: arr[i] == arr[j] and i != j
        if (map.containsKey(arr[head])) { // check if current elements key is present in Hashmap or not
          for (int index: map.get(arr[head])) { // //traversing over indexes of elements same as current element as we can move to them from our current position
            if (index >= 0 && index < n && !visited[index]) { // check for boundary and already visited
              queue.offer(index);
            }
          }
          map.remove(arr[head]); // remove indices of the currently visited from map as they are already visited and we do not want to visit those again - improves time complexiy as avoids duplicates map lookups
        }
        visited[head] = true;
      }
      jumps++; // increment jumps after  current level of BFS
    }

    return 0; // ideally  unreachable as we are reaching last index
  }
}

/*

Complexity Analysis :
-----------------------

TC : O(n)
SC : O(n)


Verdict :
-----------------------
Runtime: 2 ms, faster than 64.58% of Java online submissions for Jump Game II.
Memory Usage: 46.5 MB, less than 13.19% of Java online submissions for Jump Game II.


*/