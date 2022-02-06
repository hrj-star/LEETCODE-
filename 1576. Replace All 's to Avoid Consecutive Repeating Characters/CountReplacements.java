
// variation of actual question to find count of replacements
public class CountReplacements
{
    
     public static int modifyString(String s) {
         
        // base cases
        int n = s.length();
        
        if(s == null || n <= 0){
            return 0;
        }
        
        if(n == 1 && s.charAt(0) == '?'){
            return 1;
        }
        
        char[] ch = s.toCharArray();
        int count = 0;
        
        for(int i=0 ; i < ch.length ; i++){
            if(ch[i] == '?'){
                for(int c = 'a' ; c <= 'z' ; c++){
                    if(i - 1 >= 0 && c == ch[i-1]){
                        continue;
                    }
                    else if(i + 1 < ch.length && c == ch[i+1]){
                        continue;
                    }
                    else{
                        ch[i] = (char)c;
                        count++;
                       // break;
                    }
                }
            }
        }
        
        return count;
    }
    
	public static void main(String[] args) {
	    String strs = "ubv?w";  // 24
	    int ans = modifyString(strs);
		System.out.println(ans);
	}
}
