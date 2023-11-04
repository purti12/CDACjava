/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;


public class StarTest {
    public static void main(String[] args) {
       
    
    for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if ((i == 0 && (j>3 && j<5))||(i==1 && (j>2&&j<4))||(i==1 && (j>4 && j<6))||(i==2 && (j>5))||(i==2 && (j<3))
                        ||(i==3 && (j>0 && j<2))||(i==4&& (j>1 &&j<3))||(i==5 && (j>0 && j<2))||(i==6 &&(j<=0 && j<1) )||(i==3 &&(j<8 && j>6))||(i==4 &&(j>5 && j<7))
                        ||(i==5 &&(j>0&& j<2))||(i==5 &&(j<8&& j>6))||(i==6 &&(j>7 && j>=8)) || (j>3&&j<5)&&i==5)
                {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                      }
            }
            System.out.println();
}
}
}