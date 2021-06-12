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
public class EnrollmentSortingComparatorTest {
    
    public EnrollmentSortingComparatorTest() {
    }

    /**
     * Test of compare method, of class EnrollmentSortingComparator.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Enrollment e1 = new Enrollment(new Date(), "2", "Awaited");
        Enrollment e2 = new Enrollment(new Date(2012, 1, 15), "1", "Passed");
        EnrollmentSortingComparator instance = new EnrollmentSortingComparator();
        int expResult = 0;
        int result;
        result = instance.compare(e1, e2);
        assertNotEquals(expResult, result);
    }
    
}
