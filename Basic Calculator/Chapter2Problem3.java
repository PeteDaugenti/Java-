/*
* IT 2650 Java Programming, Summer 2019
* Instructor: Martin P Walsh
* Student Name: Pete Daugenti
* Homework Assignment: Chap 2, Problem 3
* Purpose of Assignment: To demonstrate the use of different operations with user imput.
*/
package chapter2problem3;
import java.util.Scanner;

public class Chapter2Problem3 {

    public static void main(String[] args) {
        System.out.println("IT 2560 Java Programming");
        System.out.println("Student Name: Pete Daugenti");
        System.out.println("Homework Assignment: Chapter 2, Problem 3");
        System.out.println("_____________________");
        System.out.println("");
        
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        int difference;
        int product;
        

        System.out.println("Enter first number to add:");
        number1 = keyboard.nextInt();
        System.out.println("Enter second number to add:");
        number2 = keyboard.nextInt();
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        System.out.println("Adding " + number1 + " + " + number2 + " equals " + sum);
        System.out.println("Subtracting " + number1 + " - " + number2 + " equals " + difference);
        System.out.println("Multiplying " + number1 + " * " + number2 + " equals " + product);
    }
    
}
