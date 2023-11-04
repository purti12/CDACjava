/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iotest;

import static java.awt.PageAttributes.MediaType.D;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ReadAndCopyfile {
    void copyfile(){
        int i;
        try(FileInputStream fin=new FileInputStream("C:\\Users\\hp\\Desktop\\blogo.jpeg");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\hp\\Desktop\\pu\\pu.png")){
         do{
             i=fin.read();
             fout.write(i);}
         while(i!=-1);}
        catch(Exception e){
            System.out.println(e.getMessage());
             
         }       
        
    }
    public static void main(String[] args) {
        ReadAndCopyfile cf=new ReadAndCopyfile();
        cf.copyfile();
    }
}
