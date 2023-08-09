import java.util.*;


// defining class Node

class Node{

	int key;
	int value;
	Node prev;
	Node next;


	Node (int key , int value){
			this.key = key;
			this.value = value;
		}

} // Node class end

// null <- head -> <- 1 -> <- 2 -> <- 3 -> <- tail -> null
 class LRU{


	private int capacity;
	private  Node head,tail;

	private  HashMap<Integer,Node> map; 


	// LRUCache() initialize
	public LRU(int capacity){
		this.capacity = capacity;
		map =  new HashMap<>(capacity);

	}



	// get() - node with equal key and move to  top

	public int get(int key){

		if(map.containsKey(key)){
			Node n = map.get(key);
			moveToHead(n);
			return n.value;
		}

		return -1; // if key not found , retuen -1
	}


	// put() - if node not present , create new node if node count exceeds capacity , remove nodes from  tail

	public void put(int key , int value){

		if(map.containsKey(key)){
			Node inMap = map.get(key);
			inMap.value = value; // update value and move ahead
			moveToHead(inMap);
			return;
		}
		
		// if greater than capacity then remove tail node and set pointers by removeTail() function
		if(map.size() == capacity){
			map.remove(tail.key);
			removeNode(tail);
		}

		// if does not exist then create new and add as top as head node

		Node newNode = new Node(key,value);
		map.put(key,newNode);
		addHead(newNode);
	}


	//move node which is equal to key and bring to front - will have 2 operations removeNode() , addNode()
	private  void moveToHead(Node node){
		removeNode(node);
		addHead(node);
	}


	// remove() - 1 , 2(prevNode) , 3(node) , 4(nextNode) -> remove 3 , 1 -> <- 2 (prevNode) -> <- 4 (nextNode)

	private  void removeNode(Node node){
		// catch old nodes 
		Node prevNode = node.prev;
		Node nextNode = node.next;


		// set pointers for both
		if(prevNode != null){
			prevNode.next = nextNode;
		}
		else{
			head = nextNode;
		}

		if(nextNode != null){
			nextNode.prev = prevNode;
		}
		else{
			tail = prevNode;
		}

	}


	// addNode() - this will add removed node to top as now its the most recently used & put before head as new head
	private  void addHead(Node node){

		if(head != null){
			head.prev = node;
		}

		node.prev = null;
		node.next = head;	
		
		head = node;

		if(tail == null){
			tail = node;
		}
	}



	public  void display(){
		// iterate over map
		for(Node n : map.values()){
			System.out.println(n.value);
		}		
	}
}

public class Main{
	public static void main(String[] args) {
		LRU lru = new LRU(2);

		
		lru.put(1, 1); // cache is {1=1}
		lru.put(2, 2); // cache is {1=1, 2=2}
		System.out.println(lru.get(1));    // return 1
		lru.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lru.get(2);    // returns -1 (not found)
		lru.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		lru.get(1);    // return -1 (not found)
		lru.get(3);    // return 3
		lru.get(4);    // return 4
		

     		lru.display(); // 4 3


	}
}

	


