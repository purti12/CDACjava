/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionlabtask;


public class Employee implements Comparable<Employee>
        {
     private int id;
   private String name;
   
    public Employee (int id,String name){
       this.id=id;
       this.name=name;
}

    
    public String getName() {
        return name;
    }


   public int getId(){
       return id;
   }
   
   @Override   //for sorting by age
    public int compareTo(Employee o) {
        return this.id-o.id;
}
}
