/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import java.text.SimpleDateFormat;
import static org.junit.Assert.*;

/**
 *
 * @author Obadiah
 */
public class CourseSortByNameTest {
    
    public CourseSortByNameTest() {
    }

    /**
     * Test of compare method, of class CourseSortByName.
     */
    
    @Test
    public void testCompare() {
        System.out.println("compare");
        Course D4SD = new Course("D4SD", "Diploma of Software Development", 999.00);
        Course C3PR = new Course("C3PR", "Certificate III IN Programing", 699.00);
        CourseSortByName instance = new CourseSortByName();
        int expResult = 0;
        int result;
        result = instance.compare(D4SD, C3PR);
        assertNotEquals(expResult, result);
    }
    
}
