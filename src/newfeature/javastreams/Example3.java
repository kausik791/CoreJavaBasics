package newfeature.javastreams;

import java.util.List;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer collect = Stream
				.iterate(0, x -> x+1)
				.limit(101)
				.map(x -> x/20)
				.distinct()
				//.peek(x->System.out.println(x))
				.peek(System.out::println)
				.max((a,b) -> a-b)
				.get();
		System.out.println(collect);
		
		long count = Stream
				.iterate(0, x -> x+1)
				.limit(101)
				.map(x -> x/10)
				.distinct()
				.count();
		System.out.println(count);

	}

}
