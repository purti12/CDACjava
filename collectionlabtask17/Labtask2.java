/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionlabtask17;

import java.util.ArrayList;
import java.util.Iterator;


public class Labtask2 {
    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        colors.add("black");
        colors.add("lavender");
        colors.add("pink");
        colors.add("red");
        colors.add("blue");
      
           
        //Using a for-each loop
        /*System.out.println("Iterating using a for-each loop:");
        for (String color : colors) {
            System.out.println(color);*/
        
        //Using an Iterator
        System.out.println("\nIterating using an Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
