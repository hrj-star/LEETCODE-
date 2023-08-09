class Solution {
    public String minRemoveToMakeValid(String s) {
       // remove extra ) , ( , they must be equal
        
        
        if(s.length() == 0 || s == null){
            return "";
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
      for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch))
                continue;
            if(ch == '(')
                stack.push(i);
            else {
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '('){
                     stack.pop();
                } 
                else {
                     stack.push(i);
                }
            }
        }
        
        HashSet<Integer> set = new HashSet();
        
         while (!stack.isEmpty()) {
            set.add(stack.pop());            
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}


/*
TC : O(n)
SC : O(n)

Do : https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/

https://leetcode.com/problems/generate-parentheses/
https://leetcode.com/problems/valid-parenthesis-string/submissions/
*/