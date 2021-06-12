
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Course> courses = new ArrayList<Course>(); 
        List<Enrollment> enrollments = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<Student>(); 
        
        Course D4SD = new Course(100,"D4SD", "Diploma of Software Development", 999.00);
        Course C3PR = new Course(112,"C3PR", "Certificate III IN Programing", 699.00);
        Course AD5SD = new Course(222,"AD5SD", "Advance Diploma of Software Development", 1299.00);
        
        courses.add(D4SD);
        courses.add(C3PR);
        courses.add(AD5SD);
        
        Enrollment e1 = new Enrollment(new Date(), "2", "Awaited", D4SD);
        Enrollment e2 = new Enrollment(new Date(2012, 1, 15), "1", "Passed",C3PR);
        Enrollment e3 = new Enrollment( new Date(2018, 11, 25), "2", "Awaited", AD5SD);
        
        enrollments.add(e1);
        enrollments.add(e2);
        enrollments.add(e3);
       
        Student s1 = new Student(1009789, "Diploma", new Date(), e1, "Hopper Jane", "0451227899", "HopJane45@yahoo.com", 21, "Good street", "Wayville", "SA", "5035");
        Student s2 = new Student(2123456, "Certificate", new Date(2011, 12, 22), e2, "Dave Fredora", "0450332114", "FreDavoo32@yahoo.com", 32, "Currie Street", "Adelaide CBD", "SA", "5000");
        Student s3 = new Student(3098765, "Certificate", new Date(2017, 10, 22),e1, "Carmel Ziar", "0451344489", "ZairCarmella@yahoo.com", 25, "leader street", "Adelaide CBD", "SA", "5000");
        Student s4 = new Student(4123454, "Advance", new Date(2018, 10, 22), e3, "Katty Phil", "0451644679", "KattyPhil@gmail.com", 25, "marion street", "Marion", "SA", "5043");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

         //E. linked List     
        Node std1 = new Node(s1);
        Node std2 = new Node(s2);
        Node std3 = new Node(s3);
        Node std4 = new Node(s4);
        
        linkedList<Student> stdLinkedList = new linkedList<>();
        
        stdLinkedList.addFirst(std1);
        stdLinkedList.addLast(std2);
        stdLinkedList.addLast(std3); 
        stdLinkedList.addLast(std4);

        stdLinkedList.printList(stdLinkedList.getHead());
        System.out.println("Total items in list : " + stdLinkedList.getCount() );
        
        System.out.println("\nRemoving last item from Linked List " );
        
        System.out.println();
        stdLinkedList.removeLast();
        stdLinkedList.printList(stdLinkedList.getHead());
        System.out.println("Total item after remove : " + stdLinkedList.getCount() );
        
        //Double Linked List
        Node n1 = new Node(s1);
        Node n2 = new Node(s2);
        Node n3 = new Node(s3);
        Node n4 = new Node(s4);
        Node n5 = new Node(s4);       
   
        DoubleLinkedList<Student> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addFirst(n1);
        doubleLinkedList.addLast(n2);
        doubleLinkedList.addLast(n3); 
        doubleLinkedList.addLast(n4);
        
        System.out.println("\nDoulbe linked list");
        doubleLinkedList.printList(doubleLinkedList.getHead());

        System.out.println("\nAdding item to double linked list ");
        doubleLinkedList.addLast(n5);
        doubleLinkedList.printList(doubleLinkedList.getHead());
        System.out.println("Total items in list : " + doubleLinkedList.getCount() );
        
        System.out.println();
        
        System.out.println("Removing First in double linked list" );
        doubleLinkedList.removeFirst();
        System.out.println();
        doubleLinkedList.printList(doubleLinkedList.getHead());
        System.out.println("Total items in list : " + doubleLinkedList.getCount()      
        );
        
        System.out.println();
        
        System.out.println("Check student1 in LinkedList");
        System.out.println(doubleLinkedList.contains(s1)); 
        System.out.println("Check student3 in LinkedList");
        System.out.println(doubleLinkedList.contains(s2)); 

    }
}