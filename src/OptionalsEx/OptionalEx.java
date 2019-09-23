package OptionalsEx;

import data.Student;
import data.StudentDataBase;
import java.util.Optional;

public class OptionalEx {
    public static String getStudent() {
        Student student = StudentDataBase.studentSupplier.get();
        if(student!=null) {
            return student.getName();
        }else return null;
    }
    public static Optional<String> getOptionalStudent() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // Optional.ofNullable(null) will return Optional.empty()
            if(studentOptional.isPresent()){
               return studentOptional.map(student->student.getName());
            }else {
                return studentOptional.empty();
            }
    }
    public static void main(String[] args) {
        String studName = getStudent();
        if(studName!=null){
            System.out.println("Student name length : "+studName.length());
        }
        if(getOptionalStudent().isPresent()) {
            String studNameFromOptional = getOptionalStudent().get();
            System.out.println("Student name length From Optional: "+studNameFromOptional.length());
        }
    }
}
