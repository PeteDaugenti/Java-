interface Nameable{
	public abstract String getName();
	public void setName(String n);
}
abstract class Mammal{
	public void generateHeat() {
		System.out.println("Generating Heat");
	}
}
class Dog extends Mammal{
	Head head;
	String name;
	
	public void makeNoise() {
		System.out.println("Bark");
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}
class Head{
	double headSize;
}
public class Assignment10 {
	public static void main(String[] args) {
		System.out.println("This program was written by Pete Daugenti");
		
		Dog fido = new Dog();
		
		fido.generateHeat();
		fido.makeNoise();
		fido.setName("Fido");
		System.out.println("Name = " + fido.getName());
	}
}
