/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimedemo;

import java.util.Objects;
import java.util.*;

    class Student
    {
        private String name;
        private int age;
        
        public Student (String name,int age){
            this.name=name;
            this.age=age;
            
        }
         @Override
    public boolean equals(Object obj) 
    {
        Student stud=(Student)obj;
        return this.name.equals(stud.name) && this.age==stud.age;
    }

        @Override
        public String toString() {
             return "Name : "+name+"\nAge : "+age;
        }
    
    }
public class Equal_Hashcode_tostring {
    public static void main(String[] args) {
        Student st= new Student("Ramesh",22);
        Student st1= new Student("Ramesh",22);
        Student st2= new Student("Suresh",22);
        Student st3= new Student("Bhawesh",22);
        System.out.println(st);
        System.out.println(st.toString());
       System.out.println(st==st1);
        System.out.println(st.equals(st1));
        System.out.println(st.hashCode());  
        
        LinkedHashSet<Student>studs=new LinkedHashSet<>();
        studs.add(st);
        studs.add(st1);
        studs.add(st2);
        studs.add(st3);
        
    }
}
