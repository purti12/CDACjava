
package exception;


public class Exceptiondemo1 {
int a=10;
int b=0;
int arr[]={1,2,378};
void display(){
System.out.println("Display");}
void Show(){
try{
System.out.println("C");
System.out.println(a/b);
arr[2]=12;}
catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
System.out.println(e.getMessage());}
//catch(ArrayIndexOutOfBoundsException e){
//System.err.println(e.getMessage());}
//catch(Exception e){
//System.err.println(e.getMessage());}
finally{
System.out.println("D");}}
public static void main(String[] args) {
System.out.println("A");
Exceptiondemo1 obj=new Exceptiondemo1();
System.out.println("B");
obj.Show();
System.out.println("E");
obj.display();}}
