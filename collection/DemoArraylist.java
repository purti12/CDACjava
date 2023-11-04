
package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class DemoArraylist {
    public static void main(String[] args) {
        List lst=new ArrayList();
        
        lst.add('D');
        lst.add('A');
        lst.add('B');
        lst.add('D');
        
        List lst1=new ArrayList();
        List lst2=new ArrayList();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        
        lst.add(3, 'c');
        
        lst.addAll(0, lst1);
       
        lst.remove(0);
        
        System.out.println(lst.get(3));
        
        System.out.println(lst.contains('B'));
        System.out.println(lst);
        
        
        //WE CAN ENTER ANY TYPE OF DATA
        lst2.add(23);
        lst2.add(12.23);
        lst2.add("purti");
        lst2.add(new Date());
        System.out.println(lst2);
       
        
        //FOR PRINTINGIN DIFFERENT LINES
        for(Object o:lst2){
        System.out.println(o);
        }
        
        System.out.println("****************");
        Iterator itr=lst2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
