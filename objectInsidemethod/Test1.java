/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectInsidemethod;


public class Test1{
    private static void display(){
        Test1 t2 = new Test1("t2 ");
    }
    String objName;
    public Test1(String objName){
    this.objName = objName;
    }
     static void show(){
        Test1 t1 = new Test1("t1 ");
        display();
    } 
     @Override
     protected void finalize(){
         System.out.println(this.objName+"is free from memory");
     }
     public static void main(String[] args) {
        show();
        System.gc();
        
    }
}
