/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;
import java.util.Scanner;
public class Pattern1 {
    void equilateralTriangle()
    { int i,j;
    Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)//rows
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
                        }
                                System.out.println(" ");
                }                
    }  
    
  public static void main(String arg[]){
      
      Pattern1 obj=new Pattern1();
      obj.equilateralTriangle();
  }
}
