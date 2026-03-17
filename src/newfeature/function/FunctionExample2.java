package newfeature.function;

import java.util.function.Function;

public class FunctionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> fun1=s->s.toUpperCase();
		Function<String,String> fun2=s->s.substring(0, 3);
		System.out.println(fun1.andThen(fun2).apply("kausik"));

	}

}
