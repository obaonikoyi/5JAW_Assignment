
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
public class Enrollment {
    Date dateEnrolled;
    String grade;
    String semester;
    Course course;
    
    public Enrollment() {
    }
    
    public Enrollment(Date dateEnrolled, String grade, String semester) {
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
    }
    public Enrollment(Date dateEnrolled, String grade, String semester, Course course) {
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
        this.course = course;
    }

    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public int hashCode() {
        int hash;
        hash = this.dateEnrolled.hashCode();
        hash = hash + this.semester.hashCode();
        hash = hash + this.course.hashCode();
        return hash;
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
        final Enrollment other = (Enrollment) obj;
        if (this.semester != other.semester) {
            return false;
        }
        if (this.dateEnrolled != other.dateEnrolled) {
            return false;
        }
        if (this.course != other.course) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester + ", course=" + course + '}';
    }
    
}
