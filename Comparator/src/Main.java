
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
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
        
        Course D4SD = new Course("D4SD", "Diploma of Software Development", 999.00);
        Course C3PR = new Course("C3PR", "Certificate III IN Programing", 699.00);
        Course AD5SD = new Course("AD5SD", "Advance Diploma of Software Development", 1299.00);
        
        courses.add(D4SD);
        courses.add(C3PR);
        courses.add(AD5SD);
        
        Enrollment e1 = new Enrollment(new Date(), "2", "Awaited", D4SD);
        Enrollment e2 = new Enrollment(new Date(2012, 1, 15), "1", "Passed",C3PR);
        Enrollment e3 = new Enrollment( new Date(2018, 11, 25), "2", "Awaited", AD5SD);
        
        enrollments.add(e1);
        enrollments.add(e2);
        enrollments.add(e3);
        
        Student s1 = new Student("Hopper Jane", "0451227899", "HopJane45@yahoo.com", 21, "Good street", "Wayville", "SA", "5035", 1, "Diploma", new Date(), e1);
        Student s2 = new Student("Dave Fredora", "0450332114", "FreDavoo32@yahoo.com", 32, "Currie Street", "Adelaide CBD", "SA", "5000", 2, "Certificate", new Date(2011, 12, 22), e2);
        Student s3 = new Student("Carmel Ziar", "0451344489", "ZairCarmella@yahoo.com", 25, "leader street", "Adelaide CBD", "SA", "5000", 3, "Certificate", new Date(2017, 10, 22),e1 );
        Student s4 = new Student("Katty Phil", "0451644679", "KattyPhil@gmail.com", 25, "marion street", "Marion", "SA", "5043", 4, "Advance", new Date(2018, 10, 22), e3);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        
        System.out.println("\n--------------------COURSE COMPARATOR TESTING---------------------");
        System.out.println("Unsorted"); 
        for (Course c : courses) 
            System.out.println(c); 
  
        Collections.sort(courses, new CourseSortByName()); 
  
        System.out.println("\nSorted by Course Name"); 
        for (Course c : courses) 
            System.out.println(c); 
    
        System.out.println("\n--------------------ENROLLMENT COMPARATOR TESTING---------------------");
        // before Sorting arraylist: iterate using Iterator 
        Iterator<Enrollment> enrollIterator = enrollments.iterator(); 
  
        System.out.println("Before Sorting:\n"); 
        while (enrollIterator.hasNext()) { 
            System.out.println(enrollIterator.next()); 
        } 
  
        // sorting using Collections.sort(al, comparator); 
        Collections.sort(enrollments, new EnrollmentSortingComparator()); 
  
        // after Sorting arraylist: iterate using enhanced for-loop 
        System.out.println("\n\nAfter Sorting:\n"); 
        for (Enrollment e : enrollments) { 
            System.out.println(e); 
        } 
        
        System.out.println("\n--------------------STUDENT COMPARATOR TESTING---------------------");
        System.out.println("Unsorted"); 
        for (Student s : students) 
            System.out.println(s);
        
        Collections.sort(students, new StudentSortById()); 
  
        System.out.println("\nSorted by ID"); 
        for (Student s : students) 
            System.out.println(s);

    }
}