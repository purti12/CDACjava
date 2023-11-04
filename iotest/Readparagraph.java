/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Readparagraph {
    void readpara()throws IoException, IOException{
        String str[]=new String[100];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Provide sentence to read lines");
         for(int i=0;i<=str.length;i++)
         {
             str[i]=br.readLine();
             if(str[i].equals("stop"))
                 break;
         }
         System.out.println("\n\nprovided paragraph is..");
  for (int i=0;i<str.length;i++){
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
    public static void main(String[] args) throws IoException, IOException {
        Readparagraph rg=new Readparagraph();
        rg.readpara();
    }
}
