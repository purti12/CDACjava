package Demo;
import java.util.Scanner;
public class Pattern3 {
    void equilateralTriangle()
    { int i,j;
    Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)//rows
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
                        }
                                System.out.println();
                }                
    }  
    
    
    void revequilateralTriangle()
    { int i,j;
        for(i=0;i<5;i++)//rows
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=4;j>i;j--)
			{
				System.out.print(" *");
                        }
                                System.out.println(" ");
                }                
    }  
    
  public static void main(String arg[]){
      
      Pattern3 obj=new Pattern3();
      obj.equilateralTriangle();
      obj.revequilateralTriangle();
  }
}
