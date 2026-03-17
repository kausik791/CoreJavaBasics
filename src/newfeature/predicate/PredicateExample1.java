package newfeature.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		Predicate<Integer> predi=x-> x%2 ==0;
		List<Integer> numbers=Arrays.asList(1,3,9,6,99,76);
		for(int i:numbers) {
			if(predi.test(i)) {
				System.out.println(i+" even");
			}
		}

	}

}
