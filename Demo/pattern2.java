/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    package Demo;
import java.util.Scanner;
public class pattern2 {
    void equilateralTriangle()
    { int i,j;
    Scanner Sc=new Scanner(System.in);
        for(i=1;i<=5;i++)//rows
		{
			for(j=1;j<=5;j++)
			{
                            if(i==1 || i==5|| j==1||j==5)
                            {System.out.print(" * ");
			     }
			else
			{
				System.out.print("   ");
                        }
                               
                }  
                         System.out.println();
    }  
    }
    
  public static void main(String arg[]){
      
      pattern2 obj=new pattern2();
      obj.equilateralTriangle();
  }
}

