/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;


public class Viva1 {

 
    public static void main(String[] args) {
    
    for (int i = 0; i < 30; i++) {
            for (int j = 0; j <9; j++) {
                if ((i==0&&j==4)||(i==1&&j==3)||(i==1&&j==5)||(i==2&&j==2)||(i==2&&j==6)||(i==3&&j==1)||(i==3&&j==7)||i==4||
                    (i==5&&j==3)||(i==5&&j==5)||(i==6&&j==3)||(i==6&&j==5)||
                    (i==7||(i==8&&j==0)||(i==8&&j==8)||(i==9&&j==0)||(i==9&&j==8)||i==10)||
                    (i==11&&j==3)||(i==11&&j==5)||(i==12&&j==3)||(i==12&&j==5)||
                    (i==13&&j==3)||(i==13&&j==5)||(i==14&&j==1)||(i==14&&j==7)||(i==15&&j==1)||(i==15&&j==7)||(i==16&&j==3)||(i==16&&j==5)||
                    (i==17&&j==3)||(i==17&&j==5)||(i==18&&j==3)||(i==18&&j==5)||
                    (i==19)||(i==23)||(i==20&&j==0)||(i==20&&j==8)||(i==21&&j==0)||(i==21&&j==8)||(i==22&&j==0)||(i==22&&j==8)||(i==23&&j==0)||(i==23&&j==8)){            
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                      }
            }
            System.out.println("");
}
}
}
}
