package test.basics.collectionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class collectStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 3, 67, 8, 90, 54, 848765,900,64,840, 75635, 8687645));
        numbers.stream().
                filter(num->num % 2==0).
                filter(num->num<1000).
                map(num->num*1).
                //peek(num->System.out.println("after map: "+num)).
                peek(System.out::println).
                //limit(3). // as Limit is short circuiting operation, it will stop the stream after 3 elements are processed, so only 3 elements will be printed in peek and collected in collect.
                 //collect(Collectors.toList()).
                 toList(). // from jva 16 we can use toList() instead of collect(Collectors.toList()) as it is more concise and easier to read.
                //forEach(num->System.out.println("after collect: "+num));
                forEach(System.out::println); // if we want to add "after collect: " we have use lamda expression instead of method reference, because method reference is just a shorthand for lambda expression and it doesn't allow us to add any additional text or logic.
        ArrayList<Integer> numbers2 = new ArrayList<>(List.of(1, 78, 67, 8, 91, 55));
        Optional<Integer> any = numbers2.stream().
                filter(num -> num % 2 == 0).
                findAny();
       /*if(any.isPresent()){
              System.out.println("any even number: "+any.get());
       }
       else
         {
                  System.out.println("no even number found");
         }*/
        
       //any.ifPresent(num -> System.out.println("any even number: "+num));
        
        /*Integer num = any.orElseThrow(()->new RuntimeException("no even number found"));
        System.out.println("any even number: "+num);*/

        Integer val = any.orElse(-1);// if no even number is found, it will return -1 instead of throwing an exception or returning null.
        System.out.println("any even number: " + val);
    }
}
