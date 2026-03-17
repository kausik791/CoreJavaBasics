package test.basics.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	/**
	 * The main method demonstrates the conversion of lists to arrays using different approaches.
	 * It performs operations on a list of strings and integers
	 * and showcases type inference while converting lists to arrays.
	 *
	 * @param args Command-line arguments passed to the program.
	 */
	public static void main(String[] args) {
	
		List<String> myNames = new ArrayList<>();
		myNames.add("kausik");
		myNames.add("babu");
		myNames.add("maity");
		List<Integer> digit = Arrays.asList(6,7,8,9);

		Object[] names = myNames.toArray();
		for(Object name:names) {
			System.out.println((String)name);
		}


		// Preferred way: Provide an empty array of the desired type for type inference
		
		//String[0] or upto size it works 
		String[] names2 = myNames.toArray(new String[0]);
		System.out.println(myNames.size());
		//String[] names2 = myNames.toArray(new String[myNames.size()]);
		for(String name:names2) {
			System.out.println(name);
		}
		
		Object[] numbers = digit.toArray();
		for(Object num:numbers) {
			System.out.println((int)num);
		}
		Integer[] numbers1 = digit.toArray(new Integer[0]);
		for(Integer num:numbers1) {
			System.out.println(num);
		}
		

	}
	

}
