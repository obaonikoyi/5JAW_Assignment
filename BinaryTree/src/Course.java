/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Obadiah
 */
/**
 * Course class
 */
public class Course implements Comparable<Course>{
    // properties of the class
    String courseCode;
    String courseName;
    double cost;

    /**
     * getter of course code
     * @return  returns course code as string
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * setter of course code
     * @param courseCode sets the course code
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * getter of course name
     * @return  returns course name as string
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * setter of course name
     * @param courseName sets the course name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * getter of cost of the course 
     * @return  returns course cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * setter of the cost
     * @param cost cost of the course
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    

    /**
     * No args constructor
     */
    public Course()
    {
        courseCode = "";
        courseName = "";
        cost = 0.0;
    }

    /**
     * All args constructor
     * @param _courseCode code for the course
     * @param _courseName name of the course
     * @param _cost cost of the course
     */
    public Course(String _courseCode, String _courseName, double _cost)
    {
        courseName = _courseName;
        courseCode = _courseCode;
        cost = _cost;
    }

    /**
     * override equals function
     * @param  obj object to be compared
     * @return returns true if both the objects are equal
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        if (obj == this)
            return true;
        Course c = (Course)obj;
        return (this.courseCode.equals( c.courseCode));
    }

    /**
     * Override function for hash code
     * @return hash code for course code
     */
    @Override
    public int hashCode()
    {
        return courseCode.hashCode();
    }


    /**
     * Override to string function
     * @return string form of object
     * 
     */
    @Override
    public String toString()
    {
        return "Course[ Code: "+ courseCode + ", Name: "+ courseName + "cost: "+ cost+ "]";
    }

    @Override
    public int compareTo(Course t) {
         double first = this.cost;
        double second = t.cost;
        if(first == second){
            return 0;
        }
        else if (first > second){
            return 1;
        }
        else return -1;
    }
    
    
    
    public static void SelectionSort(ArrayList courses){
        for(int count = 0; count < courses.size(); count++){
            Course min  = (Course)courses.get(count);
            int index = count;
            for(int num = count+1; num<courses.size(); num++){
                Course course = (Course)courses.get(num);
                if(course.compareTo(min) == -1){
                    min = course;
                    index = num;
                }
            }
            Course temp = (Course)courses.get(count);
            courses.set(count, min);
            courses.set(index, temp);
        }
    }
    
}

