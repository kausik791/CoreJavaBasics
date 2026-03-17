package newfeature.lamdaFunctionalInterface;

public class MainClass {

	public static void main(String[] args) {
//		Employee se = new SoftwareEngineer();
//		System.out.println(se.getName());
		
		/*
		  Functional interface can be used as data type for lamda expression
		  so lamda expression can give implementation of Functional interface
		  method.
		 */	
		Employee se=()->"Software Engineer".toUpperCase();
		System.out.println(se.getName()); //SOFTWARE ENGINEER
		
		Employee editor=()->"Editor";
		System.out.println(editor.getName()); //Editor

	}

}
