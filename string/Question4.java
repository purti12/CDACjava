/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author hp
 */
public class Question4 {

    public static void main(String[] args) {
        String original = "Atishay Jain";
        String reversed = reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}


