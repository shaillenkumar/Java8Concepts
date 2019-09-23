package StreamOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamApiReduce {

    public static Optional<Student> getHighestGpaStudent(){
        Optional<Student> student = StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                    if (s1.getGpa()>s2.getGpa())  return s1;
                    else return (s2);
                });
        return student;
    }
    public static Optional<Student> getHighestGradeStudent(){
        Optional<Student> student = StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->s1.getGradeLevel()>s2.getGradeLevel()? s1:s2
                );
        return student;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,5,7,10,12,8);
        int resultWithIdentity = intList.stream()
                .reduce(1, (a,b)->a*b);
        System.out.println("---1--");
        System.out.println("Reduce Result With Identity -> "+resultWithIdentity);
        // NOTE : without the identity reduce returns Optional type value
        Optional<Integer> resultWithoutIdentity = intList.stream()
                .reduce((a,b)->a*b);
        System.out.println("---2--");
        System.out.println(resultWithoutIdentity.isPresent());
        System.out.println("Reduce Result Without Identity -> "+resultWithoutIdentity); // return OPtional rsult without identity

        System.out.println("---3--");
        System.out.println("Reduce function to get highest Gpa -> "+getHighestGpaStudent());

        System.out.println("---4--");
        System.out.println("Reduce function to get highest Gpa -> "+getHighestGradeStudent());
    }
}
