/*

https://leetcode.com/problems/pascals-triangle/


[1]
[1,1]
[1,2,1]
[1,3,3,1] =  3 = 1+2 = arr(i)(j) = arr(i-1)(j) + arr(i-1)(j-1) => at 1th 3 = list(1+2) = 2 
[1,4,6,4,1]

*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        for(int i = 0 ; i < numRows ; i++ ){
            List<Integer> currRow = new ArrayList<>();
            
            for(int j = 0 ; j < i+1 ; j++){
                if(j == 0 || j == i){
                    currRow.add(1); // add 1 to sides
                }
                else{
                    currRow.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }
            }
            
            triangle.add(currRow);
        }
        
        return triangle;
    }
}

