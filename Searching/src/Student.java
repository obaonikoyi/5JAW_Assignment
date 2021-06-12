
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
    int studentId;
    String program;
    Date dateRegistered;
    Enrollment enrollment;

    public Student() {
    }

    public Student(int studentId, String program, Date dateRegistered, Enrollment enrollment) {
        this.studentId = studentId;
        this.program = program;
        this.dateRegistered = dateRegistered;
        this.enrollment = enrollment;
    }

    public Student(int studentId, String program, Date dateRegistered, Enrollment enrollment, String _name, String _telNum, String _email, int bldgNo, String street, String suburb, String state, String postcode) {
        super(_name, _telNum, _email, bldgNo, street, suburb, state, postcode);
        this.studentId = studentId;
        this.program = program;
        this.dateRegistered = dateRegistered;
        this.enrollment = enrollment;
    }



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
