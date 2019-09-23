package TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamSummingAveraging {

    public static void main(String[] args) {
        int totalNotebooks = StudentDataBase.getAllStudents().stream()
                // Similar to summingInt there is summingLong summingDouble
                .collect(Collectors.summingInt(Student::getNotebooks));
        double avergeNoOfNotebooks = StudentDataBase.getAllStudents().stream()
                // Similar to averagingInt there is averagingLong averagingDouble
                .collect(Collectors.averagingInt(Student::getNotebooks));
        System.out.println("summingInt Total Notebooks = "+totalNotebooks);
        System.out.println("averagingInt Average Notebooks/Stud = "+avergeNoOfNotebooks);
    }
}
