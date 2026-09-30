/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LoopsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Multiplication Table Generation.");
        System.out.println("2. Sum of Natural Numbers.");
        System.out.println("3. Factorial Calculation.");
        System.out.println("4. Even and Odd Number Generator.");
        System.out.println("5. Number Digit Reversal.");
        System.out.print("What problem would you like to tackle? #");
        int choice = input.nextInt();
        System.out.println();
        
        switch (choice) {
            case 1:
                System.out.println("1. Multiplication Table Generation.");
                System.out.print("Enter a number: ");
                int num1 = input.nextInt();
                int i1;
                for (i1 = 1; i1 <= 10; i1++) {
                    System.out.println(num1 + " x " + i1 + " = " + (num1 * i1));
                }
                break;
                
            case 2:
                System.out.println("2. Sum of Natural Numbers.");
                System.out.print("Enter a number: ");
                int num2 = input.nextInt();
                int i2 = 1;
                int sum = 0;
                if (num2 <= 0) {
                    System.out.println("Invalid value.");
                } else {
                    while (i2 <= num2) {
                        sum = sum + i2;
                        i2++;
                    }
                    System.out.println("Sum = " + sum);
                }
                break;
                
            case 3:
                System.out.println("3. Factorial Calculation.");
                System.out.print("Enter a number: ");
                int num3 = input.nextInt();
                int i3 = 1;
                int facto = 1;
                if (num3 < 0) {
                    System.out.println("Invalid value.");
                } else if (num3 > 12) {
                    System.out.println("Too large of a value for standard factorial calculation using integer data type.");
                } else {
                    do {
                        facto = facto * i3;
                        i3++;
                    } while (i3 <= num3);
                    System.out.println("Factorial = " + facto);
                }
                break;
                
            case 4:
                System.out.println("4. Even and Odd Number Generator.");
                System.out.print("Enter a number: ");
                int num4 = input.nextInt();
                if (num4 <= 0) {
                    System.out.println("Invalid value.");
                } else if (num4 == 1) {
                    System.out.println("Even numbers: N/A");
                    System.out.println("Odd numbers: 1");
                } else {
                    System.out.print("Even numbers: ");
                    for (int i4 = 2; i4 <= num4; i4 += 2) {
                        System.out.print(i4 + " ");
                    }
                    System.out.println();
                    System.out.print("Odd numbers: ");
                    for (int i4 = 1; i4 <= num4; i4 += 2) {
                        System.out.print(i4 + " ");
                    }
                    System.out.println();
                }
                break;
                
            case 5:
                System.out.println("5. Number Digit Reversal.");
                System.out.print("Enter a number: ");
                int num5 = input.nextInt();
                int i5 = 0;
                while (num5 != 0) {
                        int x = num5 % 10;
                        i5 = (i5 * 10) + x;
                        num5 /= 10;
                    }
                System.out.println("Reversed: " + i5);
                break;
                
            default:
                System.out.println("Invalid option.");
                break;
        }
        input.close();
    }
}