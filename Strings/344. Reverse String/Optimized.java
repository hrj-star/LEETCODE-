
class Optimized {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0 ; i<n/2 ; i++){
            char temp = s[i]; // s[i] : as it is char array itself
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
        
    }
}

/*

Complexity Analysis :

TC : O(N/2) = O(N) 
SC : O(1) = inplace 

*/
