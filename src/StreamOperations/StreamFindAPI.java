package StreamOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

/**
 * findFirst() - returns first element in stream
 * findAny()   - returns first encountered element in stream
 * Both function returns result of type Optional
 * THIS IS RELEVANT IN PARALLEL STREAMS
 */
public class StreamFindAPI {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student>  anyStud = findAnyStudent();
        Optional<Student> firstStud = findFirstStudent();
        System.out.println("findAny Stud -> "+anyStud);
        System.out.println("findFirst Stud -> "+ firstStud);
    }
}
