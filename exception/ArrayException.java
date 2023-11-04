/*Q1. Write a Java program that declares an array of integers and tries to access an
element at an index beyond the array’s length. Handle the
ArrayIndexOutOfBoundsException by providing a meaningful message.*/

package exception;


public class ArrayException {
    int arr2[]={2,6,8};
    int arr1[]={2,4,5};
    void show(){
        try{
        arr2[2]=10;
            System.out.println(arr2[2]);
        arr1[4]=12;
            System.out.println(arr1[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{}
    
}
    public static void main(String[] args) {
        ArrayException ae=new ArrayException();
        ae.show();
    }
   }
