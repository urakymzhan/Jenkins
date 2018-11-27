package dataStructures;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Integer[] nums = {2,4,1,6,3,7,9,5};
        SortedSet<Integer> tree = new TreeSet<>(Arrays.asList(nums));

        // printing first and last element
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println("---------");

        printAll(tree);
        System.out.println("---------");

        // False. it won't add because Set does not allow duplicates
        System.out.println(tree.add(1));

        // But, this will be added because 11 is not a duplicate
        System.out.println(tree.add(11));

        System.out.println("---------");


        printAll(tree);

        System.out.println("---------");

        printAll(((TreeSet<Integer>) tree).headSet(7));

    }

    public static void printAll(SortedSet<Integer> tree) {
        for(int s : tree) {
            System.out.println(s);
        }
        System.out.println();
    }

}
