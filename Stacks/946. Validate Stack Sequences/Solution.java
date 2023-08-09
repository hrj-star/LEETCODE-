class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, n = pushed.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int num : pushed){
            stack.push(num);
            
            while(!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++; // ++i
            }
        }
        
        return stack.isEmpty();
    }
}

/*

TC : O(n)
SC : O(n)

*/
