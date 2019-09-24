package FunctionInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentEx {

	public static void main(String[] args) {
		Predicate<Student> pGrade = (student)->{
			return student.getGrade()>2;
		};
		
		Function<List<Student>, Map<String, Integer>> studFunction = (students) -> {
			Map<String, Integer> studentGradeMap = new HashMap<>();
			students.forEach((student)->{
				if(pGrade.test(student)) {
					studentGradeMap.put(student.getName(), student.getGrade());
				}
			});
			return studentGradeMap;
		};
		
		
		Map studentGradeMap = studFunction.apply(StudentDatabase.getAllStudent());
		System.out.println(studentGradeMap);
		
	}

}
