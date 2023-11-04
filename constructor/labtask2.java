
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
public class labtask2 {
    // Instance variables
    int firstNumber;
    int secondNumber;

    // Parameterized constructor with user input
    public labtask2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
    }

    int getFirstNumber() {
        return firstNumber;
    }

    int getSecondNumber() {
        return secondNumber;
    }
    
    public static void main(String[] args) {
        // Creating an instance of UserInputClass with user input
        labtask2 p = new labtask2();

        System.out.println("First Number: " + p.getFirstNumber());
        System.out.println("Second Number: "+p.getSecondNumber());
    }
}

