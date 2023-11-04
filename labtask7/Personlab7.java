/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask7;


abstract class Personlab {
  
  
    public abstract void eat();
    public abstract void exercise();
}


class Athlete extends Personlab {
   
    @Override
    public void eat() {
        System.out.println("An athlete eats a balanced diet to stay fit.");
    }

   
    @Override
    public void exercise() {
        System.out.println("An athlete engages in rigorous training sessions.");
    }
}


class LazyPerson extends Personlab {
  
    @Override
    public void eat() {
        System.out.println("A lazy person may opt for convenient but unhealthy food choices.");
    }

    @Override
    public void exercise() {
        System.out.println("A lazy person tends to avoid regular exercise.");
    }
}


public class Personlab7 {
    public static void main(String[] args) {
   
        Athlete a = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        System.out.println("Athlete's Routine:");
        a.eat();
        a.exercise();

        System.out.println();

        System.out.println("Lazy Person's Routine:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}

