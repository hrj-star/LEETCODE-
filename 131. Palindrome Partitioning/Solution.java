/* Backtracking - recursive */

class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s,new ArrayList<>());
        return res;
    }
    
    public void helper(String s  , List<String> so_far){
        // base check - check for empty string / length reached till end and string exhausted  ,add so_far
        if(s.length() == 0){
            res.add(new ArrayList<>(so_far));
            return;
        }
        
        for(int i = 0; i < s.length(); i++){
            String prefix = s.substring(0,i+1);
            String remaining = s.substring(i+1);
            if(isPalindrome(prefix)){ // if pal then add in list
               so_far.add(prefix);
                helper(remaining , so_far); // call for rest of string
                so_far.remove(so_far.size() - 1); // backtrack         
            }
        }
    }
    
    
    
     // check if palindrome
      public static boolean isPalindrome(String str){
        int left = 0 , right = str.length() - 1;
        while(left < right){
          char leftchar = str.charAt(left);
          char rightchar = str.charAt(right);

          if(leftchar  != rightchar){
            return false;
          }

          left++;
          right--;
        } // while end 
          return true;
      }
}



/*

Complexity Analysis :
------------------------------

TC : O(n*2^n) : Palindrome fucntion - O(n) and for all possible combination : 2^n
SC : O(2^n)   : As possible partitions generated for each partiton.


Verdict :
------------------------------

Runtime: 17 ms, faster than 25.69% of Java online submissions for Palindrome Partitioning.
Memory Usage: 158.9 MB, less than 8.50% of Java online submissions for Palindrome Partitioning.


*/

