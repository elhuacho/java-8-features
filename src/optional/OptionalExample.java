package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName() {
//        Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        } else {
            return null;
        }
    }

    public static Optional<String> getStudentNameOptional() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty()
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty(); // Represents an optional object with no value
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        if (name != null) {
//            System.out.println("Length of the student name : " + name.length());
//        } else {
//            System.out.println("Name not found");
//        }
        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println("Length of the student name : " + stringOptional.get());
        } else {
            System.out.println("Name not found");
        }
    }
}
