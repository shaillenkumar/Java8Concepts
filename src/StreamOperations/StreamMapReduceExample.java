package StreamOperations;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {

    public static int totalNoOfBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter((student)-> student.getGender().equals("female"))
                .map(Student::getNotebooks)  // Stream<Integer>
                .reduce(0,(a,b)->a+b);
    }
    public static void main(String[] args) {
        System.out.println("Total No of Notebook - "+totalNoOfBooks());

    }
}
