/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstraction;


public interface StudentInter {
    int a=10; //constant
    void showName(String name);//public abstrctvoid shoeName()
    void showAge(int age);
   
    default void course(){
        
        System.out.println("default method)");
        System.out.println("private non static method"+exam());
    }
   static  void institute(){
       System.out.println("this ststic method of INTERFACE"+city());
   }
   private String exam(){
       return"CET";
   }
   private static String city(){
          return "NAGPUR";

   
   }
}
