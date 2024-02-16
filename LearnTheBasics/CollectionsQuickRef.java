package LearnTheBasics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class ArrayListExample {
    public void arrayListMethods() {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements
        System.out.println("Element at index 0: " + fruits.get(0));

        // Update an element
        fruits.set(1, "Mango");

        // Remove an element
        fruits.remove(2);

        // Check if the ArrayList contains an element
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // Get the index of an element
        System.out.println("Index of Mango: " + fruits.indexOf("Mango"));

        // Check if the ArrayList is empty
        System.out.println("Is ArrayList empty: " + fruits.isEmpty());

        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Iterate over the ArrayList using a for-each loop
        System.out.println("Elements in ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Convert ArrayList to an array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array length: " + fruitArray.length);

        // Add all elements from another collection
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Watermelon");
        fruits.addAll(moreFruits);

        // Get a sublist of elements
        ArrayList<String> sublist = (ArrayList<String>) fruits.subList(1, 4);
        System.out.println("Sublist: " + sublist);

        // Clear the ArrayList
        fruits.clear();

        // Check if the ArrayList is empty after clearing
        System.out.println("Is ArrayList empty after clearing: " + fruits.isEmpty());


        // Iterate over the ArrayList using iterator
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate over the ArrayList using simple for loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Iterate over the ArrayList using Java 8 forEach and lambda expression
        fruits.forEach((fruit) -> {
            System.out.println(fruit);
        });
    }

}

class StackExample {
    public void stackMethods() {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Check if the stack is empty
        System.out.println("Is stack empty: " + stack.isEmpty());

        // Peek at the top element of the stack
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Check if the stack is empty after popping
        System.out.println("Is stack empty after popping: " + stack.isEmpty());

        // Push multiple elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Get the size of the stack
        System.out.println("Size of stack: " + stack.size());

        // Search for an element in the stack
        int position = stack.search("Python");
        System.out.println("Position of Python: " + position);

        // Check if the stack contains an element
        System.out.println("Contains C++: " + stack.contains("C++"));

        // Clear the stack
        stack.clear();

        // Check if the stack is empty after clearing
        System.out.println("Is stack empty after clearing: " + stack.isEmpty());
    }
}

class VectorExample {
    public void vectorMethods() {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Access elements
        System.out.println("Element at index 0: " + vector.get(0));

        // Update an element
        vector.set(1, "Mango");

        // Remove an element
        vector.remove(2);

        // Check if the vector contains an element
        System.out.println("Contains Mango: " + vector.contains("Mango"));

        // Get the index of an element
        System.out.println("Index of Mango: " + vector.indexOf("Mango"));

        // Check if the vector is empty
        System.out.println("Is vector empty: " + vector.isEmpty());

        // Get the size of the vector
        System.out.println("Size of vector: " + vector.size());

        // Iterate over the vector using a for-each loop
        System.out.println("Elements in vector:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Convert vector to an array
        String[] array = new String[vector.size()];
        vector.copyInto(array);
        System.out.println("Array length: " + array.length);

        // Add all elements from another collection
        Vector<String> moreElements = new Vector<>();
        moreElements.add("Grapes");
        moreElements.add("Watermelon");
        vector.addAll(moreElements);

        // Get a sublist of elements
        Vector<String> sublist = new Vector<>(vector.subList(1, 4));
        System.out.println("Sublist: " + sublist);

        // Clear the vector
        vector.clear();

        // Check if the vector is empty after clearing
        System.out.println("Is vector empty after clearing: " + vector.isEmpty());
    }
}

class LinkedListExample {
    public void linkedListMethods() {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Access elements
        System.out.println("Element at index 0: " + linkedList.get(0));

        // Update an element
        linkedList.set(1, "Mango");

        // Remove an element
        linkedList.remove(2);

        // Check if the LinkedList contains an element
        System.out.println("Contains Mango: " + linkedList.contains("Mango"));

        // Get the index of an element
        System.out.println("Index of Mango: " + linkedList.indexOf("Mango"));

        // Check if the LinkedList is empty
        System.out.println("Is LinkedList empty: " + linkedList.isEmpty());

        // Get the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Iterate over the LinkedList using a for-each loop
        System.out.println("Elements in LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Convert LinkedList to an array
        String[] array = new String[linkedList.size()];
        linkedList.toArray(array);
        System.out.println("Array length: " + array.length);

        // Add an element at the beginning of the LinkedList
        linkedList.addFirst("Grapes");

        // Add an element at the end of the LinkedList
        linkedList.addLast("Watermelon");

        // Get the first and last elements of the LinkedList
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Remove the first and last elements of the LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();

        // Clear the LinkedList
        linkedList.clear();

        // Check if the LinkedList is empty after clearing
        System.out.println("Is LinkedList empty after clearing: " + linkedList.isEmpty());
    }
}

class PriorityQueueExample {
    public void priorityQueueMethods() {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);

        // Check if the PriorityQueue is empty
        System.out.println("Is PriorityQueue empty: " + priorityQueue.isEmpty());

        // Get the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + priorityQueue.size());

        // Peek at the first element (highest priority) of the PriorityQueue
        System.out.println("First element: " + priorityQueue.peek());

        // Remove the first element (highest priority) from the PriorityQueue
        System.out.println("Removing first element: " + priorityQueue.poll());

        // Check if the PriorityQueue contains an element
        System.out.println("Contains 3: " + priorityQueue.contains(3));

        // Iterate over the PriorityQueue using a while loop
        System.out.println("Elements in PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // Clear the PriorityQueue
        priorityQueue.clear();

        // Check if the PriorityQueue is empty after clearing
        System.out.println("Is PriorityQueue empty after clearing: " + priorityQueue.isEmpty());
    }
}

class ArrayDequeExample {
    public void arrayDequeMethods() {
        // Create an ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Add elements to the front of the ArrayDeque
        arrayDeque.addFirst("Apple");
        arrayDeque.addFirst("Banana");
        arrayDeque.addFirst("Orange");

        // Add elements to the end of the ArrayDeque
        arrayDeque.addLast("Grapes");
        arrayDeque.addLast("Watermelon");

        // Access the first and last elements of the ArrayDeque
        System.out.println("First element: " + arrayDeque.getFirst());
        System.out.println("Last element: " + arrayDeque.getLast());

        // Remove the first and last elements of the ArrayDeque
        System.out.println("Removing first element: " + arrayDeque.removeFirst());
        System.out.println("Removing last element: " + arrayDeque.removeLast());

        // Check if the ArrayDeque contains an element
        System.out.println("Contains Apple: " + arrayDeque.contains("Apple"));

        // Check if the ArrayDeque is empty
        System.out.println("Is ArrayDeque empty: " + arrayDeque.isEmpty());

        // Get the size of the ArrayDeque
        System.out.println("Size of ArrayDeque: " + arrayDeque.size());

        // Iterate over the ArrayDeque using a for-each loop
        System.out.println("Elements in ArrayDeque:");
        for (String element : arrayDeque) {
            System.out.println(element);
        }

        // Clear the ArrayDeque
        arrayDeque.clear();

        // Check if the ArrayDeque is empty after clearing
        System.out.println("Is ArrayDeque empty after clearing: " + arrayDeque.isEmpty());
    }
}

class HashSetExample {
    // add(element): Adds the specified element to the HashSet if it is not already
    // present. Returns true if the element was added, and false if the element was
    // already present.
    // remove(element): Removes the specified element from the HashSet if it is
    // present. Returns true if the element was removed, and false if the element
    // was not found.
    // contains(element): Returns true if the HashSet contains the specified
    // element, and false otherwise.
    // isEmpty(): Returns true if the HashSet is empty (contains no elements), and
    // false otherwise.
    // size(): Returns the number of elements in the HashSet.
    // clear(): Removes all elements from the HashSet.
    // iterator(): Returns an iterator over the elements in the HashSet.
    // toArray(): Returns an array containing all of the elements in the HashSet.
    // addAll(collection): Adds all of the elements from the specified collection to
    // the HashSet.
    // retainAll(collection): Retains only the elements in the HashSet that are also
    // present in the specified collection.
    // removeAll(collection): Removes all of the elements from the HashSet that are
    // also present in the specified collection.
    // containsAll(collection): Returns true if the HashSet contains all of the
    // elements in the specified collection, and false otherwise.
    // equals(object): Compares the specified object with the HashSet for equality.
    // hashCode(): Returns the hash code value for the HashSet.
    public void hashSetMethods() {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Remove an element from the HashSet
        boolean removed = hashSet.remove("Banana");
        System.out.println("Element removed: " + removed);

        // Check if the HashSet contains an element
        boolean contains = hashSet.contains("Apple");
        System.out.println("Contains Apple: " + contains);

        // Check if the HashSet is empty
        boolean empty = hashSet.isEmpty();
        System.out.println("Is HashSet empty: " + empty);

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Iterate over the HashSet using an iterator
        System.out.println("Elements in HashSet:");
        java.util.Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Convert the HashSet to an array
        Object[] array = hashSet.toArray();
        System.out.println("Array: " + java.util.Arrays.toString(array));

        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}

class LinkedHashSetExample {

    // LinkedHashSet is a class in Java that extends the HashSet class. It maintains
    // a linked list of the entries in the set, in the order in which they were
    // inserted. This means that when you iterate over a LinkedHashSet, the elements
    // will be returned in the order in which they were added.

    public void linkedHashSetMethods() {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Remove an element from the LinkedHashSet
        boolean removed = linkedHashSet.remove("Banana");
        System.out.println("Element removed: " + removed);

        // Check if the LinkedHashSet contains an element
        boolean contains = linkedHashSet.contains("Apple");
        System.out.println("Contains Apple: " + contains);

        // Check if the LinkedHashSet is empty
        boolean empty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty: " + empty);

        // Get the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);

        // Iterate over the LinkedHashSet
        System.out.println("Elements in LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Convert the LinkedHashSet to an array
        Object[] array = linkedHashSet.toArray();
        System.out.println("Array: " + java.util.Arrays.toString(array));

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}

class TreeSetExample {
    public void treeSetMethods() {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Mango");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Remove an element from the TreeSet
        boolean removed = treeSet.remove("Banana");
        System.out.println("Element removed: " + removed);

        // Check if the TreeSet contains an element
        boolean contains = treeSet.contains("Apple");
        System.out.println("Contains Apple: " + contains);

        // Check if the TreeSet is empty
        boolean empty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty: " + empty);

        // Get the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size of TreeSet: " + size);

        // Get the first element in the TreeSet
        String first = treeSet.first();
        System.out.println("First element: " + first);

        // Get the last element in the TreeSet
        String last = treeSet.last();
        System.out.println("Last element: " + last);

        // Iterate over the TreeSet
        System.out.println("Elements in TreeSet (ascending order):");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}

class HashMapExample {
    public void hashMapMethods() {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Put key-value pairs into the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);
        hashMap.put("Mango", 30);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Get the value associated with a key
        int appleCount = hashMap.get("Apple");
        System.out.println("Number of apples: " + appleCount);

        // Check if the HashMap contains a key
        boolean containsBanana = hashMap.containsKey("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Check if the HashMap contains a value
        boolean containsValue25 = hashMap.containsValue(25);
        System.out.println("Contains value 25: " + containsValue25);

        // Update the value associated with a key
        hashMap.put("Apple", 12);

        // Remove a key-value pair from the HashMap
        int removedValue = hashMap.remove("Banana");
        System.out.println("Removed value: " + removedValue);

        // Iterate over the HashMap
        System.out.println("Key-Value pairs in HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the number of key-value pairs in the HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Clear the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);


        // Example of iterating over a HashMap using forEach and lambda expression
        hashMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }

    public void demonstrateHashMapIteration() {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();



        // Put some key-value pairs into the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Orange", 15);
        hashMap.put("Banana", 20);
        hashMap.put("Mango", 30);

        // Iterate over the HashMap using entrySet
        System.out.println("Iterating over HashMap using entrySet:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterate over the HashMap using keySet and forEach
        System.out.println("Iterating over HashMap using keySet and forEach:");
        hashMap.keySet().forEach(key -> {
            Integer value = hashMap.get(key);
            System.out.println(key + ": " + value);
        });

        // Iterate over the HashMap using values and forEach
        System.out.println("Iterating over HashMap using values and forEach:");
        hashMap.values().forEach(value -> System.out.println(value));
    }
}

class LinkedHashMapExample {
    public void linkedHashMethods() {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Put key-value pairs into the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 15);
        linkedHashMap.put("Mango", 30);

        // Print the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Get the value associated with a key
        int appleCount = linkedHashMap.get("Apple");
        System.out.println("Number of apples: " + appleCount);

        // Check if the LinkedHashMap contains a key
        boolean containsBanana = linkedHashMap.containsKey("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Check if the LinkedHashMap contains a value
        boolean containsValue25 = linkedHashMap.containsValue(25);
        System.out.println("Contains value 25: " + containsValue25);

        // Update the value associated with a key
        linkedHashMap.put("Apple", 12);

        // Remove a key-value pair from the LinkedHashMap
        int removedValue = linkedHashMap.remove("Banana");
        System.out.println("Removed value: " + removedValue);

        // Iterate over the LinkedHashMap
        System.out.println("Key-Value pairs in LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the number of key-value pairs in the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of LinkedHashMap: " + size);

        // Clear the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);
    }
}


 class TreeMapExample {
    public  void treeMapMethods() {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Put key-value pairs into the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 15);
        treeMap.put("Mango", 30);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Get the value associated with a key
        int appleCount = treeMap.get("Apple");
        System.out.println("Number of apples: " + appleCount);

        // Check if the TreeMap contains a key
        boolean containsBanana = treeMap.containsKey("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Check if the TreeMap contains a value
        boolean containsValue25 = treeMap.containsValue(25);
        System.out.println("Contains value 25: " + containsValue25);

        // Update the value associated with a key
        treeMap.put("Apple", 12);

        // Remove a key-value pair from the TreeMap
        int removedValue = treeMap.remove("Banana");
        System.out.println("Removed value: " + removedValue);

        // Iterate over the TreeMap
        System.out.println("Key-Value pairs in TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Get the number of key-value pairs in the TreeMap
        int size = treeMap.size();
        System.out.println("Size of TreeMap: " + size);

        // Get the first key-value pair in the TreeMap
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
        System.out.println("First entry: " + firstEntry.getKey() + ": " + firstEntry.getValue());

        // Get the last key-value pair in the TreeMap
        Map.Entry<String, Integer> lastEntry = treeMap.lastEntry();
        System.out.println("Last entry: " + lastEntry.getKey() + ": " + lastEntry.getValue());

        // Clear the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}


public class CollectionsQuickRef {
    public static void main(String[] args) {

        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.arrayListMethods();

        StackExample stackExample = new StackExample();
        stackExample.stackMethods();

        VectorExample vectorExample = new VectorExample();
        vectorExample.vectorMethods();

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.linkedListMethods();

        PriorityQueueExample priorityQueueExample = new PriorityQueueExample();
        priorityQueueExample.priorityQueueMethods();

        ArrayDequeExample arrayDequeExample = new ArrayDequeExample();
        arrayDequeExample.arrayDequeMethods();

        HashSetExample hashSetExample = new HashSetExample();
        hashSetExample.hashSetMethods();

        LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();
        linkedHashSetExample.linkedHashSetMethods();

        TreeSetExample treeSetExample = new TreeSetExample();
        treeSetExample.treeSetMethods();

        HashMapExample hashMapExample = new HashMapExample();
        hashMapExample.hashMapMethods();

        LinkedHashMapExample linkedHashMapExample = new LinkedHashMapExample();
        linkedHashMapExample.linkedHashMethods();

        TreeMapExample treeMapExample = new TreeMapExample();
        treeMapExample.treeMapMethods();
    }
}