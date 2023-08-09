
// Using Ternary operator 

class Solution_Ternary {
    public List<String> fizzBuzz(int n) {
        
        List<String> list = new ArrayList();
        
        for(int i=1;i<=n;i++)
            list.add( i % 15 == 0 ?  "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : String.valueOf(i) );
        
        return list;
        
    }
