/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;
class Node{
Node next;
  int data;
Node prev;
}
public class DoublyLinkedlistDemo {
    Node head;
    void addFirst(int val){
        Node newNode=new Node();
        newNode.data=val;
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    void addLast(int val){
        Node newNode=new Node();
        newNode.data=val;
        
    
    if(head==null){
        newNode.next=null;
        newNode.prev=null;
        head=newNode;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        temp=temp.next;
    }
    
}
    void delete(int val){
        if(head==null)
            return;
        Node temp=head;
        while(temp!=null && temp.data!=val){
            temp=temp.next;
        }
        if(temp==null)//no node 
            System.out.println("data not found");
        else if(temp==head){//for head
            head=head.next;
            head.prev=null;
        }
        else if(temp.next==null){//for last node
            temp.prev.next=null;
            
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
//    void printDll(){
//      
//        Node temp=head;
//        
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
    
    boolean search(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val)
                return true;
            temp=temp.next;
        }
        return false;
        
    }
    void printDll(){
        System.out.println("forward moment..");
        Node temp=head;
        Node last=null;
         while(temp!=null)
         {
         System.out.println(temp.data);
         if(temp.next==null)
         {
             last=temp;
         }
             temp=temp.next;
             
         }
    
             System.out.println("backward moment..");
             while(last!=null){
                 System.out.println(last.data);
                 last=last.prev;
             }
        }
        
    
    public static void main(String[] args) {
       DoublyLinkedlistDemo dld= new  DoublyLinkedlistDemo();
       dld.addFirst(100);//headis forwarding so result in reverse
       dld.addFirst(200);
       dld.addFirst(300);
       dld.addLast(400); //result insame order
       dld.addLast(500);
       dld.addLast(600);
       
       
       dld.delete(400);
        System.out.println(dld.search(600));
       dld.printDll();
       
    }
  
}
