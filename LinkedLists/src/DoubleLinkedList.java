

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class DoubleLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int count = 0;

    /**
     * 
     * @return first node of the list
     */
    public Node<T> getHead() {
        return head;
    }
    /**
     * 
     * @param head 
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }
    /**
     * 
     * @return last node of the list
     */
    public Node<T> getTail() {
        return tail;
    }
    /**
     * 
     * @param tail 
     */
    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
     
    public void addFirst(Node<T> node) {
        //Temporary save the head node
        Node<T> temp = head;
        //Point head node to new Node
        head = node;
        //Insert the old list behind the new head
        head.next = temp;
        
        if(count == 0) {
            //if the list is empty, both head and tail point to new node
            tail = head;
        } else {
            temp.previous = head;
        }
        count++;
    }
    
    public void addLast(Node<T> node) {
        if (count == 0) {
            head = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        count++;
    }
    
    public void removeFirst() {
        if(count != 0) {
            head = head.next;
            count--;
            if(count == 0) {
                tail = null;
            } else {
                head.previous = null;
            }
        }
        
    }
    
    public void removeLast() {
        if(count != 0){
            if(count ==1) {
                head = null;
                tail = null;
            } else {                
                tail.previous.next = null;
                tail = tail.previous;
            }
            count --;
        }
    }
    
    public boolean contains(T item) {
        Node<T> current = head;
        //Loop to check item is in list or not
        while(current != null) {
            if(current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public static void printList(Node node) {
        while(node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
