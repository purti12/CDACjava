
package iotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class Readcharacter {
   void readcharacters()throws IOException{
       char c;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Provide sentence to read");
    do{
       c=(char)br.read();
        System.out.println(c);
       }       
          while(c!='q');
   }
    public static void main(String[] args) throws ioexception, IOException {
            Readcharacter rc=new   Readcharacter();
            rc.readcharacters();
    }
           
}
