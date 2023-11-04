
package collection;

import java.lang.reflect.Array;
import java.util.List;
import java.util.*;


public class DemoHash2 {
    public static void main(String[] args) {
       //doesnot allow duplicate value
        List<Integer> lst=Arrays.asList(10,20,20,10,40,40,50);
        Set<Integer>st=new HashSet<>();
        st.addAll(lst);
        System.out.println(lst);
        System.out.println(st);
        
        lst=new ArrayList<>();
        lst.addAll(st);
         System.out.println(lst);
        
    }
}
