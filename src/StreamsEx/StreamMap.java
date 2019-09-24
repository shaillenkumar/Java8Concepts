package StreamsEx;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap {
		
	static Function<Student, String> studFunc = student -> student.getName();
	static Function<String, String> studNameUpperCase = name -> name.toUpperCase();
	
	
	public static List<String> nameList(){	
		List<String> studNameList = (List<String>) StudentDatabase.getAllStudent().stream()	
		 // Stream of Students
		.map(studFunc) //Transformed to Stream of Names of Student
		.map(studNameUpperCase) //Transformed to Stream of Names to Uppercase
		.collect(Collectors.toList());
		return studNameList;
	}
	
	public static Set<String> nameSet(){	
		Set<String> studNameSet = (Set<String>) StudentDatabase.getAllStudent().stream()	
		 // Stream of Students
		.map(studFunc) //Transformed to Stream of Names of Student
		.map(studNameUpperCase) //Transformed to Stream of Names to Uppercase
		.collect(Collectors.toSet());
		return studNameSet;
	}

	public static void main(String[] args) {
		
			System.out.println("Student Names List :  " +nameList());
			System.out.println("Student Names Set :  " +nameSet());
			
	}

}
 