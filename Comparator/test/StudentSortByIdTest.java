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
public class StudentSortByIdTest {
    
    public StudentSortByIdTest() {
    }

    /**
     * Test of compare method, of class StudentSortById.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Student s1 = new Student( 21, "Diploma", new Date());
        Student s2 = new Student( 20, "Advance Diploma", new Date());
        StudentSortById instance = new StudentSortById();
        int expResult = 0;
        int result;
        result = instance.compare(s1, s2);
        assertNotEquals(expResult, result);
    }
    
}
