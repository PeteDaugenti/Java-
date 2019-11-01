/*
* IT 2650 Java Programming, Summer 2019
* Instructor: Martin P Walsh
* Student Name: Pete Daugenti
* Homework Assignment: Chap 2, Problem 10
* Purpose of Assignment: To demonstrate the use of scanner class and formatting.
*/
package chapter2problem10;
import java.util.Scanner;

public class Chapter2Problem10 {
    public static double taxRate = 0.0625;
    public static void main(String[] args) {
        System.out.println("IT 2560 Java Programming");
        System.out.println("Student Name: Pete Daugenti");
        System.out.println("Homework Assignment: Chapter 2, Problem 10");
        System.out.println("_____________________");
        System.out.println("");
        
        Scanner keyboard = new Scanner(System.in);
        String item1, item2, item3;
        int quantity1, quantity2, quantity3;
        double price1, price2, price3;
        double total1, total2, total3;
        double subtotal;
        double total;
        double tax;
        
        
        System.out.println("Input name of item 1:");
        item1 = keyboard.nextLine();
        System.out.println("Input quantity of item 1:");
        quantity1 = keyboard.nextInt();
        System.out.println("Input price of item 1:");
        price1 = keyboard.nextDouble();
        
        System.out.println("Input name of item 2:");
        item2 = keyboard.next();
        System.out.println("Input quantity of item 2:");
        quantity2 = keyboard.nextInt();
        System.out.println("Input price of item 2:");
        price2 = keyboard.nextDouble();
        
        System.out.println("Input name of item 3:");
        item3 = keyboard.next();
        System.out.println("Input quantity of item 3:");
        quantity3 = keyboard.nextInt();
        System.out.println("Input price of item 3:");
        price3 = keyboard.nextDouble();
        System.out.println();
        
        total1 = quantity1 * price1;
        total2 = quantity2 * price2;
        total3 = quantity3 * price3;
        subtotal = total1 + total2 + total3;
        tax = taxRate * subtotal;
        total = tax + subtotal; 
        
        System.out.println("------------- Invoice -------------");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "Item","Quantity", "Price", "Total");
        System.out.printf("%-30s %-10d %-10.2f $%-10.2f\n", item1, quantity1, price1, total1);
        System.out.printf("%-30s %-10d %-10.2f $%-10.2f\n", item2, quantity2, price2, total2);
        System.out.printf("%-30s %-10d %-10.2f $%-10.2f\n", item3, quantity3, price3, total3);
        System.out.println();
        System.out.printf("%-52s $%-10.2f\n", "Subtotal", subtotal);
        System.out.printf("%-52s $%-10.2f\n", "6.25 % sales tax", tax);
        System.out.printf("%-52s $%-10.2f\n", "Total", total);
    }
    
}
