package DefaultMethodStaticInterfaceEx;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodEx2 {
    static Consumer<Student> studConsumer = (student) -> System.out.println(student.getName());

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Printing List Before Sorting");
        studentList.forEach(studConsumer); // Printing the List using Consumer
        System.out.println("Printing List After Sorting By Name" );
        Comparator comparator = Comparator.comparing(Student::getName);
        studentList.sort(comparator);
        studentList.forEach(studConsumer);
        System.out.println("Printing List After Sorting By Gpa" );
        Comparator comparatorGpa = Comparator.comparing(Student::getGpa);
        studentList.sort(comparatorGpa);
        studentList.forEach(studConsumer);
        // Comparator Chaining
        System.out.println("Comparator Chaining Print List Sorting Names and GPA");
        Comparator gradeCompartor = Comparator.comparing(Student::getGradeLevel);
        Comparator nameCompartor = Comparator.comparing(Student::getName);
        studentList.sort(nameCompartor.thenComparing(gradeCompartor));
        studentList.forEach(studConsumer);



    }
}
