class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2  == 1 ){
			return false;
		}

		Stack<Character> stack = new Stack<>();

		char[] ch = s.toCharArray();
		for(char c : ch){
			if(c == '{' || c== '[' || c=='('){
				stack.push(c);
			}
			else if ( !stack.isEmpty() && (  ( c == '}' && stack.peek() == '{')
										  || ( c == ']' && stack.peek() == '[')
										  || ( c == ')' && stack.peek() == '(')
										  ))
			{
				stack.pop();
			}
			else{
				return false;
			}
		}
		return stack.empty();
        
    }
}