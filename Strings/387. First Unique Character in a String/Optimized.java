
// Using frequency array



class Optimized {
    public int firstUniqChar(String s) {
        
        int[] arr=new int[26];
        char[] ch = s.toCharArray();
        for(char c : ch ){
            arr[c-'a']++;
        }
        
       for(int i=0 ; i<s.length(); i++){
           if(arr[s.charAt(i)-'a'] == 1){
               return i;
           }
       }
        
        return -1; // if not exists
        
        
    }
}


/*

Complexity analysis : 

TC :  O(N)  

SC : O(1) - considering constant O(26) .

*/
