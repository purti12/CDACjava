/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package string;

public class Sortstring {
    public static void main(String[] args) {
        String str="Cdac soft polynomial institute.only cdac centre in nagpur.the best cdac institute for pgdac";
        String str1="Cdac Soft polynomial institute.only cdac Centre in nagpur.the best Cdac institute for Pgdac";
        String str3="Cdac Soft polynomial institute has a branches in pune.the best Cdac institute for Pgdac is in pune";
         //System.out.println(x);//to search
         
         int y=str.indexOf("p", 11);
         System.out.println(y);
         
         int z=str.indexOf("best");
        // System.out.println(z);
         
       char a=str.charAt(10);
          //System.out.println(a);
      boolean j=str.contains("nagpur");
      //System.out.println(j);
      
      int k=str.lastIndexOf("p");
     // System.out.println(k);
      
      int l=str.length();
     // System.out.println(l);
     
     boolean e=str.isBlank();
   //  System.out.println(e);//check whether it is blank or not
     
     int m=str.compareTo(str1);
     //System.out.println(m);
     
     int n=str.compareToIgnoreCase(str1);
    // System.out.println(n); //iy will ignore capslock
     
     
     String s=str.trim();
    // System.out.println(s);
     
     StringBuffer sb=new StringBuffer(str1);
     sb.reverse();
       System.out.println(sb);
       
       
     
     
       
}
}
