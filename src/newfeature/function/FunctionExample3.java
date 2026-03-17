package newfeature.function;

import java.util.function.Function;

public class FunctionExample3 {

	public static void main(String[] args) {
		Function<Integer,Integer> fun1=x->2*x;
		Function<Integer,Integer> fun2=x-> x*x*x;
		System.out.println(fun1.andThen(fun2).apply(3));//216
		System.out.println(fun2.andThen(fun1).apply(3));//54
		System.out.println(fun1.compose(fun2).apply(3));//54 works same way as fun2.andThen(fun1) 
		
		Function<String,String> idenFun=Function.identity();
		System.out.println(idenFun.apply("kausik"));
	}

}
