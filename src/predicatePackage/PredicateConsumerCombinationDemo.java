package predicatePackage;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateConsumerCombinationDemo {

	public static void main(String[] args) {
		Predicate<Student> predicateGradeFilter = (student) -> (student.getGrade()>2);
		Predicate<Student> predicateMarksFilter = (student) -> (student.getMarks()>35);
		
		BiConsumer<String, List<String>> biConsumerStudent = (name, activites) -> {
			System.out.println(name +" - "+activites);
		};
		
		List<Student> studentList = StudentDatabase.getAllStudent();
		
		studentList.forEach((student)->{
			if(predicateGradeFilter.and(predicateMarksFilter).test(student)) {
				biConsumerStudent.accept(student.getName(), student.getActivities());
			}
		});
		

	}

}
