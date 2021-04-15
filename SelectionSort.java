public class SelectionSort {
	private int temp;
	
	public SelectionSort() {
		
	}
	
	public int[] basicSelectionSort(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] < x[min]) {
					min = j;
				}
			}
			temp = x[min];
			x[min] = x[i];
			x[i] = temp;
		}
		return x;
	}
}