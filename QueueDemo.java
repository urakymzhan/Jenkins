package dataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queueList = new LinkedList<>(); // We use LinkedList because it implements Queue interface

        // Adding elements to the Queue (The Enqueue operation)
        queueList.add("Ulan");
        queueList.add("John");
        queueList.add("Rick");
        queueList.add("Brian");
        queueList.add("Mark");

        System.out.println("queueList: " + queueList);
        System.out.println("------");

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty

        String name = queueList.remove();
        System.out.println("Removed from queueList using remove() method : " + name + " | New queueList : " + queueList );
        System.out.println("------");

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.

        String name2 = queueList.poll();
        System.out.println("Removed from queueList using poll() method : " + name2 + " | New queueList : " + queueList );
        System.out.println("------");

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstElement = queueList.element();
        System.out.println("First element of the queueList (element() method): " + firstElement);
        System.out.println("------");

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty

        String firstElement2 = queueList.peek();
        System.out.println("First element of the queueList (peek() method): " + firstElement2);
        System.out.println("------");


        System.out.println("Is Queue Empty? " + queueList.isEmpty());
        System.out.println("Size of the Queue : " + queueList.size());

        System.out.println("------");

        // Check if the Queue contains an element
        String element = "Brian";

        if(queueList.contains(element)) {
            System.out.println("queueList contains : " + element);
        } else {
            System.out.println("No such element in the queueList");
        }
        System.out.println("------");

        // ITERATION


        // iterating using Java 8 forEach() method

        queueList.forEach(elements-> System.out.println(elements));
        System.out.println("------");

        // iterating using iterator() method

        Iterator<String> queueIterator = queueList.iterator();
        while(queueIterator.hasNext()) {
            String elements2 = queueIterator.next();
            System.out.println(elements2);
        }
        System.out.println("------");

        // Iterating using for-each loop

        for(String elements3 : queueList) {
            System.out.println(elements3);
        }


    }
}
