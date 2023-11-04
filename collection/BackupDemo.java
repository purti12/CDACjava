
package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class BackupDemo {
    public static void main(String[] args) {
        List<Integer> originallst=new ArrayList<>();
        
        originallst.add(100);
        originallst.add(200);
        originallst.add(300);
        
        List<Integer>backuplst=originallst.subList(0, 2);//it wont print last value
        
        
        System.out.println(originallst);
        System.out.println(backuplst);
        backuplst.add(700);
        originallst.add(800);//it wont add in backuplist
        
        System.out.println(originallst);
        System.out.println(backuplst);
        
        backuplst.remove(0);
        System.out.println(originallst);
        System.out.println(backuplst);
    }
}
