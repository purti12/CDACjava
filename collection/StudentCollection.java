/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.*;


public class StudentCollection {
    public static void main(String[] args) {
        
  //  Vector<Student>v=new Vector<>();
 PriorityQueue<Student> v=new PriorityQueue<>(new Studentsortingname());
    
    Student s1=new Student(102,"ramesh",23);
    Student s2=new Student(102,"bhavesh",28);
    Student s3=new Student(105,"mahesh",25);
    Student s4=new Student(103,"dinesh",21);
    
    v.add(s1);
    v.add(s2);
    v.add(s3);
    v.add(s4);
    
    //Collections.sort(v);
    //    System.out.println(v.get(2).getName()); //sorting by id
      
    
   // Studentsortingname ssn=new Studentsortingname();//sortingby name
   // Collections.sort(v, ssn);
   
               
      //  System.out.println("position"+pos);
    
    Iterator<Student>it=v.iterator();
    while(it.hasNext()){
        Student s=it.next();
            System.out.println("id:"+s.getId()+",name:"+s.getName()+"'age:"+s.getAge());
}
    
}
}
