import java.util.*;
import java.io.*;
/*
*Collection Practice program
*@author Moutusi Karmakar
*/
public class CollectionProgram{

public static void main(String []s){
	Collection<Integer> obj1 = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	/*
	*Taking values from user and inserting in ArrayList
	*/
	for(int i=0;i<=4;i++){
		System.out.println("Enter value "+i+" for collection: ");
		int insertElement = sc.nextInt();
		obj1.add(insertElement);
	}
	/*
	*Printing the ArrayList
	*/
	for(Object i : obj1){
		System.out.println(i);
		}
	
	System.out.println("The total number of elements in this collection: "+obj1.size());	
	/*
	*Taking value from the user and checking if present in the ArrayList
	*/
	System.out.println("Enter the element you want to search: ");
	int searchElement = sc.nextInt();
	if(obj1.contains(searchElement)){
		try{
		System.out.println("Element found");
		}catch(Exception e){System.out.println(" ");}
	}
	else{
		try{
		System.out.println("Not in the collection!");
		}catch(Exception e){System.out.println(" ");}
	}
	/*
	*ArrayList implementation using List
	*/
	List obj2 = new ArrayList();
	obj2.add("name");
	obj2.add("city");
	obj2.add("state");
	obj2.add("city");
	int elementArray = 5;
	for (int x=1; x<=6; x++){
		obj2.add(elementArray);
		elementArray +=5;
	}
	System.out.println(obj2);
	System.out.println("The element at index 2 is: "+obj2.get(2));
	System.out.println("Capacity of ArrayList: "+obj2.size());
   	/*
	*Adding an element to the ArrayList and printing the size
	*/
	obj2.add(90);
   	System.out.println("New ArrayList: "+obj2);
   	System.out.println("ArrayList capacity: "+obj2.size());


	/*
	*Linked list implementation
	*/
	List obj3 = new LinkedList();
	obj3.add(1);
	obj3.add(2);
	obj3.add(3);
	obj3.add(3,4);
	System.out.println(obj3);
	obj3.remove(2);
	System.out.println("LinkedList after deletion: "+obj3);
	System.out.println("element at index 2 is: "+obj3.get(2));
	obj3.set(1,"Hi");
	System.out.println("Changed LinkedList: "+obj3);

	/*
	*Vector implementation
	*/
	Vector v = new Vector();
	v.addAll(obj2);
	int element = 2;
	/*
	*Inserting elements in vector
	*/
	for(int k=1; k<=6; k++){
		v.add(element);
		element +=2;
	}
	System.out.println("The vector elements are: "+v);
	/*
	*Adding elements in the vector and printing the capacity (increasing by 100%)
	*/
	System.out.println("capacity of vector: "+v.capacity());
	v.add(90);
	System.out.println("New vector: "+v);
	System.out.println("Vector capacity: "+v.capacity());

	/*
	*stack implementation
	*/
	Stack stackObject = new Stack();
	stackObject.addAll(v);
	System.out.println("The stck is: "+stackObject);
	/*
	*pushing and popping elemnts in the stack
	*/
	stackObject.push(800);
	System.out.println("Stack after pushing: "+stackObject);
	stackObject.pop();
	System.out.println("Stack after popping: "+stackObject);

	/*
	*Hashset implementation
	*prints elements randomly
	*/
	Set hashSet = new HashSet();
	hashSet.add(21);
	hashSet.add(34);
	hashSet.add(12);
	hashSet.add(78);
	System.out.println("The set is: "+hashSet);
	Set setTree = new TreeSet();
	setTree.addAll(hashSet);
	System.out.println("The tree set is: "+setTree);

	/*
	*Linked hash set implementation
	*prints elements according to inertion order
	*/
	Set linkSet = new LinkedHashSet();
	linkSet.add(21);
   	linkSet.add(34);
   	linkSet.add(15);
   	linkSet.add(78);
	System.out.println("linked hash set is: "+linkSet);

	
	/*
	*Queue implementation
	*/
	Queue<Integer> queue = new LinkedList<>();
	int elementQueue = 3;
	for(int i=1; i<=5; i++){
		queue.add(elementQueue);
		elementQueue += 3;
	}
	System.out.println("The queue is: "+queue);
	queue.remove();
	System.out.println("The queue after removing 1 element is: "+queue);
	queue.add(20);
	System.out.println("The queue after adding 1 element is: "+queue);

	/*
	*Priority queue implementation
	*/
	Queue pQueue = new PriorityQueue();
	pQueue.addAll(hashSet);
	/*
	*peek returns the head of the priority queue
	*poll returns the head of the priority queue and removes it
	*/
	System.out.println("Peek "+pQueue.peek());
	System.out.println("Poll "+pQueue.poll());
	System.out.println("The priority queue is: "+pQueue);


	/*
	*Deque implementation
	*/
	Deque dQueue = new ArrayDeque();
	dQueue.add("a");
	dQueue.add("b");
	dQueue.add("c");
	dQueue.add("d");
	System.out.println("The dqueue is: "+dQueue);
	dQueue.push(10);
	System.out.println("The dequeue after pushing 10 is: "+dQueue);
	/*
	*Removes first element from the queue
	*/
	dQueue.removeFirst();
	System.out.println("The dequeue after removing from first is: "+dQueue);
	/*
	*Removes last element from the queue
	*/
	dQueue.removeLast();
	System.out.println("The dequeue after removing from last is: "+dQueue);
	/*
	*inserts element at the head of the queue
	*/
	dQueue.offerFirst(20);
	System.out.println("The dequeue after offerFirst is: "+dQueue);
	/*
	*inserts element at the tail of the queue
	*/
	dQueue.offerLast(30);
	System.out.println("The dequeue after offerLast is: "+dQueue);
	Iterator reverse = dQueue.descendingIterator();
	System.out.println("The deque in reverse order is: ");
	/*
	*printing the queue in reverse order
	*/
	while(reverse.hasNext()){
		System.out.println(reverse.next());
	}
	
	
	/*
	*HashMap implementation
	*/
	Map map = new HashMap();
	map.put("Company","BridgeLabz");
	map.put("EmpRate",20);
	map.put("TotalDays",20);
	map.put("MaxHours",100);
	System.out.println("The hash map is: "+map);
	System.out.println("Total days is: "+map.get("TotalDays"));
	System.out.println("The set of keys: "+map.keySet());
	/*
	*Linked Hash Map implementation
	*/
	Map linkMap = new LinkedHashMap();
	linkMap.putAll(map);
	System.out.println("The linked hash map is: "+linkMap);
	/*
	*tree map implementation
	*/
	SortedMap sortMap = new TreeMap();
	sortMap.putAll(linkMap);
	System.out.println("The tree map is: "+sortMap);
	/*
	*hashtable implementation
	*/
	Map hashtable = new Hashtable();
	hashtable.putAll(linkMap);
	System.out.println("The hashtable is: "+hashtable);
	}
}

