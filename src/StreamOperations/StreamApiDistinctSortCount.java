package StreamOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Distinct - returns stream with unique elements
 * Sorted   - sort elements in Stream
 * Count    - returns long Number of elements in Stream
 * Customised - using Comparators
 */

    public class StreamApiDistinctSortCount {

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()//Stream of Student
                .map(Student::getActivities)//Stream List<String>  [[cric,football],[basketball,tennis],[baseball,hockey]]
                .flatMap(List::stream)// Stream List of String
                .distinct() // Stream of distinct activities
                .sorted() // Stream of sorted activities
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static List<Student> printStudentNamesSorted(){
        List<Student> students =StudentDataBase.getAllStudents().stream()//Stream of Students
                .sorted(Comparator.comparing(Student::getName)) // Stream of sorted activities
                .collect(Collectors.toList());
        return students;
    }

    public static long countOfStudentActivities(){
        long studentActivitiesCount = StudentDataBase.getAllStudents().stream()//Stream of Student
                .map(Student::getActivities)//Stream List<String>  [[cric,football],[basketball,tennis],[baseball,hockey]]
                .flatMap(List::stream)// Stream List of String
                .distinct() // Stream of distinct activities
                .count();
        return studentActivitiesCount;
    }


    public static void main(String[] args) {
        List<String> activities =  printStudentActivities();
        System.out.println(activities);
        System.out.println(countOfStudentActivities());
        System.out.println("PrintStudent List with Names Sorted -> "+printStudentNamesSorted());
    }
}

