/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package string;


//public class Commonstring {
    /*public static void main(String[] args) {
        String s1="myself purti sangwani.Iam an electrical engineer";
        String s2="myself parul mankar.Iam an cse engineer";
        int m=s1.compareTo(s2);
        System.out.println(m);*/
     
    
    
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

public class Commonstring {
    public static void main(String[] args) {
        String inputString = "My Name is Purti sangwani";
        String[] words = inputString.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        String sortedString = String.join(" ", words);

        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }
}
    
    
      
      
        
    
