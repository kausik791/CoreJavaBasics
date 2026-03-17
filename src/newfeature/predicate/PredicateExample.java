package newfeature.predicate;

import java.awt.*;
import java.util.function.Predicate;

public class PredicateExample {


	public static void main(String[] args) {

		// The "old" way before Java 8 using an anonymous inner class
		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x > 100;
			}
		};
		System.out.println("using old ways:  "+predicate.test(1000));

		// The "new" way using a lambda expression
		Predicate<Integer> myPredicate = x -> x > 100;//<Integer> here Integer denotes the type of input parameter
		System.out.println("using lamda  :"+myPredicate.test(1000));

		// Using the predicate to test a salary
		int salary=50000;
		if(myPredicate.test(salary)) {
			System.out.println("Salary is greater than 100");
		}

	}

}
