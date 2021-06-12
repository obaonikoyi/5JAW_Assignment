/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Obadiah
 */
public class StudentTest {
    Student s;
    
    public StudentTest() {
        s = new Student();        
        //s = new Student("James", "04536789", "James@yahoo.com", 37, "leader street", "goodwood", "SA", "5034", "Diploma", new Date(),new Date(), "2", "Awaited", "D4SD", "Diploma of Software Development", 999.00);
    }

/**
     * Test of getEnrollment method, of class Student.
     */
    @Test
    public void testGetEnrollment() {
        System.out.println("getEnrollment");
        Student s1 = new Student();
        Enrollment expResult = s1.getEnrollment();
        Enrollment result = s.getEnrollment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEnrollment method, of class Student.
     */
    @Test
    public void testSetEnrollment() {
        System.out.println("setEnrollment");
        Enrollment enrollment = new Enrollment();
        
        s.setEnrollment(enrollment);
        assertEquals(enrollment, s.enrollment);
    }

    @Test
    public void testHashCode() {
        int expResult = 0;
        int result = s.hashCode();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Student student = new Student();
        boolean expResult = false;
        boolean result = student.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");      
        String expResult = "";
        String result = s.toString();
        assertNotEquals(expResult, result);
    }
    
}
