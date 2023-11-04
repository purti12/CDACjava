/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;


public class Testtemple {
    public static void main(String[] args) {
         for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 20; j++) {
                if((i == 1&& (j>4 && j<6))||(i==2 && (j>6&& j<8))||((i>=1 && i<5)&&(j>4&&j<6))
                        ||(i==5 && (j>3&&j<5 ))||(i==5&& (j>5&& j<7))||(i==6&&(j>=2 &&j<7))
                        ||(j==2 && (i>=6))||(i>=9 && j==3) ||(i==9 &&j==4)||(i==9&&j==5)||(i==7 && (j>8&&j<10))||(i==8&& (j>8&&j<10))
                        ||(i>=10&&(j==6)))
                      
                        
                        
                
                        
                        
                        
                        
                   
                
                {
                    System.out.print("* ");
                } 
                else {
                    System.out.print(" ");
                      }
            }
            System.out.println();
}
}
}
