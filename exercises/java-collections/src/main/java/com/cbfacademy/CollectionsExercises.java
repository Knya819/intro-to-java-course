package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();

        // Add elements to the list
        integers.addFirst(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.addLast(2);
        integers.add(2, 4); // Add 4 as the 3rd element

        // Print the result of invoking element() method
        System.out.println(integers.element());
          //  - return the list
        return integers;
          //throw new RuntimeException("Not implemented");
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stack = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
         //  - print the first element of the stack on the screen
        System.out.print(stack.firstElement());                
        //  - print the last element of the stack on the screen
        System.out.print(stack.lastElement());                
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stack.pop());
        //  - invoke the push(4) method on the stack
        stack.push(4);
        //  - return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(deque.peek());
        //  - print the last element of the queue on the screen
        System.out.print(deque.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(deque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(deque.element());
        //  - return the queue
        return deque;
       // throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> map = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        map.put(1,"TypeScript");
        map.put(2,"Kotlin");
        map.put(3,"Python");
        map.put(4,"Java");
        map.put(5,"JavaScript");
        map.put(6,"Rust");

        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen

        System.out.print(map.keySet());
        System.out.print(map.values());
        System.out.print(map.containsValue("English"));
        //  - return the map
        return map;
       // throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
