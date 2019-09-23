package StreamOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatmapEx {

    public static List<String> printStudentActivities(){
        List <String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream of Student
                .map(Student::getActivities)//Stream List<String>  [[cric,football],[basketball,tennis],[baseball,hockey]]
                .flatMap(List::stream)// Stream List of String
                .collect(Collectors.toList());
        return studentActivities;
    }
    public static void main(String[] args) {
        List<String> activities =  printStudentActivities();
        System.out.println(activities);
    }
}
