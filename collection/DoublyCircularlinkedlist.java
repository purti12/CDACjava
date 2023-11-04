/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

class Node{
    int data;
    Node prev;
    Node next;
}
public class DoublyCircularlinkedlist {
    Node head;
    void addFirst(int value){
      
        Node newNode = new Node();
        newNode.data=value;
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node();
        newNode.data=value;
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    public boolean search(int value) {
        if (head == null) {
            return false;
        }

        Node temp = head;
        do {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            if (temp.data == value) {
                if (value == head.data && head.next == head) {
                    head = null;
                } else if (value == head.data) {
                    head.prev.next = head.next;
                    head.next.prev = head.prev;
                    head = head.next;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println(value);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println(+ value );
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyCircularlinkedlist dcl = new DoublyCircularlinkedlist();
        dcl.addFirst(3);
        dcl.addFirst(2);
        dcl.addLast(4);
        dcl.addLast(5);
        System.out.println("Circular Doubly Linked List:");
        dcl.printList(); 
        System.out.println(dcl.search(4));
        System.out.println(dcl.search(6));
        dcl.delete(3); 
        dcl.printList(); 
    }
}
    
