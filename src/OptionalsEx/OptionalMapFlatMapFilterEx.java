package OptionalsEx;

import data.Bike;
import data.Student;
import data.StudentDataBase;
import java.util.Optional;

public class OptionalMapFlatMapFilterEx {
    public static void optionalFilterTest(){
        Optional.ofNullable(StudentDataBase.studentSupplier.get())
                .filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }
    public static  void optionalMapTest(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> studentNameOptional = studentOptional.filter(student -> student.getGpa()>=3.5)
                .map(student->student.getName());
        System.out.println("-"+studentNameOptional.get());
    }

    //flatMap
    public static  void optionalFlatMapTest() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)  //Optional-FlatMap() is similar to Stream FlatMap to extract Optional within Optional- > Optional Bike within OptionStudent
                .map(Bike::getName);
         name.ifPresent(s -> System.out.println("Name : "+s));

    }
    public static void main(String[] args) {
        optionalFilterTest();
        optionalMapTest();
        optionalFlatMapTest();
    }
}
