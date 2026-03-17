package newfeature.javastreams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
        // from collection
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = list.stream();
        //from array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntStream stream1 = Arrays.stream(array);
        stream1.filter(x -> x % 2 == 0).forEach(System.out::println);
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        // From Values
        Stream<? extends Serializable> mango = Stream.of("mango", 2, 3);
        mango.forEach(System.out::println);
        //Infinite Streams
        Stream.generate(()->Math.random()).limit(5).forEach(System.out::println);
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
        infiniteStream.limit(5).forEach(System.out::println);
    }
}
