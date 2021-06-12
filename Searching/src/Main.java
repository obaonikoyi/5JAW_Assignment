
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Course> courses = new ArrayList<Course>(); 
        List<Enrollment> enrollments = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<Student>(); 
        
        Course D4SD = new Course(100,"D4SD", "Diploma of Software Development", 999.00);
        Course C3PR = new Course(112,"C3PR", "Certificate III IN Programing", 699.00);
        Course AD5SD = new Course(222,"AD5SD", "Advance Diploma of Software Development", 1299.00);
        
        courses.add(D4SD);
        courses.add(C3PR);
        courses.add(AD5SD);
        
        Enrollment e1 = new Enrollment(new Date(), "2", "Awaited", D4SD);
        Enrollment e2 = new Enrollment(new Date(2012, 1, 15), "1", "Passed",C3PR);
        Enrollment e3 = new Enrollment( new Date(2018, 11, 25), "2", "Awaited", AD5SD);
        
        enrollments.add(e1);
        enrollments.add(e2);
        enrollments.add(e3);
       
        Student s1 = new Student(1009789, "Diploma", new Date(), e1, "Hopper Jane", "0451227899", "HopJane45@yahoo.com", 21, "Good street", "Wayville", "SA", "5035");
        Student s2 = new Student(2123456, "Certificate", new Date(2011, 12, 22), e2, "Dave Fredora", "0450332114", "FreDavoo32@yahoo.com", 32, "Currie Street", "Adelaide CBD", "SA", "5000");
        Student s3 = new Student(3098765, "Certificate", new Date(2017, 10, 22),e1, "Carmel Ziar", "0451344489", "ZairCarmella@yahoo.com", 25, "leader street", "Adelaide CBD", "SA", "5000");
        Student s4 = new Student(4123454, "Advance", new Date(2018, 10, 22), e3, "Katty Phil", "0451644679", "KattyPhil@gmail.com", 25, "marion street", "Marion", "SA", "5043");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println("\nLinear Search for student");
        
        System.out.println("\nSearch for studentid: 1122298 \nExpected result: 1");
        System.out.println("Actual result: " + Search.linearSearchStudent(students, 2123456));
        
        System.out.println("\nSearch for studentid: 0 \nExpected result: -1 (not found)");
        System.out.println("Actual result: " + Search.linearSearchStudent(students, 0));
        
        System.out.println();
        System.out.println("\nBinary Search for course");
        System.out.println("\nSearch for course id: 222 \nExpected result:2"); 
        System.out.println("Actual result: " + Search.BinarySearchCourse(courses , 222)); 
        System.out.println("\nSearch for course Id: 0 \nExpected result: -1");
        System.out.println("\nSearch for course Id: 0 \nExpected result: -1");
        System.out.println("Actual result: " + Search.BinarySearchCourse(courses, 0));

        System.out.println();

    }
}