/*
https://leetcode.com/problems/clone-graph/

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        
        Map<Integer , Node> map = new HashMap<>();
        return cloneGraph(node,map);
    }
    
    public Node cloneGraph(Node node , Map<Integer,Node> map){
        // if already present in map , return same and do not put again
        
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        
        // create new node copy
        
        Node copy = new Node(node.val);
        map.put(node.val,copy);
        
        for(Node neighbor : node.neighbors){
            copy.neighbors.add(cloneGraph(neighbor,map));
        }
        
        return copy;
    }
}


/*

TC : O(N)
SC : O(N)

Runtime: 56 ms, faster than 15.47% of Java online submissions for Clone Graph.
Memory Usage: 43.5 MB, less than 18.72% of Java online submissions for Clone Graph.

*/