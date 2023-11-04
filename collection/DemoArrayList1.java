
package collection;

import java.awt.BorderLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class DemoArrayList1 {
    public static void main(String[] args) {
        
    
   ArrayList<Integer> lst=new ArrayList<>();
   lst.add(23);
   lst.add(12);
   lst.add(22);
   lst.add(15);
        System.out.println(lst);
        
        Collections.sort(lst);  //for sorting
      //  int pos =Collections.binarySearch(lst,22);
               
      //  System.out.println("position"+pos);
      
    
      
     
      //boolean b=Collections.disjoint(lst,Arrays.asList(100,300,200));
      //System.out.println(b);  //forchecking values  are different or not
        
      
     // Collections.copy(lst,Arrays.asList(100,300,200)); //for replacing old values to newvalue
      
      List<String>lst1=Arrays.asList("purti","atishay","laveena","priya","parul");
     Collections.sort(lst1);
        System.out.println("*********");
     
//      for
//                (Integer i:lst)
//            System.out.println(i);
//        
   
for(String i:lst1)
System.out.println(i);
    }      
}
