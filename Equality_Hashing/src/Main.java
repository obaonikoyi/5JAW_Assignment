
import java.util.Date;

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
        
        Course D4SD = new Course("D4SD", "Diploma of Software Development", 999.00);
        Course C3PR = new Course("C3PR", "Certificate III IN Programing", 699.00);
        Student s1 = new Student("Hopper Jane", "0451227899", "HopJane45@yahoo.com", 21, "Good street", "Wayville", "SA", "5035", "Diploma", new Date(),new Date(), "2", "Awaited", D4SD);
        Student s2 = new Student("Dave Fredora", "0450332114", "FreDavoo32@yahoo.com", 32, "Currie Street", "Adelaide CBD", "SA", "5000", "Certificate", new Date(2001, 12, 22), new Date(2002, 1, 15), "1", "Passed",C3PR);
        Student s3 = new Student("Carmel Ziar", "0451344489", "ZairCarmella@yahoo.com", 25, "leader street", "Adelaide CBD", "SA", "5000", "Certificate", new Date(2016, 10, 22), new Date(2018, 11, 25), "2", "Awaited", C3PR);
        
        System.out.println("\n--------------------STUDENT EQUALITY TESTING---------------------");
        System.out.println("Overload Equals operator s1 == s2: " + (s1.equals(s2)));
        System.out.println("Overload Equals operator s1 == s3: " + (s1.equals(s3)));

        System.out.println("\n--------------------ENROLLMENT EQUALITY TESTING-------------------");
        System.out.println("Overload Equals operator on Enrollment s1 == s3: " + (s1.getEnrollment().equals(s3.getEnrollment())));
        System.out.println("Overload Equals operator on Enrollment s2 == s3: " + (s2.getEnrollment().equals(s3.getEnrollment())));

        System.out.println("\n--------------------COURSE EQUALITY TESTING----------------------");
        System.out.println("Overload Equals operator on Course s1 == s3: " + (s1.getEnrollment().getCourse().equals(s3.getEnrollment().getCourse())));
        System.out.println("Overload Equals operator on Course s2 == s3: " + (s2.getEnrollment().getCourse().equals(s3.getEnrollment().getCourse())));
    }
}