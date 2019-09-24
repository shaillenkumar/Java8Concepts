package StreamsEx;


import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		
		Predicate<Student> p1 = (student) -> student.getGrade()>=2;
		Predicate<Student> p2 = (student) -> student.getMarks()>=50;
		
		System.out.println(StudentDatabase.getAllStudent().stream()
				.filter(p1)    // is called Intermediate Operation
				.filter(p2)	   // is called Intermediate Operation
				.collect(Collectors.toMap(Student::getName, Student::getActivities))); 
				//	Collector is one of the Terminal Operation
				//  Terminal operation starts the Intermediate Operations
				//  Without the Terminal Operation the Intermediate Operation will not execute.
		// The Intermediate operation with the Terminal operation is called the StreamPipeline

	}

}
