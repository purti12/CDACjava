/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;


public class TestJ {
    public static void main(String[] args) {
       
    
    for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 15; j++) {
                if ((i==1&& (j>0&&j<14))||((j>10&&j<12)&&(i>1&&i<11))||(i==11&&(j>0&&j<7)))
                {
                    System.out.print("J ");
                } 
                else {
                    System.out.print(" ");
                      }
            }
            System.out.println();
}
}
}
