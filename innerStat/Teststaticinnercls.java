/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerStat;


    class outer{
        int x=10;
        static class  Innerstatic{
            int y=20;
            void show(){
                outer o=new outer();
              System.out.println("I m from static inner class"+(o.x+y));
            }
            
        }
    }
public class Teststaticinnercls {
    public static void main(String[] args) {
        outer.Innerstatic obj=new outer.Innerstatic();
        obj.show();
    }
}
