/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annoynomousobject;


public class Test4 {
   

    protected void finalize(){
        System.out.println("Object is  destroyed");
    }
    public static void main(String[] args) {
        new Test4();
        System.gc();
    }
}

