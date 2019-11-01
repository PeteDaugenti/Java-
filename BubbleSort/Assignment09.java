
public class Assignment09 {
	public static void main(String[] args) {
		System.out.println("This program is written by Pete Daugenti");
		
		int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		
		BubbleSort sort = new BubbleSort();
		
		System.out.println("Initial Unsorted Array\n");
		printNumbers(input);
		
		int[] output = sort.bubble_srt(input);
		
		System.out.print("Final Sorted Array\n");
		printNumbers(output);
	}
	
	public static void printNumbers(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i]+ ",");
		}
		System.out.println("\n");
	}
}
