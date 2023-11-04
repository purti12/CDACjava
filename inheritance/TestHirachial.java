/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class Parent{
    int x = 100;
    void test(){
        System.out.println("x = "+x);
    }
}
class Child1 extends Parent{
    int a=10;
    void show(){
        System.out.println("a = "+a);
    }
}
class Child2 extends Parent{
    int b=20;
    void display(){
        System.out.println("b = "+b);
    }
}
class Child3 extends Parent{
    int b=20;
    void display(){
        System.out.println("b = "+b);
    }
}
public class TestHirachial {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
       c1.test();
       c1.show();
       c2.test();
       c2.display();
       c3.test();
       c3.display();
    }
}
