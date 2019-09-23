package TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * minBy takes always Comparator as an input  and the output is Optional type
 * maxBy takes always Comparator as an input  and the output is Optional type
 */
public class StreamMinByMaxBy {
    public static void main(String[] args) {
        Optional<Student> minStud = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
        Optional<Student> maxStud = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
        System.out.println(minStud +"/"+ maxStud);
    }
}
