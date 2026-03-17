package test.basics.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        //List<String> list = Arrays.asList(arr);// Fixed: This list is of fixed size and we can't add or remove elements
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("D");
        System.out.println(list);
        List<String> l=Arrays.asList("Blueberry","Strawberry");

        //using java 9 List.of()
        String[] array = {"Java", "Python", "C++"};
        //List<String> list2=List.of(array);

        List<String> list2 =  new ArrayList<>(List.of(array));
        System.out.println(list2);
       // List<String> list3 = List.of("X", "Y", "Z");
        List<String> list3 = new ArrayList<>(List.of("X", "Y", "Z"));
        System.out.println(list3);

    }
}
