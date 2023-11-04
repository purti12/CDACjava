/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datetimedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
    public static void main(String[] args) {
        String Sdate="12-10-2023";
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date dt=sdf.parse(Sdate);
            System.out.println(dt);
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
 
}
