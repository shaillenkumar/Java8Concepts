package biconsumerInterface;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		// String Concat
		BiConsumer<String, String> biConsumer = (a,b) -> {
			System.out.println("Value of a : "+a +""+ "Value of b : " +b);
		};
		biConsumer.accept("Hello", "Java");
		
		// Mul
		BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Product is : "+a*b);
		
		//Div
		BiConsumer<Integer, Integer> divison = (a, b) -> System.out.println("Divison is : "+a/b);
		
		// ADD
		BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println("Add is : "+(a+b));
		
		// Chain multiple lambda expressions
		multiply.andThen(divison).andThen(addition).accept(8, 4);
		
		BiConsumer<String, List<String>> biConsumerStud = (name, activities) -> {
			System.out.println(name +" - "+activities);
		};
		List<Student> studList = StudentDatabase.getAllStudent();
		
		studList.forEach((student)->{
			biConsumerStud.accept(student.getName(), student.getActivities());
		});
		
		
	}

}
