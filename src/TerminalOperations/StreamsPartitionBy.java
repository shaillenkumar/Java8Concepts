package TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

/**
 * PartitionBy() collector is similar to groupingBy()
 * PartitionBy() accepts predicate as input
 * And return type is going to be Map<k,v>
 * The Key of the return Map will be boolean
 * There are two versions on PartitionBy()
 * 1.   partitionBy(predicate)
 * 2.   partitionBy(predicate, downstream) // downstream -> could be any collector
 */
public class StreamsPartitionBy {
    public static Map<Boolean, List<Student>> partitionBy_1(){
        Predicate<Student> studentPredicate = (student) -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> partitionMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(studentPredicate));// default downstream is List
        return partitionMap;
    }
    public static Map<Boolean, Set<Student>> partitionBy_2(){
        Predicate<Student> studentPredicate = (student) -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partitionMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(studentPredicate, toSet()));
        return partitionMap;
    }
    public static void main(String[] args) {
        System.out.println("partitionBy_1() -> "+partitionBy_1());
        System.out.println("------------------------------------");
        System.out.println("partitionBy_2() -> "+partitionBy_2());
    }
}
