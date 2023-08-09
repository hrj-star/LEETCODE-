class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();

        // base case
        if(n == 0 || s == null)
            return 0;

        int i=0,j=0,max=0;

        Set<Character> set = new HashSet<>();

        while(i < n){
            char c = s.charAt(i);

            while(set.contains(c)){
                set.remove(s.charAt(j)); // if present in set , remove char at j , for reset process
                ++j;
            }

            set.add(c);
            max = Math.max(max , i-j+1);
            ++i;
        }

        return max;
        
    }
}

/*

Complexity Analysis :
------------------

TC :  O(n)

SC :  O(26) or O(1).

*/