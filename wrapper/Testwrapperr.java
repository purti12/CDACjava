/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper;


public class Testwrapperr {
    public static void main(String[] args) {
        int x=10;
        //Integer i=new Integer (x);//unboxing
       // int a=i.intValue();//boxing
       
       Integer i=x;//autoboxing
       int a=i;//autounboxing
        
        System.out.println("primitive x="+x);
          System.out.println("reference x="+i);
          
          
          //string to corresponding numeric value
          String age="25";
          int age1=Integer.parseInt(age);
       //  System.out.println(age1+5);
         
        
         
          
          
    }
  
}
