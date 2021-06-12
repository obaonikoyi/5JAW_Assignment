
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class Search {
    public static int linearSearchStudent(ArrayList<Student> students, int id) {
        for (int i=0; i<students.size(); i++) {
            int _studentId = students.get(i).studentId;
            if(_studentId == id) {
                return i;
            }
        }
        return -1;
    }
    
    
    public static int BinarySearchCourse(ArrayList<Course> courses, int i) {
        int min = 0;
        int max = courses.size();
        int mid;
        
        while(min <= max) {
            mid = (min+max)/2;
            if(courses.get(mid).courseId == i) {
                return mid;
            }
            if (courses.get(mid).courseId < i) {
                min = mid +1;
            } else {
                max = mid -1;
                
            }           
        }
        return -1;
    }
}