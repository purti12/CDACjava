/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package referotherobject;


public class Test2 {
 
    String objName;
    
    public Test2(String objName){
        this.objName = objName;
    }
    protected void finalize(){
        System.out.println(objName+" is destroy");
    }
    public static void main(String[] args){
        Test2 t1 = new Test2("t1");
        Test2 t2 = new Test2("t2");
        t1 = t2;
        System.gc();
    }
}

