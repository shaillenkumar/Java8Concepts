package predicatePackage;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biPredicateStudentFilter = (grade, marks) -> (grade>2 && marks>35);
		BiConsumer<String , List<String>> biConsumerStudent = (name, activities) -> {
			System.out.println(name +" - "+activities);
		};
		
		List<Student> studentList = StudentDatabase.getAllStudent();
		studentList.forEach((student) -> {	
			if(biPredicateStudentFilter.test(student.getGrade(), student.getMarks())){
				biConsumerStudent.accept(student.getName(), student.getActivities());
			}
		});
	}

}
