package test.basics.collectionexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionContains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        String itemToCheck = "banana";
        if (list.contains(itemToCheck)) {
            System.out.println(itemToCheck + " is in the list.");
        } else {
            System.out.println(itemToCheck + " is not in the list.");
        }


        ArrayList<String> s = new ArrayList<>();
        s.add("Apple");
        s.add("Blueberry");
        s.add("Strawberry");
        List<String> l = Arrays.asList("Blueberry", "Strawberry");
        System.out.println(s.containsAll(l));
    }
}
