/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Obadiah
 */
public class CourseTest {
    Course c;
    public CourseTest() {
        c = new Course();
    }

 /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(c);
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of hashCode method, of class Course.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Course instance = new Course();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "";
        String result = c.toString();
        assertNotEquals(expResult, result);
        
    }
    
}
