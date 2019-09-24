package consumerInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	static Consumer<Student> c1 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c2 = (student) -> System.out.println(" - "+student.getYear());
	
	public static void printStudent() {
		List<Student> studentList = StudentDatabase.getAllStudent();

		studentList.forEach(c1.andThen(c2));
		
	}
	
	public static void printStudentPassed() {
		List<Student> studentList = StudentDatabase.getAllStudent();

		studentList.forEach((student)->{
			if(student.grade>50) {
				c1.andThen(c2).accept(student);
			}
		});
		
	}

	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());		
		consumer.accept("java8");
		printStudent();
		System.out.println("===================");
		printStudentPassed();

	}

}
