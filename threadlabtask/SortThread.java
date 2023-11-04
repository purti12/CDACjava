//2.Write a Java program that sorts an array of integers using multiple threads
package threadlabtask;

import java.util.Arrays;
import java.util.*;
import java.util.Comparator;


public class SortThread extends Thread{
    public static void main(String[] args) {
        int [] arr={5,8,9,2,1,6};
        Thread st=new  Thread()
        {
            @Override
            public void run() 
            {
                Arrays.sort(arr);
                 System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(arr));
            }
           
        };
         Thread st2 = new  Thread()
        {
            @Override
            public void run() 
            {
                try{
                            sleep(100);
                            }catch(Exception e){}
               
               Arrays.sort(arr);
               for (int i = 0; i < arr.length; i++) {     
                for (int j = i+1; j < arr.length; j++) {     
                if(arr[i] < arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
                   }     
                }     
            }    
               System.out.println("Descending array: "+Arrays.toString(arr));
               }
            };
        st2.start();
        st2.start();
        }
}
        
 
