package OptionalsEx;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseEx {

    public static String testOptionalOrElse(){
        //try Un-Commenting line 12 and commenting line 11
       // Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String studName = optionalStudent.map(student -> student.getName()).orElse("DefaultValue");
        return studName;
    }

    public static String testOptionalOrElseget(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String studentName = studentOptional.map(Student::getName).orElseGet(()->"Default value"); //.oeElseGet(Supplier)
        return studentName;
    }
    public static String testOptionalOrElseThrow() {
        //try Un-Commenting line 25 and commenting line 26
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String studentName = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No Data Found!!"));//orElseThrow(Supplier)
        return studentName;
    }
    public static void main(String[] args) {
        System.out.println(testOptionalOrElse());
        System.out.println(testOptionalOrElseget());
        System.out.println(testOptionalOrElseThrow());
    }
}
