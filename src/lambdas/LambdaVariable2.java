package lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
	static int  value = 4;    //instance level variable  declared and initialized.

	public static void main(String[] args) {
		
		
		/*
		 * Case 1-
		 * Let us try declare a Consumer<Integer> functional interface below with
		 * parameter same as instance variable name. 
		 * No restriction on instance variable
		 */				
		Consumer<Integer> consumer1 = (value) -> System.out.println(value);
		/*
		 * Case 2- instance variable reassigned with new value.
		 * No restriction on instance variable
		 */
		Consumer<Integer> consumer2 = (i) -> {
			System.out.println(value+i);
		};	
		
		// calling the lambda expression
		consumer1.accept(5);
		consumer2.accept(5);
	}

}
