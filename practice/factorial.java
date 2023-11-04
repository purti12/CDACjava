/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;


import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num,i,fact=1;
     
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter number");
        num=Sc.nextInt();
      
 
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
            
        }
        System.out.println("factorial="+fact);
    }
 
}
