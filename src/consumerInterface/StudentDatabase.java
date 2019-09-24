package consumerInterface;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	public static List getAllStudent(){
		Student student1 = new Student("Jack","Arts","First",75);
		Student student2 = new Student("Samantha","Fine Arts","Second",50);
		Student student3 = new Student("Diana","Geology","First",35);
		Student student4 = new Student("Jim","History","Third",80);
		Student student5 = new Student("Rose","Political","Second",60);
		Student student6 = new Student("Jeff","Commerce","First",65);
		List studList = Arrays.asList(student1,student3,student2,student4,student5,student6 );
		
		return studList;
	}	
}
