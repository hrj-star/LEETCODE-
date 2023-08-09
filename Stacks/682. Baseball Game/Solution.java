// https://leetcode.com/problems/baseball-game/

class Solution {
    
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : ops){
            if(s.equals("+")){
                int firstTop = stack.pop();
                int secondTop = stack.peek();
                int operation = firstTop + secondTop;
                stack.push(firstTop);
                stack.push(operation);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(2 * stack.peek());
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        
        int ans = 0;
        
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        
        return ans;
    }
    
}

/*
TC : O(n)
SC : O(n)
*/