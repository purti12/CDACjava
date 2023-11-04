/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class Livingthings{
    void eyes(){
            System.out.println("two  eyes");
}

            
    void  mouth(){
System.out.println("one mouth");
    }

    abstract void legs();
}    
class Human extends Livingthings{

    @Override
    void legs() {
        System.out.println("four legs");
    
}
}

class Animal extends Livingthings{
@Override
void legs(){
    System.out.println("four legs");
}
}



public class TestAbsreaction {
    public static void main(String[] args) {
        Livingthings lt;
        System.out.println("Property of Human");
        lt=new Human();
        lt.eyes();
        lt.mouth();
        lt.legs();
        System.out.println("******************************************");
        System.out.println("Property of Animal");
        lt=new Animal();
        lt.eyes();
        lt.mouth();
        lt.legs();
    }
}

    
