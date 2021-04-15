import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class testSelectionSort {
	private SelectionSort temp1 = new SelectionSort();
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
	public testSelectionSort() {
		
	}
	
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		if (Arrays.equals(temp1.basicSelectionSort(arr), Sortedarr)) {
			System.out.println("Array is correctly sorted. testPositive() method worked successfully");
		}
		else {
			System.out.println("Array is not sorted correctly. testPositive() method failed");
		}
	}
	
	public void testNegative() {
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		
		if (Arrays.equals(temp1.basicSelectionSort(arr), Sortedarr)) {
			System.out.println("Array is correctly sorted. testNegative() method worked successfully");
		}
		else {
			System.out.println("Array is not sorted correctly. testNegative() method failed");
		}
	}
	
	public void testMixed() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 0;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = 0;
		Sortedarr[3] = 7;
		Sortedarr[4] = 8;
		
		if (Arrays.equals(temp1.basicSelectionSort(arr), Sortedarr)) {
			System.out.println("Array is correctly sorted. testMixed() method worked successfully");
		}
		else {
			System.out.println("Array is not sorted correctly. testMixed() method failed");
		}
	}
	
	public void testDuplicates() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 8;
		arr[3] = -9;
		arr[4] = -5;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -9;
		Sortedarr[2] = -5;
		Sortedarr[3] = 8;
		Sortedarr[4] = 8;
		
		if (Arrays.equals(temp1.basicSelectionSort(arr), Sortedarr)) {
			System.out.println("Array is correctly sorted. testDupicates() method worked successfully");
		}
		else {
			System.out.println("Array is not sorted correctly. testDuplicates() method failed");
		}
	}
}