package dataStructures;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();

        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);
        System.out.println("------");

        // Check f the HashMap is empty
        System.out.println("is numberMapping empty? : " + numberMapping.isEmpty());
        System.out.println("------");
        // Size of the HashMap
        System.out.println("Size of the numberMapping is: " + numberMapping.size());
        System.out.println("------");

        // Check if a Key exists in the HashMap
        String number1 = "One";
         if (numberMapping.containsKey(number1)) {
             int keyNum = numberMapping.get(number1);
             System.out.println(number1 + " has the key value of : " + keyNum);
        } else {
             System.out.println("Key was not found for :  " + number1);
         }
        System.out.println("------");
        // Check if a value exists in a HashMap

        if(numberMapping.containsValue(1)){
            System.out.println("There is a corresponding String number to 1(key) in numberMapping HashMap");
        } else {
            System.out.println("There is NO corresponding String number to 1(key) in numberMapping HashMap");
        }
        System.out.println("------");

        // Modify
        numberMapping.put("One",10);
        System.out.println("Now One has the Key of 10");
        System.out.println("------");

        // The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println(" Tens number: " + numberMapping.get("Ten"));
        System.out.println("------");

        // Remove
        numberMapping.remove(1);
        System.out.println("One has removed from numberMapping");
        System.out.println("------");

        // HashMap's entry set
        Set<Map.Entry<String, Integer>> StringIntNumbers = numberMapping.entrySet();
        System.out.println("String and Integer set of numbers are : " + StringIntNumbers);
        System.out.println("------");

        // HashMap's key set
        Set<String> StringNumbers = numberMapping.keySet();
        System.out.println("String numbers are : " + StringNumbers);
        System.out.println("------");

        // HasMaps values
        Collection<Integer> IntNumbers = numberMapping.values();
        System.out.println("Integer numbers are : " + IntNumbers);
        System.out.println("------");

        // ITERATION

        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        numberMapping.forEach((num1, num) -> {
            System.out.println(num1 + " => " + num);
        });
        System.out.println("------");

        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Integer>> setOfNumbers = numberMapping.entrySet();
        Iterator<Map.Entry<String, Integer>> iteratorOfNums = setOfNumbers.iterator();
        while(iteratorOfNums.hasNext()) {
            Map.Entry<String, Integer> entry = iteratorOfNums.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("------");


        System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        numberMapping.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });
        System.out.println("------");

        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        numberMapping.keySet().forEach(numss -> {
            System.out.println(numss + " => " + numberMapping.get(numss));
        });
        System.out.println("------");

        System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");

        for(Map.Entry<String, Integer> numsss : numberMapping.entrySet()) {
            System.out.println(numsss.getKey()+ " => " +numsss.getValue());
        }
        System.out.println("------");
    }
}
