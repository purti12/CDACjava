
package collection;

import java.util.HashMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrency {
    public static void main(String[] args) {
       ConcurrentHashMap<Integer,String>mp=new ConcurrentHashMap <>();
       //HashMap<Integer,String>mp=new HashMap<>();
        
        mp.put(101,"ram");
        mp.put(102,"sham");
        mp.put(103,"gyam");
        
        Runnable task=()->{
        for(int i=104;i<106;i++){
            mp.put(i, "value"+i);
        }
        };
        Thread th1=new Thread(task);
        Thread th2=new Thread(task);
        
        th1.start();
        th2.start();
        
//        try{
//            th1.join();
//            th2.join();
//        }
//        catch(Exception e){}
        
        System.out.println(mp);
    }
}
