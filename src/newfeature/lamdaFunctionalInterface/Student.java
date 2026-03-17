package newfeature.lamdaFunctionalInterface;

import java.util.Objects;

public class Student {
	
	int id;
	 String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return this. id + ":" +this.name;
	}

		

}
