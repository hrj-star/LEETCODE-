// https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
       int n = strs.length;
        
        if(strs.length == 0 || strs ==  null){
            return "";
        }
    
        String firstElementPrefix = strs[0];
        
        for(int i=1 ; i < n ; i++){
            while(strs[i].indexOf(firstElementPrefix) != 0){
                firstElementPrefix = firstElementPrefix.substring(0 , firstElementPrefix.length() - 1);
            }
            
            // System.out.println(firstElementPrefix); // flow , fl
        }
        
        return firstElementPrefix;
    }
}
/*
FEP = "flower"
rest of string elements  in iteration = "flow" , "flight"


flow.indexOf(flower) = -1
flower = flower.substring(0,length - 1) = flowe

flow.indexOf(flowe) = -1 => flow

flow.indexOf(flow) == 0

FEP after 1st iteration of 1st pos string flow : flow

==> Iterating through strs[2] : flight


"flight".indexOf("flow") = -1
flow => flo 


"flight".indexOf("flo") = -1
flo => fl

"flight".indexOf("fl") = 0
return fl.





TC : O(n * i) -> n - each string , i - iteration through each of them.
Time complexity : O(S)O(S) , where S is the sum of all characters in all strings.

In the worst case all n strings are the same. The algorithm compares the string S1 with the other strings [S2 .. Sn]. There are S character comparisons, where S is the sum of all characters in the input array.

Space complexity : O(1) We only used constant extra space.
*/



class Solution {
    public String longestCommonPrefix(String[] strs) {
       int n = strs.length;
        
        if(strs.length == 0 || strs ==  null){
            return "";
        }
    
        String firstElementPrefix = strs[0];
        
        for(String s : strs){
            firstElementPrefix = compare(firstElementPrefix , s);
        }
        
        return firstElementPrefix;
    }
    
    private String compare(String first , String next){
        
        int minString = Math.min(first.length() , next.length());
        
        int i=0,j=0;
        
        while(i < first && j < next){
            if(first.charAt(i) == next.charAt(j)){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        
        return first.substring(0,i);
    }
}
/*

TC : O(n * i) -> n - each string , i - iteration through each of them. -- (check)

*/