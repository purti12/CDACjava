/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
       PriorityQueue<String>q=new PriorityQueue<>();
        q.add("ramesh");
        q.add("dinesh");
        q.add("mahesh");
        q.add("bhavesh");
        q.add("suresh");
        
         System.out.println(q);
        
        String s=q.poll();
        System.out.println(s);//first in first out after sequence
           System.out.println(q);
           
           
         String s1=q.poll();
        System.out.println(s1);
           System.out.println(q);
        
         String s2=q.poll();
        System.out.println(s2);
        
         System.out.println(q);  //removing in sequence
        
         
          String s3=q.poll();
        System.out.println(s3);
           System.out.println(q);
       //Queue<String> q1=new ArrayDeque<>();
       
      /* q1.add("Abc");
      // q1.add("pqr");
       //q1.add("AAA");*/
      
      //for(String s:q){
        //  System.out.println("");
        
       
      }
      
      
       
        
    }

