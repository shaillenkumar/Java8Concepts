package DefaultMethodStaticInterfaceEx;

import DefaultMethodStaticInterfaceEx.data.StudentDataBase;
import DefaultMethodStaticInterfaceEx.data.Student;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethod3 {
    public static void main(String[] args) {
        Consumer<Student> studprintConsumer = (student)-> System.out.println(student.getName());
        List<Student> studentList = StudentDataBase.getAllStudents();
        Comparator comparatorNames = Comparator.comparing(Student::getName);
        Comparator comparatorNullValues = Comparator.nullsFirst(comparatorNames);
        studentList.sort(comparatorNullValues);
        System.out.println("Printing Students After Sorting By Name with Null Values");
        studentList.forEach(studprintConsumer);
    }
}
