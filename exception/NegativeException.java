/*Q2. Create a user-defined exception class NegativeValueException that extends
Exception. Write a Java program that takes an integer as input and throws a
NegativeValueException if the input is a negative number.*/

package exception;

import java.util.Scanner;


 class NegativeValueException  extends Exception {
    public NegativeValueException(String message) {
        super(message);
    
}
}
public class NegativeException {
    
    void check(){
    Scanner sc=new Scanner(System.in);
    
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n<0){
            try{
                throw new NegativeValueException("enter valid number");
            }
            catch (NegativeValueException ne){
                System.err.println(ne.getMessage());
            }
        }
}
      public static void main(String[] args) {
        NegativeException nv=new NegativeException ();
        nv.check();
    }
  
}

