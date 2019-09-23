package ParallelStream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.currentTimeMillis;

public class ParalleStreamExample1 {

    public static List<String> printStudentActivitiesSequential(){
        long startTime = System.currentTimeMillis();
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Print StudentActivitiesSequential Performance "+(endTime - startTime));
        return studentList;
    }

    public static List<String> printStudentActivitiesParallel(){
        long startTime = System.currentTimeMillis();
        List<String> studentList =  StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Print StudentActivitiesParallel Performance "+(endTime - startTime));
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println("Print StudentActivities Sequential -> "+printStudentActivitiesSequential());
        System.out.println("Print StudentActivities Parallel ->  "+printStudentActivitiesParallel());

    }

}
