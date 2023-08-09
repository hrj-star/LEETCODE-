/*

https://leetcode.com/problems/design-hashmap/

Time complexity: O(1) - for all get(),put() and remove() methods.
Space complexity: O(n) - where n is the maximum possible value for the key.
*/

class MyHashMap {

    
    /** Initialize your data structure here. */
    
    int[] array;
    
    public MyHashMap() {
        array = new int[1000001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
         array[key] = value + 1;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
         return array[key] - 1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        array[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

class MyHashMap {

    private int[] arr;
    
    public MyHashMap() {
        arr = new int[1000001];   
        Arrays.fill(arr,-1);
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        
        if(arr[key] >= 0){
            return arr[key];
        }
        else{
            return -1;
        }
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */