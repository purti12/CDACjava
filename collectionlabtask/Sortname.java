/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionlabtask;

import java.util.*;


public class Sortname {
    public static void main(String[] args) {
        
    
     ArrayList<String> lst=new ArrayList<String>();
     lst.add("atishay");
   lst.add("purti");
   lst.add("laveena");
   lst.add("priya");
   lst.add("parul");
   
     Collections.sort(lst);
   int pp=Collections.binarySearch(lst,"purti");
        System.out.println("purti position at index :"+pp);
}
}