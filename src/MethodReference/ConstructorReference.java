package MethodReference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {


    public static void main(String[] args) {
        Supplier<Student> studentSupplier1 = Student::new;
        Function<String,Student> studentSupplier2 = Student::new;

    }
}
