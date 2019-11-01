/*
* IT 2650 Java Programming, Summer 2019
* Instructor: Martin P Walsh
* Student Name: Pete Daugenti
* Homework Assignment: Chap 2, Problem 11
* Purpose of Assignment: To demonstrate the use of DecimalFormat in result of program.
*/
package chapter2problem11;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Chapter2Problem11 {
    
    public static void main(String[] args) {
        System.out.println("IT 2560 Java Programming");
        System.out.println("Student Name: Pete Daugenti");
        System.out.println("Homework Assignment: Chapter 2, Problem 11");
        System.out.println("_____________________");
        System.out.println("");
        
        Scanner keyboard = new Scanner(System.in);
        String exercise1, exercise2, exercise3;
        int score1, score2, score3;
        int total1, total2, total3;
        int totalScore;
        int totalPoints;
        double percentage;
        
        System.out.println("Name of exercise 1:");
        exercise1 = keyboard.nextLine();
        System.out.println("Score recieved for exercise 1:");
        score1 = keyboard.nextInt();
        System.out.println("Total points possible for exercise 1:");
        total1 = keyboard.nextInt();
        
        System.out.println("Name of exercise 2:");
        exercise2 = keyboard.next();
        System.out.println("Score recieved for exercise 2:");
        score2 = keyboard.nextInt();
        System.out.println("Total points possible for exercise 2:");
        total2 = keyboard.nextInt();
        
        System.out.println("Name of exercise 3:");
        exercise3 = keyboard.next();
        System.out.println("Score recieved for exercise 3:");
        score3 = keyboard.nextInt();
        System.out.println("Total points possible for exercise 3:");
        total3 = keyboard.nextInt();
        System.out.println();
        
        totalScore = score1 + score2 + score3;
        totalPoints = total1 + total2 + total3;
        percentage = (double)totalScore/totalPoints;
        
        System.out.printf("%-30s %-10s %-10s\n", "Exercise", "Score",
                "Total Possible");
        System.out.printf("%-30s %-10d %-10d\n", exercise1, score1, total1);
        System.out.printf("%-30s %-10d %-10d\n", exercise2, score2, total2);
        System.out.printf("%-30s %-10d %-10d\n", exercise3, score3, total3);
        System.out.println();
        
        DecimalFormat percentFormat = new DecimalFormat("0.00%");
        System.out.println("Your total is " + totalScore + " out of "
                + totalPoints + ", or " + percentFormat.format(percentage) + 
                " percent.");
        
        
    }
    
}
