/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

class Task
{
    int n1;
    int n2;
    Task()
    {
        n1=2; 
        n2=5;
        System.out.println(n1+","+n2);
    }
    Task (int a,int b)
             {
               n1=a;
               n2=b;
     
    }
}
public class Java {
     public static void main(String[] args) {
        Task t=new Task();
        Task t1=new Task(10,5);
         System.out.println("n1=" +t1.n1+"n2="+t1.n2);
//        System.out.println()
        
        
}}
