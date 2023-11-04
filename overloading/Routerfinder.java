/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;
import java.util.Scanner;

public class Routerfinder {
    void route(String src,String via,String dest){
        System.out.println("moving from"+src+"to"+dest+"via"+via);
    }
    void route (String src,String dest){
        System.out.println("moving from"+src+"to"+dest);
    }
        void route (String dest){
            System.out.println("moving to"+dest);
        }
        public static void main(String ar[]){
            Routerfinder rf=new Routerfinder();
                System.out.println("1.for destination only");
                System.out.println("2.for source and destination ");
                System.out.println("3.for source,via and destination");
                Scanner sc=new Scanner (System.in);
                Scanner sc1=new Scanner (System.in);
                int choice =sc1.nextInt();
                switch(choice){
            case 1:{
             System.out.print("enter destination");
             String d=sc.nextLine();
             rf.route(d);
             break;}
             case 2:{
             System.out.print("enter source");
             String s=sc.nextLine();
             System.out.print("enter destination");
             String d=sc.nextLine();
             rf.route( s,d);
             break;}
             case 3:{
                 System.out.print("enter source");
                 String s=sc.nextLine();
                 System.out.print("enter via");
                 String v=sc.nextLine();
                 System.out.print("enter destination");
                 String d=sc.nextLine();
                 rf.route(s,v,d);
                 break;}
             default:{
                 System.out.println("we dnt serve at your location");
             }
        }
        }
             
}


