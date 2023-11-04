/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionlabtask17;

import java.util.ArrayList;
import java.util.Collections;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        
        System.out.println("Unsorted ArrayList:");
        System.out.println(numbers);

        
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}



