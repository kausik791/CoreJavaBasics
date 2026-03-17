package newfeature.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> even = new ArrayList<>();
        for (int n : list) {
            if (n % 2 == 0) {
                even.add(n * n);
            }
        }
        for (int n : even) {
            System.out.println(n);
        }
        // using stream
        list.stream().
                filter(n -> n % 2 == 0).
                map(n -> n * n).
                collect(Collectors.toList()).
                forEach(s -> System.out.println(s));

        list.stream().
                filter(n -> n % 2 == 0).
                map(n -> n * n).
                toList().// from java 16
                forEach(System.out::println);

    }
}
