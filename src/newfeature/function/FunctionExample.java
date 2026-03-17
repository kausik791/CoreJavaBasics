package newfeature.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Student s1= new Student(1,"kausik");
		Student s2= new Student(2,"babu");
		Student s3= new Student(3,"maity");
		Student s4= new Student(4,"kaustav");
		List<Student> students = Arrays.asList(s1,s2,s3,s4);
		
		//first argument is input type 2nd argument is return type
		Function<String, Integer> fun=x->x.length();
		System.out.println(fun.apply("kausik"));
		
		Function<String, String> fun2=x->x.substring(0, 3);
		System.out.println(fun2.apply("kausik"));
		
		Function<List<Student>,List<Student>> studenkauAsPrefix = li->{
			List<Student> result=new ArrayList<>();
			for(Student s:li) {
				if(fun2.apply(s.getName()).equalsIgnoreCase("kau")){
					result.add(s);
				}
			}
			return result;
		};
		System.out.println(studenkauAsPrefix.apply(students));
		
		
	}
	private static class Student{
		private int id;
		private String name;
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
		
		
	}

}
