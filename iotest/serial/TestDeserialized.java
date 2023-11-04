/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iotest.serial;

import java.io.*;
public class TestDeserialized {
    public static void main(String[] args) {
        try(FileInputStream fin=new FileInputStream("Stud.ser");
                ObjectInputStream ois=new ObjectInputStream(fin)){
            
       Student s=(Student)ois.readObject();
        System.out.println("NAME:"+s.name);
        System.out.println("age:"+s.age);
        System.out.println("password:"+s.password);
        
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
