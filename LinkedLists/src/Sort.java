
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
public class Sort {
    public static void bubbleSort(ArrayList<Student> students) {
        Student std;
        for(int i = 0; i< students.size()-1; i++ ){
            for(int x = 0; x< students.size()-i-1; x++) {
                if(students.get(x).name.compareTo(students.get(x+1).name)>0) {
                     std = students.get(x);
                     students.set(x, students.get(x+1));
                     students.set(x+1, std);
                }
            }
        }
    }
    
    public static void selectionSort(ArrayList<Student> students) {
        for(int i = 0; i< students.size(); i++) {
            int pos = i;
            for(int j = i; j<students.size(); j++) {
                if(students.get(i).studentId < students.get(pos).studentId) {
                    pos = j;
                }
                
                Student min = students.get(pos);
                students.set(pos, students.get(i));
                students.set(i, min);
                
            }
        }
    }
 
    public static void insertionSort(ArrayList<Student> students) {
        for(int x = 1; x< students.size(); x++) {
            Student temp = students.get(x);
            int i = x;
            while((i>0)&&(students.get(i-1).studentId > temp.studentId)){
                students.set(i,students.get(i-1));
                i = i - 1;
            }
            students.set(i,temp);
        }
    }
}
