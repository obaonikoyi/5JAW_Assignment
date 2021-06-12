

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Obadiah
 */
public class linkedList<T> {
    Node<T> head;
    Node<T> tail;
    int count =0;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

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
        //Temporary save current head node
        Node<T> temp = head;
        //Point head node to new Node
        head = node;
        //insert the old list behind the new head
        head.next = temp;
        
        //increase number of item in list
        count++;
        
        if(count == 1) {
            tail = head;
        }
    }
    
    public void addLast(Node<T> node) {
        if (count == 0) {
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
        count++;
    }
    
    public void removeFirst() {
        if(count != 0) {    
            //Point the head node to next node, so the current head node will be remove out of list 
            head = head.next;
            count--;
            if(count == 0) {
                tail = null;
            }
        }
        
    }
    
    public boolean contains(T item) {
        Node<T> current = head;
        while(current!=null) {
            if(current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void removeLast() {
        if(count != 0){
            if(count ==1) {
                head = null;
                tail = null;
            } else {               
                Node<T> current = head;
                //Loop to find node before tail node
                while(current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count --;
        }
    }
    
    public static void printList(Node node) {
        while(node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
    
}
