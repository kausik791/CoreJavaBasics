package newfeature.supplier;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		//Supplier<Integer> supplier=()->1; //no input
		//Supplier<String> supplier=()->"Kausik".toUpperCase(); //no input
		Supplier<String> supplier= "Kausik"::toUpperCase; //no input
		System.out.println(supplier.get());

	}

}
