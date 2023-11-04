/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;


public class Student implements Comparable<Student>{
    
    private int id;
   private String name;
   private int age;
   
   public Student (int id,String name,int age){
       this.id=id;
       this.name=name;
       this.age=age;
   }

    @Override
    public String toString() {
        return "id:"+id+",name:"+name+"'age:"+age;
                
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
   public int getId(){
       return id;
   }

   /* @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }  */
   //for sorting by id


        @Override   //for sorting by age
    public int compareTo(Student o) {
        return this.age-o.age;
   
   

  
    }

  
    }
  
   

