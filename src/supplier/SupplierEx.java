package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import predicatePackage.Student;
import predicatePackage.StudentDatabase;

public class SupplierEx {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Supplier FunctionalInterface just returns variable and does not accept a variable.
		 * Its opposite to Consumer FunctionalInterface which takes a argument and returns nothing.
		 */
		
		Supplier<Student> studentSupplier = () -> {
			Student student1 = new Student("Jack","Arts","First",2,75,Arrays.asList("Swimming","Running"));
			return student1;
		};
		
		Supplier<List<Student>> studentSupplierList = () -> {
			List<Student> studentList = StudentDatabase.getAllStudent();
			return studentList;
		};
		
		System.out.println(studentSupplier.get());
		System.out.println(studentSupplierList.get());

	}

}
