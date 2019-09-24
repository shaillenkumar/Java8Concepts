package lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

	public static void main(String[] args) {
		int value = 4;    //local variable value declared and initialized.]
		
		/*
		 * Case 1-
		 * Let us try declare a Consumer<Integer> functional interface below with
		 * parameter same as local variable name. 
		 * Will not compile.
		 */	
		
		
		//*** UnComment this line ******
		//Consumer<Integer> consumer1 = (value) -> System.out.println(value);
		
		/*
		 * Case 2-
		 * Let us try declare a Consumer<Integer> functional interface. 
		 * Let us try re-assign value to local variable.
		 * Inside the lambda the local variables are treated as "Effectively Final". 
		 * This facilitates programming for concurrency and functional programming.
		 * Will not compile.
		 */
		//*** UnComment below lines ******
		/*Consumer<Integer> consumer2 = (i) -> {
			value = value + 2; //reassigning value to local variable not allowed.	
		};*/
	}

}
