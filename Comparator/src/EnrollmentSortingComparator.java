
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class EnrollmentSortingComparator implements Comparator<Enrollment>{
        
    
        public int compare(Enrollment e1, Enrollment e2) { 
  
            // for comparison 
            int SemeterCompare = e1.semester.compareTo(e2.semester); 
            int DateCompare = e1.dateEnrolled.compareTo(e2.dateEnrolled);
  
            // 2-level comparison using if-else block 
            if (SemeterCompare == 0) { 
                return ((DateCompare == 0) ? SemeterCompare : DateCompare); 
            } else { 
                return SemeterCompare; 
            } 
        } 
    
}
