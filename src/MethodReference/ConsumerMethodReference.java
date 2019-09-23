package MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerMethodReference {

    public static Consumer<String> consumerLambda = (s) -> System.out.println(s);
    public static Consumer<String> consumerLambdaMethodRef = System.out::println;

    public static Consumer<Student> c1 = s -> System.out.println(s);
    public static Consumer<Student> c2 = Student::printListOfActivities;

    public static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 2;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }

    public static Predicate<Student> p2 = ConsumerMethodReference::greaterThanGradeLevel;

    public static void main(String[] args) {
        consumerLambda.accept("Hello Java");
        consumerLambdaMethodRef.accept("Hello Java");
        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("1- - - - - - - - - - - -");
        StudentDataBase.getAllStudents().forEach(c2);
        System.out.println("2- - - - - - - - - - - -");
        StudentDataBase.getAllStudents().forEach((student)->{
            if(p2.test(student)){
                c1.accept(student);
            }
        });

        System.out.println(StudentDataBase.studentSupplier.get());
    }
}