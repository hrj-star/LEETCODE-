/*
.. -> Means move to parent -> /a/../ -> /a

. -> Stay in current folder -> /a/./ -> /a

// -> Ignore -> // -> /

/a/b/c/ -> /a/b/c



Input: path = "/a/./b/../../c/"
Output: "/c"


The first command /a/ means get into the folder /a/

The next command is /./ means stay over there

The next command is /b/ means get into the folder /b/

The next command is /../ means come out from the folder /b/

The next command is /../ means come out from the folder /a/

Now we are in home directory

The next command is /c/ means get into the folder /c/

And in the output we return what command we left with.


Split by / as separator.
If .. then pop
If . then ignore (current folder)


*/

class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        String[] p = path.split("\\/"); // separate by /
        
        for(int i = 0 ; i < p.length ; i++){
             if(!stack.isEmpty() && p[i].equals("..")){ // while performing pop() look for stack empty
                stack.pop();
            }
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")){
                 stack.push(p[i]);
            }
        }
        
        if(stack.isEmpty()) {
            return "/";
        }
        
        // bottom one in stack should appear at top
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.insert(0,stack.pop()).insert(0,"/");
        }
        
        return res.toString();
    }
}

/*
TC : O(2n) -> splitting + iterating and operations in stack
SC : O(n)  -> stack used
*/