/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Obadiah
 */
public class EnrollmentTest {
    Enrollment testEnrollment;
    public EnrollmentTest() {
        testEnrollment = new Enrollment();
    
    }

    /**
     * Test of getCourse method, of class Enrollment.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Enrollment testEnrollment = new Enrollment();
        Course expResult = null;
        Course result = testEnrollment.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Enrollment.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course course = new Course();
        Enrollment instance = new Enrollment();
        instance.setCourse(course);
    }

    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Enrollment instance = new Enrollment();
        boolean expResult = false;
        boolean result = testEnrollment.equals(instance);
        assertNotEquals(expResult, result);       
    }

    /**
     * Test of hashCode method, of class Enrollment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode"); 
        int expResult = 0;
        int result = testEnrollment.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Enrollment.
     */
    @Test
    public void testToString() {
        System.out.println("toString"); 
        String expResult = "";
        String result = testEnrollment.toString();
        assertNotEquals(expResult, result);
    }
}