package TerminalOperations;

import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsCountingMapping {
    public static void main(String[] args) {
        long count = StudentDataBase.getAllStudents().stream()
                //Collectors.counting
                // get count of elements processed in Stream
                .collect(Collectors.counting());
        List<String> nameList = StudentDataBase.getAllStudents().stream()
                //Collectors.mapping
                .collect(mapping(Student::getName,toList())); // get Stud names from Stream and convert to List of String
        System.out.println(nameList);
        Set<String> nameSet = StudentDataBase.getAllStudents().stream()
                //Collectors.mapping
                .collect(mapping(Student::getName,toSet())); // get Stud names from Stream and convert to List of String
        System.out.println(nameSet);
    }
}
