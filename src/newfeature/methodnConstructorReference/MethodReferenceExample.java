package newfeature.methodnConstructorReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		MethodReferenceExample test = new MethodReferenceExample();
		List<String> students=Arrays.asList("kausik","babu","maity");
		//students.forEach(x-> System.out.println(x));
		students.forEach(test::print);
		

	}

}
