/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimedemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Ageapplication {
    public static void main(String[] args) {
      /*  System.out.println("enter your date of birth/month/year");
        Scanner sc=new Scanner(System.in);
        String dob=sc.next();
        String arr[]=dob.split("/");
        
        int d=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);
        int y=Integer.parseInt(arr[2]);
        
        LocalDate birthDate=LocalDate.of(y,m,d);*/
        LocalDate today=LocalDate.now();
    
        
        //Period p=Period.between(birthDate,today);
        
        //System.out.println("you are :"+p.getYears()+"years,"+p.getMonths()+"months,"+p.getDays()+"days");
        System.out.println(today.minusMonths(6)); 
        System.out.println(today.isAfter(LocalDate.of(2000, 10, 12)));
        System.out.println(today.isAfter(today));
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfWeek());
        
    }
}

