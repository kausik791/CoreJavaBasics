package newfeature.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		List<String> list = Arrays.asList("apple","banana","orange");
		Stream<String> myStream = list.stream();
		//2
		String[] array= {"apple","banana","orange"};
		Stream<String> stream = Arrays.stream(array);
		//3
		Stream<Integer> intStream = Stream.of(1,2,3,4,5);
		//4
		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);
		
		//5
		Stream<Integer> num=Stream.generate(() ->(int)Math.random()*100).limit(100);

	}

}
