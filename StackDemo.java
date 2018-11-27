package dataStructures;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stackFCards = new Stack<>();

        // Pushing new items to the stack

        stackFCards.push("Jack");
        stackFCards.push("Queen");
        stackFCards.push("King");
        stackFCards.push("Ace");

        System.out.println("Stack :  " + stackFCards);
        System.out.println("--------");

        // Popping items from the Stack
        String cardAtTop = stackFCards.pop(); // throws EmptyStackExceptioin if the stack is empty
        System.out.println("Stack.pop() :  " + cardAtTop);
        System.out.println("Current Stack :  " + stackFCards);


        System.out.println("--------");
        // Get the item at the top of the Stack without removing it
        cardAtTop = stackFCards.peek();
        System.out.println("Stack.peek() : " + cardAtTop);
        System.out.println("Cureent Stack : " + stackFCards);

        System.out.println("--------");
        System.out.println("Other operations on the Stack : ");

        // Check if the Stack is empty
        System.out.println("Is Stack empty?  " + stackFCards.isEmpty());

        // Find the size of the Stack
        System.out.println("Size of the Stack : " + stackFCards.size());

        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack

        int position = stackFCards.search("Queen");
        System.out.println(position);

        if (position != -1) {
            System.out.println("Found element \"Queen\" at the position :  " + position);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("--------");

        // Iterate over Stack using forEach() method
        stackFCards.forEach(cards -> {
            System.out.println(cards);
        });

        System.out.println("--------");

        // Iterate over Stack using Iterator

        Iterator<String> stackIterator = stackFCards.iterator();
        {

            while
            (stackIterator.hasNext()) {
                String cards = stackIterator.next();
                System.out.println(cards);
            }
            System.out.println("--------");

            // Iterate over a Stack using iterator() and Java 8 forEachRemaining() method
            stackIterator = stackFCards.iterator();
            {

                while
                (stackIterator.hasNext()) {
                    String cards = stackIterator.next();
                    System.out.println(cards);
                }
                System.out.println("--------");
            }

                // Iterate over a Stack from TOP to BOTTOM using listIterator()
                // ListIterator allows you to traverse in both forward and backward directions.
                // We'll start from the top of the stack and traverse backwards.

                ListIterator<String> cardsListIterator = stackFCards.listIterator(stackFCards.size());

                while (cardsListIterator.hasPrevious()) {
                    String cards = cardsListIterator.previous();
                    System.out.println(cards);
                }

            }

        }
    }


