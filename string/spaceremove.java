/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

public class spaceremove {
    public static void main(String[] args) {
        String input="soft polunomial in matte square nagpur"; 
        String result = input.replaceAll("\\s", "");
        
        System.out.println("Original String: " + input);
        System.out.println("String with spaces removed: " + result);
    }
}
