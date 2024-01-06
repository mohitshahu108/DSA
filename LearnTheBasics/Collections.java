package LearnTheBasics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.Stack;

class CollectionsDemo {

    public void collectionInterface() {
        // Java Collection Interface
        // The Collection interface is the root interface of the Java collections
        // framework.

        // There is no direct implementation of this interface. However, it is
        // implemented through its subinterfaces like List, Set, and Queue.

        // For example, the ArrayList class implements the List interface which is a
        // subinterface of the Collection Interface.
        // Methods of Collection
        // The Collection interface includes various methods that can be used to perform
        // different operations on objects. These methods are available in all its
        // subinterfaces.

        // add() - inserts the specified element to the collection
        // size() - returns the size of the collection
        // remove() - removes the specified element from the collection
        // iterator() - returns an iterator to access elements of the collection
        // addAll() - adds all the elements of a specified collection to the collection
        // removeAll() - removes all the elements of the specified collection from the
        // collection
        // clear() - removes all the elements of the collection
    }

    public void listInterface() {
        // List is an interface, we cannot create objects from it.

        // In order to use functionalities of the List interface, we can use these
        // classes:

        // ArrayList
        // LinkedList
        // Vector
        // Stack

        // Methods of List
        // The List interface includes all the methods of the Collection interface. Its
        // because Collection is a super interface of List.

        // Some of the commonly used methods of the Collection interface that's also
        // available in the List interface are:

        // add() - adds an element to a list
        // addAll() - adds all elements of one list to another
        // get() - helps to randomly access elements from lists
        // iterator() - returns iterator object that can be used to sequentially access
        // elements of lists
        // set() - changes elements of lists
        // remove() - removes an element from the list
        // removeAll() - removes all the elements from the list
        // clear() - removes all the elements from the list (more efficient than
        // removeAll())
        // size() - returns the length of lists
        // toArray() - converts a list into an array
        // contains() - returns true if a list contains specified element
    }

    public void arrayList() {
        // ArrayList class to implement the functionality of resizable-arrays.
        // It implements the List interface of the collections framework.
        // Collection extends List impliments ArrayList

        // Java ArrayList Vs Array
        // In Java, we need to declare the size of an array before we can use it. Once
        // the size of an array is declared, it's hard to change it.

        // To handle this issue, we can use the ArrayList class. It allows us to create
        // resizable arrays.

        // Unlike arrays, arraylists can automatically adjust their capacity when we add
        // or remove elements from them. Hence, arraylists are also known as dynamic
        // arrays.

        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements using add() method
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        // Displaying the ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Accessing elements using get() method
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Modifying elements using set() method
        arrayList.set(1, "Pineapple");
        System.out.println("ArrayList after setting 'Pineapple' at index 1: " + arrayList);

        // Removing elements using remove() method
        arrayList.remove("Orange");
        System.out.println("ArrayList after removing 'Orange': " + arrayList);

        // Checking if an element exists using contains() method
        System.out.println("Does 'Apple' exist in the ArrayList? " + arrayList.contains("Apple"));

        // Checking the index of an element using indexOf() method
        int index = arrayList.indexOf("Grapes");
        System.out.println("'Grapes' found at index: " + index);

        // Checking the last index of an element using lastIndexOf() method
        int lastIndex = arrayList.lastIndexOf("Mango");
        System.out.println("'Mango' found at last index: " + lastIndex);

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Checking if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());

        // Creating a subList using subList() method
        ArrayList<String> subList = new ArrayList<>(arrayList.subList(1, 4));
        System.out.println("Sublist from index 1 to 3: " + subList);

        // Clearing the ArrayList using clear() method
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);

        // Java ArrayList Methods
        // Java ArrayList add()
        // inserts the element to the arraylist

        // Java ArrayList addAll()
        // adds all elements of a collection to arraylist

        // Java ArrayList clear()
        // removes all the elements from arraylist

        // Java ArrayList clone()
        // makes a copy of the array list

        // Java ArrayList contains()
        // checks if the element is present in the arraylist

        // Java ArrayList get()
        // returns the element present in the specified index

        // Java ArrayList indexOf()
        // returns the position of the specified element

        // Java ArrayList removeAll()
        // removes multiple elements from the arraylist

        // Java ArrayList remove()
        // removes the single element from the arraylist

        // Java ArrayList size()
        // returns the length of an arraylist

        // Java ArrayList isEmpty()
        // checks if the arraylist is empty

        // Java ArrayList subList()
        // returns a portion of the arraylist

        // Java ArrayList set()
        // replace the single element from an arraylist

        // Java ArrayList sort()
        // sorts the arraylist according to specified order

        // Java ArrayList toArray()
        // converts an arraylist to an array

        // Java ArrayList toString()
        // converts the arraylist into a String

        // Java ArrayList ensureCapacity()
        // set the size of an araylist

        // Java ArrayList lastIndexOf()
        // returns position of last occurrence of the element

        // Java ArrayList retainAll()
        // retains only the common elements

        // Java ArrayList containsAll()
        // checks if a collection is a subset of arraylist

        // Java ArrayList trimToSize()
        // trims the capacity of arraylist equal to the size

        // Java ArrayList removeRange()
        // removes a portion of the arraylist

        // Java ArrayList replaceAll()
        // replace all elements from the arraylist

        // Java ArrayList removeIf()
        // removes element that satisfy the condition

        // Java ArrayList forEach()
        // performs an action to all elements of arraylist

        // Java ArrayList iterator()
        // returns an iterate to loop through the ArrayList
    }

    public void vector() {
        // Java Vector
        // The Vector class is an implementation of the List interface that allows us to
        // create resizable-arrays similar to the ArrayList class.

        // The Vector class synchronizes each individual operation. This means whenever
        // we want to perform some operation on vectors, the Vector class automatically
        // applies a lock to that operation.

        // It is because when one thread is accessing a vector, and at the same time
        // another thread tries to access it, an exception called
        // ConcurrentModificationException is generated. Hence, this continuous use of
        // lock for each operation makes vectors less efficient.

        // However, in array lists, methods are not synchronized. Instead, it uses the
        // Collections.synchronizedList() method that synchronizes the list as a whole.

        // Note: It is recommended to use ArrayList in place of Vector because vectors
        // less efficient.
        Vector<String> mammals = new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Using remove()
        String remove = animals.remove(1);
        System.out.println("Removed Element: " + remove);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);

        // Others Vector Methods
        // Methods Descriptions
        // set() changes an element of the vector
        // size() returns the size of the vector
        // toArray() converts the vector into an array
        // toString() converts the vector into a String
        // contains() searches the vector for specified element and returns a boolean
        // result
    }

    public void stack() {
        // Java Stack Class
        // The Stack class extends the Vector class.
        Stack<String> animals = new Stack<>();

        // Since Stack extends the Vector class, it inherits all the methods Vector.
        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Initial Stack: " + animals);

        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);

        // Access element from the top
        String peekEle = animals.peek();
        System.out.println("Element at top: " + peekEle);

        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);

        // Check if stack is empty
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);

        // Use ArrayDeque Instead of Stack
        // The Stack class provides the direct implementation of the stack data
        // structure. However, it is recommended not to use it. Instead, use the
        // ArrayDeque class (implements the Deque interface) to implement the stack data
        // structure in Java.
    }

    // Java Queue Interface
    public void queue() {
        // The Queue interface of the Java collections framework provides the
        // functionality of the queue data structure. It extends the Collection
        // interface.

        // Classes that Implement Queue
        // Since the Queue is an interface, we cannot provide the direct implementation
        // of it.

        // In order to use the functionalities of Queue, we need to use classes that
        // implement it:

        // ArrayDeque
        // LinkedList
        // PriorityQueue

        // Interfaces that extend Queue
        // The Queue interface is also extended by various subinterfaces:

        // Deque
        // BlockingQueue
        // BlockingDeque

        // Working of Queue Data Structure
        // In queues, elements are stored and accessed in First In, First Out manner.
        // That is, elements are added from the behind and removed from the front.

        // Methods of Queue
        // The Queue interface includes all the methods of the Collection interface. It
        // is because Collection is the super interface of Queue.

        // Some of the commonly used methods of the Queue interface are:

        // add() - Inserts the specified element into the queue. If the task is
        // successful, add() returns true, if not it throws an exception.
        // offer() - Inserts the specified element into the queue. If the task is
        // successful, offer() returns true, if not it returns false.
        // element() - Returns the head of the queue. Throws an exception if the queue
        // is empty.
        // peek() - Returns the head of the queue. Returns null if the queue is empty.
        // remove() - Returns and removes the head of the queue. Throws an exception if
        // the queue is empty.
        // poll() - Returns and removes the head of the queue. Returns null if the queue
        // is empty.
    }

    public void priorityQueue() {
        // Java PriorityQueue
        // The PriorityQueue class provides the functionality of the heap data
        // structure.

        // It implements the Queue interface.

        // The Java PriorityQueue class implements the Queue interface.

        // Unlike normal queues, priority queue elements are retrieved in sorted order.

        // Suppose, we want to retrieve elements in the ascending order. In this case,
        // the head of the priority queue will be the smallest element. Once this
        // element is retrieved, the next smallest element will be the head of the
        // queue.

        // It is important to note that the elements of a priority queue may not be
        // sorted. However, elements are always retrieved in sorted order.

        // Creating PriorityQueue
        // In order to create a priority queue, we must import the
        // java.util.PriorityQueue package. Once we import the package, here is how we
        // can create a priority queue in Java.

        // PriorityQueue<Integer> numbers = new PriorityQueue<>();
        // Here, we have created a priority queue without any arguments. In this case,
        // the head of the priority queue is the smallest element of the queue. And
        // elements are removed in ascending order from the queue.

        // However, we can customize the ordering of elements with the help of the
        // Comparator interface. We will learn about that later in this tutorial.

        // Methods of PriorityQueue
        // The PriorityQueue class provides the implementation of all the methods
        // present in the Queue interface.

        // Insert Elements to PriorityQueue
        // add() - Inserts the specified element to the queue. If the queue is full, it
        // throws an exception.

        // offer() - Inserts the specified element to the queue. If the queue is full,
        // it returns false.

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);

        // Access PriorityQueue Elements
        // To access elements from a priority queue, we can use the peek() method. This
        // method returns the head of the queue. For example,

        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);

        // Remove PriorityQueue Elements
        // remove() - removes the specified element from the queue
        // poll() - returns and removes the head of the queue

        // Iterating Over a PriorityQueue
        // Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Other PriorityQueue Methods
        // Methods Descriptions
        // contains(element) Searches the priority queue for the specified element. If
        // the element is found, it returns true, if not it returns false.
        // size() Returns the length of the priority queue.
        // toArray() Converts a priority queue to an array and returns it.

    }

    // PriorityQueue Comparator
    // In all the examples above, priority queue elements are retrieved in the
    // natural order (ascending order). However, we can customize this ordering.
    // For this, we need to create our own comparator class that implements the
    // Comparator interface. For example,

    class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer number1, Integer number2) {
            int value = number1.compareTo(number2);
            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public void customComparatorPriorityQueue(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.print("PriorityQueue: " + numbers);
    }

    // Java Deque Interface
    public void deque() {
        // The Deque interface of the Java collections framework provides the
        // functionality of a double-ended queue. It extends the Queue interface.

        // In a regular queue, elements are added from the rear and removed from the
        // front. However, in a deque, we can insert and remove elements from both front
        // and rear.

        // Classes that implement Deque
        // In order to use the functionalities of the Deque interface, we need to use
        // classes that implement it:

        // ArrayDeque
        // LinkedList

        // How to use Deque?
        // In Java, we must import the java.util.Deque package to use Deque.

        // Array implementation of Deque
        // Deque<String> animal1 = new ArrayDeque<>();

        // LinkedList implementation of Deque
        // Deque<String> animal2 = new LinkedList<>();

        // Here, we have created objects animal1 and animal2 of classes ArrayDeque and
        // LinkedList, respectively. These objects can use the functionalities of the
        // Deque interface.

        // Methods of Deque
        // Since Deque extends the Queue interface, it inherits all the methods of the
        // Queue interface.

        // Besides methods available in the Queue interface, the Deque interface also
        // includes the following methods:

        // addFirst() - Adds the specified element at the beginning of the deque. Throws
        // an exception if the deque is full.

        // addLast() - Adds the specified element at the end of the deque. Throws an
        // exception if the deque is full.

        // offerFirst() - Adds the specified element at the beginning of the deque.
        // Returns false if the deque is full.

        // offerLast() - Adds the specified element at the end of the deque. Returns
        // false if the deque is full.

        // getFirst() - Returns the first element of the deque. Throws an exception if
        // the deque is empty.

        // getLast() - Returns the last element of the deque. Throws an exception if the
        // deque is empty.

        // peekFirst() - Returns the first element of the deque. Returns null if the
        // deque is empty.

        // peekLast() - Returns the last element of the deque. Returns null if the deque
        // is empty.

        // removeFirst() - Returns and removes the first element of the deque. Throws an
        // exception if the deque is empty.

        // removeLast() - Returns and removes the last element of the deque. Throws an
        // exception if the deque is empty.

        // pollFirst() - Returns and removes the first element of the deque. Returns
        // null if the deque is empty.

        // pollLast() - Returns and removes the last element of the deque. Returns null
        // if the deque is empty.

    }

    // Deque as Stack Data Structure
    // The Stack class of the Java Collections framework provides the implementation
    // of the stack.

    // However, it is recommended to use Deque as a stack instead of the Stack
    // class. It is because methods of Stack are synchronized.

    // Here are the methods the Deque interface provides to implement stack:

    // push() - adds an element at the beginning of deque
    // pop() - removes an element from the beginning of deque
    // peek() - returns an element from the beginning of deque

    public void dequeAsStack() {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);

    }

    public void linkedList() {
        // Each element in a linked list is known as a node. It consists of 3 fields:

        // Prev - stores an address of the previous element in the list. It is null for
        // the first element
        // Next - stores an address of the next element in the list. It is null for the
        // last element
        // Data - stores the actual data

        // Creating a Java LinkedList
        // Here is how we can create linked lists in Java:

        // LinkedList<Type> linkedList = new LinkedList<>();
        // Here, Type indicates the type of a linked list. For example,

        // create Integer type linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // create String type linked list
        LinkedList<String> slinkedList = new LinkedList<>();

        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);

        LinkedList<String> languages = new LinkedList<>();

        // add elements in the linked list
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        // get the element from the linked list
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

        // change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);

        // remove elements from index 1
        String str2 = languages.remove(1);
        System.out.println("Removed Element: " + str2);

        System.out.println("Updated LinkedList: " + languages);

        // contains() checks if the LinkedList contains the element
        // indexOf() returns the index of the first occurrence of the element
        // lastIndexOf() returns the index of the last occurrence of the element
        // clear() removes all the elements of the LinkedList
        // iterator() returns an iterator to iterate over LinkedList

        // LinkedList as Deque and Queue
        // Since the LinkedList class also implements the Queue and the Deque interface,
        // it can implement methods of these interfaces as well. Here are some of the
        // commonly used methods:

        // Methods Descriptions
        // addFirst() adds the specified element at the beginning of the linked list
        // addLast() adds the specified element at the end of the linked list
        // getFirst() returns the first element
        // getLast() returns the last element
        // removeFirst() removes the first element
        // removeLast() removes the last element
        // peek() returns the first element (head) of the linked list
        // poll() returns and removes the first element from the linked list
        // offer() adds the specified element at the end of the linked list
    }

    public void linkedListAsDequeu() {
        Deque<String> animals = new LinkedList<>();

        // add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
    }

    

}


public class Collections {
    public static void main(String[] args) {
        CollectionsDemo cd = new CollectionsDemo();
        // cd.arrayList();
        // cd.stack();
        cd.linkedList();
    }
}
