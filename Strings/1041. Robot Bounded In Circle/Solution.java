class Solution {
    public boolean isRobotBounded(String instructions) {
        int a = 0,b = 0; // origin points
        int dir = 0; // 0 - N , 1 - E , 2 - S , 3 - W
        
        int[][]directions = {{0,1},{1,0},{0,-1},{-1,0}}; // directions points -> N,E,S,W
        
        int len =  instructions.length();
        
        for(int i=0;i<len;i++){
            
            char ch = instructions.charAt(i); // get current char while traversing given string
            
            if(ch == 'G'){
                a = a + directions[dir][0]; // add to a units  at current position
                b = b + directions[dir][1]; // add to b units  at current position
            }
            else if(ch == 'L'){
                if(dir == 0){
                    dir =  3; // move from N -> W
                }
                else{
                    dir = dir - 1; // move from E -> N
                }
            }
            else if(ch == 'R'){
                dir = (dir + 1) % 4; // move from N -> E and W -> N
            }
        }
        
        // cases when to return  true or false
        
        if(a == 0 && b == 0){
            return true; // if final same as initial , return true as back to same plane / origin
        }
        else if(dir == 0){
            return false; // if direction same as initial , meaning it has chances to move away from plane as its moving straight , it will never come back to origin
        }
        else{
            return true; // if both directions and position changed , return true
        }
    }
}


/*

Complexity Analysis :
---------------------------

TC : O(N) 
SC : O(1)

Verdict :
---------------------------

Runtime: 1 ms, faster than 33.83% of Java online submissions for Robot Bounded In Circle.
Memory Usage: 39.3 MB, less than 7.55% of Java online submissions for Robot Bounded In Circle.

*/