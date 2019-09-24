package StreamsEx;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDebug {

	public static void main(String[] args) {

		Predicate<Student> p1 = (student) -> student.getGrade()>=2;
		Predicate<Student> p2 = (student) -> student.getMarks()>=50;
		
		// Debug stream using peek method.
		System.out.println(StudentDatabase.getAllStudent().stream()
				.filter(p1)
				.peek(student-> System.out.println("After Filter-1-> "+student))
				.filter(p2)	 
				.peek(student -> System.out.println("After Filter-2-> "+student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities)));
	}
}
