/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper;

/**
 *
 * @author hp
 */
public class Constantpooltest {
    public static void main(String[] args) {
        //for integer family -128 to 127
        Byte b1=Byte.valueOf("127");
       Byte b2=Byte.valueOf("127");
       // System.out.print(b1==b2);
       
       Short b3= Short.valueOf("156");
       Short b4= Short.valueOf("156");
       // System.out.println(b3==b4);
       
       Boolean b5=Boolean.valueOf(false);
       Boolean b6=Boolean.valueOf(false);
       // System.out.println(b5==b6);
       
       
       //range for character for constant pool'\u0000'to'\u007f'
        System.out.println("\u01A4\u01AF\u01A6\u01AC\u01CF");
        
        System.out.println("\u00C3\u0164\u012D\u015E\u0126\u0103\u0178");
        
       //Character b7=Character.valueOf('\U1F618');
      // Character b8=Character.valueOf('\U1F618');
       // System.out.println(b7==b8);
       
       
        
    }
}
