// https://leetcode.com/problems/word-ladder/

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        // maintain set of wordList , if it doesn't contain endWord , return 0
        
        Set<String> set = new HashSet<>();
        
        for(String s : wordList){
            set.add(s);
        }
        if(!set.contains(endWord)){
            return 0;
        }
        
        // maintain Queue for BFS ,add beginWord in queue , remove from set to mark visited
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        set.remove(beginWord);
        
        int level = 0; // final ans level + 1 
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int s=0 ; s<size ; s++){
                String word = queue.poll();
                if(word.equals(endWord)){
                    return level + 1;
                }
                char[] ch = word.toCharArray();
                for(int i=0 ; i<ch.length ; i++){
                    char current = ch[i];
                    for(char c = 'a'; c <= 'z';c++){
                        ch[i] = c;
                        String nextWord = String.valueOf(ch);
                        if(set.contains(nextWord)){ // if not visited
                            queue.add(nextWord);
                            set.remove(nextWord);
                        }
                    }
                    ch[i] = current;
                }
            
            }
            level++; // move ahead next level
        }
        return 0;
    }
}

/*

BFS has time complexity O(V+E), space complexity O(V)  - V = #wordList = N, E = len(words) = M

TC :  O(M^2*N)

Queue has maximum length of wordList, which is N -> space complexity O(M*N)
Set has maximum length of wrodList, which is also O(M*N)
For each word, we used char[], to find possible change combinations,which results O(M*N*M) space complexity , in total, we get O(M^2*N) complexity.
        
SC :  O(M^2*N)

Runtime: 112 ms, faster than 60.29% of Java online submissions for Word Ladder.
Memory Usage: 94.1 MB, less than 28.67% of Java online submissions for Word Ladder.

*/