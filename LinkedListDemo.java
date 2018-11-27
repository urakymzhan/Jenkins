package dataStructures;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();

        // Adding

        friends.add("Ulukbek");
        friends.add("Januzak");
        friends.add("Topa");
        friends.add("Kana");
        friends.add("Doolot");
        friends.add("Kairat");

        System.out.println("Initial LinkedList : " + friends);
        System.out.println("------");


        // Adding at the specified index
        friends.add(3,"John");
        System.out.println("After add(3,\"John\") : " + friends);
        System.out.println("------");

        // Adding at the beginning
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\"): " + friends);
        System.out.println("------");

        // Adding at the end
        friends.addLast("Jeniffer");
        System.out.println("After addLast(\"Jeniffer\") : " +friends);
        System.out.println("------");

        //  Adding all the elements from an existing collection to the end of the LinkedList
        List<String> royalFamily = new ArrayList<>();

        royalFamily.add("Royal");
        royalFamily.add("King");
        royalFamily.add("Queeen");

        friends.addAll(royalFamily);

        System.out.println("After addAll(royalFamily) : " + friends);
        System.out.println("------");

        // Getting the first element
        String firstFriend = friends.getFirst();
        System.out.println("First friends Name : " + firstFriend );
        System.out.println("------");
        // Getting the last element
        String lastFriend = friends.getFirst();
        System.out.println("Last friends Name : " + lastFriend );
        System.out.println("------");
        // Getting the element at the specific position
        String specificPosition = friends.get(2);
        System.out.println("Friends Name at index 2 is : " + specificPosition);
        System.out.println("------");

        // Removing the first element
        String firstRemoved = friends.removeFirst();  // Might throw NoSuchElementException
        System.out.println("Removed the first element : " + firstRemoved);
        System.out.println("------");
        // Removing the last element
        String lastRemoved = friends.removeLast();    // Might throw NoSuchElementException
        System.out.println("Removed the last element : " + lastRemoved);
        System.out.println("------");

        // Remove the first occurrence of the specified element from the LinkedList
        boolean isRemoved = friends.remove("Ryan");
        if(isRemoved) {
            System.out.println("After removing Ryan => " + friends);
        } else{
            System.out.println("No such friend was found");
        }
        System.out.println("------");

        // Remove elements that satisfy the given condition
        friends.removeIf(friendStartWithD -> friendStartWithD.startsWith("D"));
        System.out.println("After removing friends that start with D : " + friends);
        System.out.println("------");

        // Use - clear() -  to delete all the elements of the LinkedList

        // Check if the LinkedList contains an element
        System.out.println("Does friends contain Lara? : " + friends.contains("Lara"));
        System.out.println("------");

        // Getting the first occurrence index of element
        System.out.println("Index of \"John\" : " +friends.indexOf("John") );
        System.out.println("Index of \"Topa\" : " + friends.indexOf("Topa"));
        System.out.println("------");

        // Getting the last occurrence index of element
        friends.add("Topa");
        System.out.println("Last index of \"Topa\" : " + friends.lastIndexOf("Topa"));
        System.out.println("------");

        System.out.println("Iterate over a LinkedList using Java 8 forEach and lambda :");
        friends.forEach(names -> {
            System.out.println(names);
        });
        System.out.println("------");

        System.out.println("Iterate over a LinkedList using Iterator :");

        Iterator<String> friendsIterator = friends.iterator();
        while(friendsIterator.hasNext()) {
            String friendsNames = friendsIterator.next();
            System.out.println(friendsNames);
        }
        System.out.println("------");

        System.out.println("Iterate over a LinkedList using descendingIterator :");

        Iterator<String> friendsDesIterator = friends.descendingIterator();
        while(friendsDesIterator.hasNext()) {
            String friendsDesNames = friendsDesIterator.next();
            System.out.println(friendsDesNames);
        }
        System.out.println("------");

        System.out.println("Iterate over a LinkedList using ListIterator :");
        ListIterator<String> listOfFriends = friends.listIterator(friends.size());
        while(listOfFriends.hasPrevious()) {
            String listOfNames = listOfFriends.previous();
            System.out.println(listOfNames);
        }
        System.out.println("------");

        System.out.println("Iterate over a LinkedList using for-each loop :");

        for(String loopFriends : friends) {
            System.out.println(loopFriends);
        }
        System.out.println("------");
    }
}
