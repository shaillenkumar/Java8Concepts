package BinaryAndUnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		//Unary operator takes one argument and returns same type
		UnaryOperator<String> unaryOp = (s) -> s.toUpperCase();
		
		System.out.println(unaryOp.apply("java java"));
		
		

	}

}
