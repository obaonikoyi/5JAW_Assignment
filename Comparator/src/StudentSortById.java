
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
public class StudentSortById implements Comparator<Student>{
    
    public int compare(Student s1, Student s2)
    {
        return s1.studentID - s2.studentID;
    } 
}
