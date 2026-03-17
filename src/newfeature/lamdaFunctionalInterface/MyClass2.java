package newfeature.lamdaFunctionalInterface;

import java.util.Comparator;

public class MyClass2 implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		
		return b-a;
	}

}
