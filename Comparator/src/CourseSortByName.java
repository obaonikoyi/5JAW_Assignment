
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
public class CourseSortByName implements Comparator<Course> {
    public int compare(Course c1, Course c2)
    {
        return c1.courseName.compareTo(c2.courseName);
    }
}
