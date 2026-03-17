package newfeature.methodnConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constructorreeference {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("kausik","babu","maity");
		//List<Student> collect = names.stream().map(x ->new Student(x)).collect(Collectors.toList());
		List<Student> collect = names.stream().map(Student::new).collect(Collectors.toList());

	}

}
