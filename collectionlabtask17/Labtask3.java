/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionlabtask17;

import java.util.ArrayList;


public class Labtask3 {
    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        colors.add("black");
        colors.add("lavender");
        colors.add("pink");
        colors.add("red");
        
        String str = "blue";
        colors.add(0, str);
        
           System.out.println("ArrayList after inserting at the first position:");
        for (String color : colors) {
            System.out.println(color);
    }
}
}