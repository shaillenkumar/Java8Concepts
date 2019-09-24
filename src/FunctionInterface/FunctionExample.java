package FunctionInterface;

import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		
		Function<String, String> function = (name) -> name.toUpperCase();
		Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("someString");
		
		System.out.println(function.apply("java8"));
		
		System.out.println(function.andThen(addSomeString).apply("java8 "));
		
		System.out.println(function.compose(addSomeString).apply("java8 "));
	}

}
