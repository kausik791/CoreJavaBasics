package newfeature.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<List<Integer>> listConsumer=li->{
			for(int i:li) {
				System.out.println(100+i);
			}
			
		};
		
		//listConsumer.accept(Arrays.asList(1,5,2,4));

		Consumer<List<Integer>> listConsumer2=li->{
			for(int i:li) {
				System.out.println(i);
			}
			
		};
		
		listConsumer2.andThen(listConsumer).accept((Arrays.asList(1,5,2,4)));
	}

}
