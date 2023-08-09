class Solution {
    public String addBinary(String a, String b) {
        // StringBuilder to append the intermediate values calculated from right to left
        StringBuilder sb = new StringBuilder();
        
        // get length - 1 index as we start computing from LSB (right to left)
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        int carry = 0; // initialize carry
        
        while(i >= 0 || j >= 0){ // iterate till either of strings have bits left
            int sum = carry; // assign carry to sum as it will be added at each stage , initially 0
         
            // loop for String a and add value(converted to int) at each pos until a exhausts
            if(i >= 0){
                sum += a.charAt(i--) - '0';
            }
            
            // similarly , for String b
            
             if(j >= 0){
                sum += b.charAt(j--) - '0';
            }
            
            // calculate carry = sum / 2
            carry = sum / 2 ; // or  carry = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }
        
        if(carry != 0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
        
    }
}


/*
Complexity Analysis :
-----------------------
TC : O(max(a.length(),b.length()))
SC : O(max(a.length(),b.length()))

Verdict :
-----------------------

Runtime: 2 ms, faster than 77.69% of Java online submissions for Add Binary.
Memory Usage: 38 MB, less than 93.18% of Java online submissions for Add Binary.
*/