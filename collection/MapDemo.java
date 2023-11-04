/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.*;


public class MapDemo {
    public static void main(String[] args) {
       // Map<Integer,String>mp=new HashMap<>();
        //Map<Integer,String>mp=new LinkedHashMap<>();
        Map<Integer,String>mp=new TreeMap<>();
        
        mp.put(102, "suresh");
        mp.put(103, "dinesh");
        mp.put(105, "ramesh");
        mp.put(101, "bhaesh");
        mp.put(104, "suresh");
        
      //  System.out.println(mp);
//      for(Integer i:mp.keySet()){
//            String val=mp.get(i);
//            System.out.println("key:"+i+"value:"+val+"ji");
//            
             for(String s:mp.values()){
                 System.out.println(s);
             }
        }
    }

 

