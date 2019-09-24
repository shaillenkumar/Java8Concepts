package BinaryAndUnaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;


public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator1 = (a , b) -> a*b;
		System.out.println(binaryOperator1.apply(4,6));
		
		
		Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
		BinaryOperator<Integer> maxOp = BinaryOperator.maxBy(comparator);
		System.out.println(maxOp.apply(4,6));
		
		
		BinaryOperator<Integer> minOp = BinaryOperator.minBy(comparator);
		System.out.println(minOp.apply(300, 50));

	}

}
