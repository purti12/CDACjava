/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

class Outer {
    private int outerField = 5;
    class MemberInner {
        void display() {
            System.out.println("Member Inner Class: outerField = " + outerField);
        }
    }
    void localInnerClassDemo() {
        int localVar = 25;

        class LocalInner {
            void display() {
                System.out.println("Local Inner Class: localVar = " + localVar);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    void anonymousInnerClassDemo() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class: Running a thread");
            }
        };
        runnable.run();
    }
}

public class Question7 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.MemberInner memberInner = outer.new MemberInner();
        memberInner.display();
        outer.localInnerClassDemo();
        outer.anonymousInnerClassDemo();
    }
}




