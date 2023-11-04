//1. .Write a java program to Create a HashMap called populationMap,
//stores population data for several cities, retrieves and prints the population
//of a specific city, iterates through the map to print all city populations,
//removes a city from the map, and checks if a city exists in the map
package collectionLabtask19;

import java.util.HashMap;
import java.util.Map;


public class HashMapq1 {
    public static void main(String[] args) {
        Map<String,Integer>popmap=new HashMap<>();
        popmap.put("Bhandara",100000);
        popmap.put( "nagpur",2500000);
        popmap.put( "pune",5230000);
        popmap.put( "karanja",50000);
        
        System.out.println(popmap);
        
         for(String s:popmap.keySet()){
          Integer val=popmap.get(s);
            System.out.println("city:"+s+"population:"+val);
            
             System.out.println("********");
            int p=popmap.get("nagpur");
             System.out.println("nagpur population is"+p);
             
              System.out.println("********");
              boolean b=popmap.remove("pune",5230000);
             System.out.println("pune city removed or not : "+b);
             
           
             
             
             System.out.println("********");
             boolean bp=popmap.containsKey("pune");
        System.out.println("pune city exist or not :"+bp);
        
         System.out.println(popmap);
        
        
    }
    }
    
}

