/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionlabtask;

import java.util.Vector;
import java.util.*;

public class Employeecollection {
    public static void main(String[] args) {
        // Vector<Employee>v=new Vector<>();
        PriorityQueue<Employee>v=new PriorityQueue<>(new Employeesortingname());
  
   Employee e1=new Employee(102,"ramesh");
   Employee e2=new Employee(105,"mahesh");
   Employee e3=new Employee(103,"dinesh");
   Employee e4=new Employee(106,"suresh");
    
    
    v.add(e1);
    v.add(e2);
    v.add(e3);
    v.add(e4);
    
   // Collections.sort(v);
   
     

     Iterator<Employee>it=v.iterator();
    while(it.hasNext()){
     Employee s=it.next();
            System.out.println("id:"+s.getId()+",name:"+s.getName());
}
    }
}
