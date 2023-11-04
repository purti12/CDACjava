/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iotest.niotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
         try{
        Path path=Paths.get("C:\\Users\\hp\\Desktop\\pu\\pu.txt");
        List<String> lst=Files.readAllLines(path);
        for(String str:lst){
            System.out.println(str);
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
