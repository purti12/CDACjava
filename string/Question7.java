/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author hp
 */
public class Question7 {
    
    public static void main(String[] args) {
        String str1 = "Atishay Jain";
        String str2 = null;
        String str3 = "";

        checkAndPrint(str1);
        checkAndPrint(str2);
        checkAndPrint(str3);
    }

    public static void checkAndPrint(String str) {
        if (str == null) {
            System.out.println("The string is null.");
        } else if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is neither null nor empty: " + str);
        }
    }
}


