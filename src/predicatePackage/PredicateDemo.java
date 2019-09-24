package predicatePackage;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	

	public static void main(String[] args) {
		
		Predicate<Integer> predicateEven = (i) -> {return (i%2 == 0);};
		Predicate<Integer> predicateDiv5 = (i) -> {return (i%5 == 0);};

		System.out.println(predicateEven.test(8));
		System.out.println(predicateEven.and(predicateDiv5).test(80));
		System.out.println(predicateEven.and(predicateDiv5).negate().test(35));
		System.out.println(predicateEven.or(predicateDiv5).test(55));
		
		
		Predicate<Student> studPredicateGrade = (student) -> {return (student.getMarks()>35);};
		Predicate<Student> studPredicateMarks = (student) -> {return (student.getGrade()>2);};
		
		List<Student> studentList = StudentDatabase.getAllStudent();
		studentList.forEach((student) -> {	
			if(studPredicateGrade.and(studPredicateMarks).test(student)) {
				System.out.println(student);
			}
		});		
	}

}
