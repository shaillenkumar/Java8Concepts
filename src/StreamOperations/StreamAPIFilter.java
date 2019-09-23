package StreamOperations;

import data.StudentDataBase;
import static java.util.stream.Collectors.toList;

/***
 * filter() filters the element in the streams . Input to the filter is Predicate.
 * reduce is a terminal operation. Used to reduce the content of a Stream to single value.
 * reduce takes two parameters - first parameter is default or initial value And second parameter is BinaryOperator</T>
 */
public class StreamAPIFilter {

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student-> student.getGpa()>3.7)
                .collect(toList());
    }
}
