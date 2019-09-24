package FunctionInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionEx {

	public static void main(String[] args) {
		
		Predicate<Student> predicateStudentGrade = (student) -> student.getGrade()>2; 

		Map<String, Integer> studentMap = new HashMap<>();

		BiFunction<List<Student>, Predicate<Student>, Map<String, Integer>> biFunction = (students, predicate) -> {
			students.forEach((student) -> {
				if(predicate.test(student)) {
					studentMap.put(student.getName(), student.getGrade());
				}
			});
			return studentMap;
		};


		System.out.println(biFunction.apply(StudentDatabase.getAllStudent(),predicateStudentGrade));

	}
}
