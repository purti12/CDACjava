/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author hp
 */
public class Viva {
    

    public static void main(String[] args) {
       
    
    for (int i = 1; i <= 25; i++) {
            for (int j = 0; j <= 20; j++) {
                if (i==1 &&(j>5&& j<7)||(i==2 &&(j>3&&j<5))||(i==3&&(j>2&&j<4))||(i==2&&(j>5&&j<7))||(i==3&&(j>7&&j<9))
                        ||(i==4&&(j>1&&j<3))||(i==4&&(j>6&&j<8))||(i==4 &&(j>2&&j<4))  ||(i==4&&(j>3&&j<5))||(i==4&&(j>4&&j<6))
                       ||(i==6&&(j>1&&j<8))||(i==7&&(j>1&&j<3))||(i==7&&(j>10&&j<12))||(i==8&&(j>1&&j<8))||
                       (i==10&&(j>5&&j<7)) ||(i==11&&(j>2&&j<4))||(i==11&&(j>7&&j<9))||(i==12&&(j>4&&j<6))
                        ||(i==15&&(j>2&&j<8))||((i>15&&i<18)&&(j>2&&j<4))||(((i>15&&i<18))&&(j>9&&j<11))||
                        (i==18&&(j>2&&j<8)))            
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

