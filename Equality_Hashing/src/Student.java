
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class Student extends Person{
    
//Properties
    String program;
    Date dateRegistered;
    Enrollment enrollment;

    public Student() {
    }

    public Student( String program, Date dateRegistered, Enrollment enrollment) {
        this.program = program;
        this.dateRegistered = dateRegistered;
        this.enrollment = enrollment;
    }

    public Student(String name, String tel, String email, int bldgNo, String street, String suburb, String state, String postcode, String _program, 
            Date _dateRegistered, Date _dateEnrolled, String _semester, String _grade, Course course){
            super(name, tel, email, bldgNo, street, suburb, state, postcode);
            program = _program;
            dateRegistered = _dateRegistered;
            enrollment = new Enrollment(_dateEnrolled, _semester, _grade, course);
        }

        public Student(String name, String tel, String email, int bldgNo, String street, String suburb, String state, String postcode, String _program, 
            Date _dateRegistered, Date _dateEnrolled, String _semester, String _grade, String _courseCode, String _courseName, double _cost){
            super(name, tel, email, bldgNo, street, suburb, state, postcode);
            program = _program;
            dateRegistered = _dateRegistered;
            enrollment = new Enrollment(_dateEnrolled, _semester, _grade, new Course( _courseCode, _courseName, _cost));
            
        }
    
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "StudentId=" + id + ", program=" + program + ", dateRegistered=" + dateRegistered + ", enrollment=" + enrollment + '}';
    }
}
