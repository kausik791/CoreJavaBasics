package newfeature.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,78,99,65,56,2,6);
//		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//		System.out.println(filteredList); // [2, 4, 6, 78, 56, 2, 6]
//		List<Integer> mappedList = filteredList.stream().map(x -> x/2).collect(Collectors.toList());
//		System.out.println(mappedList); //[1, 2, 3, 39, 28, 1, 3]
		
//		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x/2).collect(Collectors.toList());
//		System.out.println(filteredList);//[1, 2, 3, 39, 28, 1, 3]
		
		//Distinct
//		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x/2).distinct().collect(Collectors.toList());
//		System.out.println(filteredList);//[1, 2, 3, 39, 28]
		
		//sorted
//		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x/2).distinct().sorted().collect(Collectors.toList());
//		System.out.println(filteredList); //[1, 2, 3, 28, 39]

//		list.stream().filter(x -> x % 2 == 0).map(x -> x/2).
//				distinct().sorted().forEach(System.out::println); //1 2 3 28 39

//		List<Integer> filteredList =list.stream().filter(x -> x % 2 == 0).map(x -> x/2).
//				distinct().sorted().peek(System.out::println).collect(Collectors.toList()); //1 2 3 28 39
//		System.out.println(filteredList); //[1, 2, 3, 28, 39]

		//finding max value
//		list.stream().filter(x -> x % 2 == 0).map(x -> x/2).
//				distinct().sorted().max((a,b) -> a-b).
//				ifPresent(System.out::println); //39 //Instead of calling .get() (which crashes if the value is missing), ifPresent safely checks for the value first.
              /*why we are allowed to call 2 terminal method in max((a,b) -> a-b).
		ifPresent(System.out::println);----ask Ai
               */

		//sorted using comparator
//				List<Integer> filteredList = list.stream()
//						.filter(x -> x % 2 == 0).map(x -> x/2)
//						.distinct().sorted((a,b) -> b-a).collect(Collectors.toList());	
//				System.out.println(filteredList);  //
		
		//limit
//		List<Integer> filteredList = list.stream()
//				.filter(x -> x % 2 == 0).map(x -> x/2)
//				.distinct().sorted((a,b) -> b-a).limit(3).collect(Collectors.toList());
//		System.out.println(filteredList);//[39, 28, 3]
//		
		//skip
//		List<Integer> filteredList = list.stream()
//				.filter(x -> x % 2 == 0).map(x -> x/2)
//				.distinct().sorted((a,b) -> b-a).limit(3).skip(1).collect(Collectors.toList());
//		System.out.println(filteredList); //[28, 3]

		//findFirst
//		list.stream()
//				.filter(x -> x % 2 == 0).findFirst().ifPresent(System.out::println);
       //findAny
//		list.stream()
//				.filter(x -> x % 2 == 0).findAny().ifPresent(System.out::println);

		//any match
//		boolean b = list.stream()
//				.filter(x -> x % 2 == 0).anyMatch(x -> x > 50);
//		System.out.println(b); //true
       //all matchs
//		boolean b1 = list.stream()
//				.filter(x -> x % 2 == 0).allMatch(x -> x > 10);
//		System.out.println(b1); //false
		//none match
//		boolean b2 = list.stream()
//				.filter(x -> x % 2 == 0).noneMatch(x -> x > 100);
//		System.out.println(b2); //true

		//reduce
		Optional<Integer> value = list.stream()
				.filter(x -> x % 2 == 0).reduce((x, y) -> x + y);
		Integer i = value.get();
		System.out.println(i); //154
		value.ifPresent(s-> System.out.println(s)); //154
		Integer i1 = value.orElse(0);
		System.out.println(i1); //154
		value.ifPresentOrElse(s-> System.out.println(s),()-> System.out.println("no value present")); //154


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
