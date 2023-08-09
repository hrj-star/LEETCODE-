// https://leetcode.com/problems/keys-and-rooms/

class Solution {
    Set<Integer> set = new LinkedHashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        helper(rooms, 0);
        return set.size() == rooms.size();// if the length is equal, it can reach the destination 
    }

    private void helper(List<List<Integer>> rooms, int index) {
        if (set.contains(index)) return;
         set.add(index);
        for (Integer i : rooms.get(index)) {
                helper(rooms, i);
        }
    }
}