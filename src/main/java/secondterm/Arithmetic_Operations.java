package secondterm;

import java.util.Scanner;
public class Arithmetic_Operations {
public static void main (String[] args) { 
    
    // Basic arithmetic operations using java scanner
    Scanner input = new Scanner(System.in);

    // Arithmetic operator can be int, float, double, byte, and short data type 
    System.out.print("Enter a first value: ");
    int a1 = input.nextInt(); 
    System.out.print("Enter a second value: ");
    int a2 = input.nextInt();

    System.out.println();

    System.out.println("Addition: " + (a1+a2));
    System.out.println("Subtraction: " + (a1-a2));
    System.out.println("Multiplication: " + (a1*a2));
    System.out.println("Division: " + (a1/a2));
    System.out.println("Modulo: " + (a1%a2));

}
}
