/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package islandofisolation;


public class Test5 {
 

    Test5 i;
    protected void finalize(){
        System.out.println("Object is destroyed");
    }
    public static void main(String[] args) {
        Test5 t1  = new Test5();
        Test5 t2  = new Test5();
        t1.i = t2;
        t2.i = t1;
        t1 = null;
        t2 = null;
        System.gc();
    }
    
}

