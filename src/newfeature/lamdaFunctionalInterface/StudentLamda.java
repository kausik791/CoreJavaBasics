package newfeature.lamdaFunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentLamda {

	private static final String List = null;

	public static void main(String[] args) {
		Student s1=new Student(50, "kausik");
		Student s2=new Student(5, "babu");
		Student s3=new Student(99, "maity");
		Student s4=new Student(1, "kohli");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		//Collections.sort(list, (a,b)->a.id-b.id);
		
		Collections.sort(list,(a,b)->a.name.compareTo(b.name));
		System.out.println(list);
		
		
	
	}

}
