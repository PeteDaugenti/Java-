/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4problem10pet;

public class Chapter4Problem10Pet {

    private String name;
    private int age;
    private double weight;
    private boolean isPet;
    
    @Override
    public String toString(){
        return ("Type: " + isPet + " Name: " + name + " Age: " + age + " years \nWeight: " 
                + weight + " pounds");
    }
    public Pet (String initialName, int initialAge, double initialWeight, boolean type){
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0 )){
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else {
            age = initialAge;
            weight = initialWeight;
        }
        isPet = type;
    }
    public void set (String newName, int newAge, double newWeight, boolean type){
        if ((newAge < 0) || (newWeight < 0)){
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else{
            age = newAge;
            weight = newWeight;
            isPet = type;
        }
    }
    public Pet(String initialName){
        name = initialName;
        age = 0;
        weight = 0;
    }
    public void setName(String newName){
        name = newName;
    }
    public Pet (int initialAge){
        name = "No name yet";
        weight = 0;
        if (initialAge < 0){
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else{
            age = initialAge;
        }
    }
    public void setAge(int newAge){
        if (newAge < 0){
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else{
            age = newAge;
        }
    }
    public Pet (double initialWeight){
        name = "No name yet";
        age = 0;
        if (initialWeight < 0){
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else{
            weight = initialWeight;
        }
    }
    public void setWeight(double newWeight){
        if (newWeight < 0){
            System.out.println("Error: Negative weight");
            System.exit(0);
        }
        else{
            weight = newWeight;
        }
    }
    public Pet(){
        name = "No name yet.";
        age = 0;
        weight = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double acepromazine(){
        if (isPet){
            return (weight/2.2) * (0.03/10);
        }
        else {
            return (weight/2.2) * (0.002/10);
        }
    }
    public double carprofen(){
        if (isPet){
            return (weight/2.2) * (0.5/12);
        }
        else{
            return(weight/2.2) * (0.25/12);
        }
    }
}



