package predicatePackage;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	public static List getAllStudent(){
		Student student1 = new Student("Jack","Arts","First",2,75,Arrays.asList("Swimming","Running"));
		Student student2 = new Student("Samantha","Fine Arts","Second",1,50, Arrays.asList("VolleyBall","Tennis"));
		Student student3 = new Student("Diana","Geology","First",4,35, Arrays.asList("Badminton"));
		Student student4 = new Student("Jim","History","Third",5,80,Arrays.asList("Cricket"));
		Student student5 = new Student("Rose","Political","Second",3,60,Arrays.asList("Tennis","Badminton"));
		Student student6 = new Student("Jeff","Commerce","First",4,65,Arrays.asList("Swimming"));
		List studList = Arrays.asList(student1,student3,student2,student4,student5,student6 );
		
		return studList;
	}	
}
