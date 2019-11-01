
package chapter4problem10pet;
import java.util.Scanner;

public class PetDemo {
    public static void main(String[] args) {
        Pet usersPet = new Pet("Jane Doe");
        System.out.println("My records on your pet are incomplete.");
        System.out.println("Here is what they currently say:");
        System.out.println(usersPet);
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the pet's name:");
        String name = keyboard.nextLine();
        System.out.println("Please enter the pet's age:");
        int age = keyboard.nextInt();
        System.out.println("Please enter the pet's weight:");
        double weight = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Please enter the pet's type (dog or cat): ");
        boolean isDog;
        String choice = keyboard.nextLine();
        if(choice.equalsIgnoreCase("Dog")){
            isDog = true;
        }
        else{
            isDog = false;
        }
        usersPet.set(name, age, weight, isDog);
        System.out.println("My records now say:");
        System.out.println(usersPet);
        System.out.printf("Dose of carprofen: %.4f", usersPet.carprofen());
        System.out.println();
        System.out.printf("Dose of aceprozamine: %.4f", usersPet.acepromazine());
    }
    
}
