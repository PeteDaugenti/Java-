
public class BubbleSort {
	public int[] bubble_srt(int array[]) {
		int n = array.length;
		int k;
		for(int m = n; m>=0; m--) {
			for(int i = 0; i < n - 1; i++) {
				k = i + 1;
				if(array[i] > array[k]) {
					swapNumbers(i, k, array);
				}
			}
		}
		return (array);
	}
	private static void swapNumbers(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
