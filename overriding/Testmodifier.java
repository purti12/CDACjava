/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;


class Animal {
    
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
    
   
    public void fetch() {
        System.out.println("Dog catches a ball");
    }
}

public class Testmodifier {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
         a.speak();
        d.speak();
       
        d.fetch();
    }
}


