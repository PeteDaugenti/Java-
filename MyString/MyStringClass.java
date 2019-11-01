import java.util.Scanner;
public class MyStringClass {
	public String reverseString(String myStr) {
		if(myStr == null || myStr.isEmpty()) {
			return myStr;
		}
		String reverse = "";
		for(int i = myStr.length() - 1; i >= 0; i--) {
			reverse = reverse + myStr.charAt(i);
		}
		return reverse.toString();
    }
	public String getString() {
		 // Get console String input
		 System.out.print("Enter a String: ");
		 Scanner in = new Scanner(System.in);
		 String str = in.nextLine();
		 return (str);
	}
}
