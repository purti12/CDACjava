
package exception;

import java.util.Scanner;


public class VoterValidity {
    void checkValidity() throws ExceptioDemoThrowKeyword_03{
    Scanner sc=new Scanner(System.in);
    
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>=18){
        System.out.println("you are eligible foe voting");}
    else{
    try{
        throw new ExceptioDemoThrowKeyword_03("you are not eligible" );
    }
        catch(ExceptionDemoThrowKeyword_03 ed){
      System.err.println(ed.getMessage());
    }
}
    }
}
