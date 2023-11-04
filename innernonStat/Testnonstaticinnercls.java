/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innernonStat;

class Outer{
    int x=100;
    class Inner{
        int y=30;
        
        void display(){
            System.out.println("Im not ststic inner class"+(x+y));
        }
    }
}
public class Testnonstaticinnercls {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner obj=o.new Inner();
        obj.display();
    }
}
