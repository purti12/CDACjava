
package collection;

import java.util.HashSet;
import java.util.*;

public class Demohashset {
    public static void main(String[] args) {
      //  Set<Integer>st=new HashSet<>();
        Set<Integer>st=new LinkedHashSet<>();//for arrangingin  doesnot allow duplicate
       // Set<Integer>st=new TreeSet<>(); // for arraanging in ascendingordesc order
       
       
        st.add(10);
        st.add(20);
        st.add(50);
        st.add(30);
        st.add(10);
         
        //System.out.println(st);
      
for(Integer i:st)
{
    System.out.println(i);       
    }
 
}
}
