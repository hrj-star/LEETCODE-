
// Brute Force


class Solution {
    public int firstUniqChar(String s) {
        
      if(s.length()==1){
        return 0;
      } 
        
       for(int i=0 ; i<s.length(); i++){
           
           boolean not_unique = false;
           
            for(int j=0 ; j<s.length(); j++){
                
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    
                     not_unique = true; // if equal chars , then definitely not unique
                     break;
                  }
                
                }
           
            if(not_unique == false){
                    return i;
            }
       }
        
        return -1; // if not exists
        
        
    }
}


/*

Complexity analysis : 

TC :  O(N^2)  // two loops

SC : O(1) 
*/
