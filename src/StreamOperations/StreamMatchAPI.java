package StreamOperations;

import data.StudentDataBase;

/**
 * ANyMatch - returns true if any one element matches the predicate
 * MatchAll - returns true if all elements matches
 * MatchNone - returns true if no element matches, otherwise returns false
 * All these function takes predicate as an input and returns Boolean as output
 */
public class StreamMatchAPI {

    public static boolean testMatchAll(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }
    public static boolean testMatchNone(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=10);
    }
    public static boolean testMatchAny(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }

    public static void main(String[] args) {
        System.out.println(testMatchAll());
        System.out.println(testMatchNone());
        System.out.println(testMatchAny());

    }
}
