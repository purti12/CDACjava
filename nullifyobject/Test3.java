/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nullifyobject;

public class Test3 {
    protected void finalize(){
        System.out.println("Object destroied");
    }
    public static void main(String[] args) {
        Test3 t1 = new Test3();
        t1 = null;
        System.gc();
    }
}

