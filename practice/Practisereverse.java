/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Scanner;


public class Practisereverse {
    public static void main(String[] args) {
        int rev=0,n,num;
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter 4didgitnumber");
        n=Sc.nextInt();
        while(n!=0)
        {  num=n%10;
                rev=(rev*10)+num;
                n=n/10;
        }
  
    System.out.println("reverse of numer="+rev);
}
}
