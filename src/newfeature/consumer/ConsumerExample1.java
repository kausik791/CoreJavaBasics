package newfeature.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {

	//consumer functional interface is having only one method accept() which is of void type
	public static void main(String[] args) {
		
		Consumer<String> cons=s->System.out.println(s); //no return
		//The :: syntax tells Java: "Take the println method from the System.out object and use it to satisfy the Consumer interface." Since println accepts a value and returns nothing, it matches the Consumer signature perfectly.
		//Consumer<String> cons= System.out::println;

		cons.accept("kausik");//syso won't work because accept() is of void return type.
	}

}
