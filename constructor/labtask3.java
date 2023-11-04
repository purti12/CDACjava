/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;


public class labtask3 {
    
    int value;
    
    public labtask3(){
        value=0;
}
    
    public labtask3(int v){
        value=v;
    }
    
    int getValue(){
        return value;
    }
    
    public static void main(String[] args) {
        labtask3 p = new labtask3();
        System.out.println("Using Default Constructor: " + p.getValue());

        labtask3 p1 = new labtask3(42);
        System.out.println("Using Parameterized Constructor: " + p1.getValue());
    }
}



