/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    public void Bite() {
        System.out.println("Dog bites");
    }
    
    public void demonstrateSub() {
      
        super.makeSound();
    }
}

public class TestSubclass{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.Bite();
        d.demonstrateSub();
    }
}

