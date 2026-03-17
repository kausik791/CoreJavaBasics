package newfeature.lamdaFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass3 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		list=Arrays.asList(2,9,64,78,1,2);
		//System.out.println(Collections.sort(list)); ////Println() function expect something while sort method doesn't return anything it's a void method. That's why getting error.
		//System.out.println("Before sort"+list); // [2, 9, 64, 78, 1, 2]
		//Collections.sort(list);
		//System.out.println(list); //[1, 2, 2, 9, 64, 78]
		
		//Collections.sort(list, new MyClass2()); //[78, 64, 9, 2, 2, 1]
		//System.out.println(list);
		
		//using lambda expression as,comparator is a functional interface
		Collections.sort(list, (a,b)->b-a);
		System.out.println(list); //[78, 64, 9, 2, 2, 1]

		//List<String> names = List.of("kausik", "maity", "babu", "apple");
		List<String> names = new ArrayList<>(List.of("kausik", "maity", "babu", "apple"));

		Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b)); // [apple, babu, kausik, maity]
		System.out.println(names);
	}

}
