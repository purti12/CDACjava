/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;


public class Initia {
    public static void main(String[] args) {
        // Display the letter "P"
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 1 || j == 7 || (i == 1 && j < 6) || (i == 4 && j < 7) || (i < 4 && j == 6)) {
                    System.out.print("P");
                } else {
                    System.out.print(" ");
        }
            }
        }
    }
}
        


