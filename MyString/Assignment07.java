
public class Assignment07 {
	public static void main(String[] args) {
		System.out.println("Greetings: this program was written"
				+ "by Pete Daugenti");
		String reverseStr;
		
		MyStringClass myStrObject = new MyStringClass();
		
		String str = myStrObject.getString();
		System.out.println("You entered this string: " +str);
		
		reverseStr = myStrObject.reverseString(str);
		
		System.out.println("The string reversed is: " +reverseStr);
	}
}
