package newfeature.predicate;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		Predicate<String> predi=x-> x.toLowerCase().charAt(0)=='b';
		// return type of predicate functional interface test() is boolean 
		System.out.println(predi.test("babu"));
		Predicate<String> predi2=x-> x.toLowerCase().charAt(x.length()-1)=='u';
		System.out.println(predi2.test("babu"));
		
		//using negate
		System.out.println(predi2.negate().test("babu"));
		
		//using and
		Predicate<String> and = predi.and(predi2);
		System.out.println(and.test("babu"));
		
		//using iseqal
		//as iseqal static method we can call only by interface Predicate 
		Predicate<Object> predi4 = Predicate.isEqual("kausik");
		System.out.println(predi4.test("kausik"));
		
		Student s1=new Student(1, "Ram");
		Student s2=new Student(2, "Ram");
		
		Predicate<Student> studentPredi= x->x.getId()>1;
		System.out.println(studentPredi.test(s2));
	}
	
	private static class Student{
		
		int id;
		String name;
		public Student(int id, String name) {
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
			
		}
		
	}


