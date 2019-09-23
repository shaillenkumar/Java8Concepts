package TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingBy {

    public static Map<String, List<Student>>groupingByGender(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>>groupingByGPA(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student->student.getGpa()>=3.8 ? "Outstanding":"Average"));
    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy((student) -> student.getGpa()>=3.8 ? "Outstanding":"Average")));
        return studentMap;
    }


    public static Map<Integer, Integer>twoLevelGrouping_2(){
        return StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNotebooks)));
    }

    public static LinkedHashMap<String, Set<Student>> threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));
        return studentLinkedHashMap;
    }
    public static Map<Integer, Optional<Student>> calculateTopGpa(){
       Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
       return studentMapOptional;
    }

    public static void main(String[] args) {
        System.out.println("-------  groupingByGender   -------");
        System.out.println(groupingByGender());
        System.out.println("-------  groupingByGPA      --------");
        System.out.println(groupingByGPA());
        System.out.println("-------  twoLevelGrouping_1 --------");
        System.out.println(twoLevelGrouping_1());
        System.out.println("-------  twoLevelGrouping_2 --------");
        System.out.println(twoLevelGrouping_2());
        System.out.println("-------  threeArgumentGroupBy--------");
        System.out.println(threeArgumentGroupBy());
        System.out.println("-------   calculateTopGpa    --------");
        System.out.println(calculateTopGpa());
    }


}
