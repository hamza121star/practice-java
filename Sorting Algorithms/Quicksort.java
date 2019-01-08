import java.io.*;
import java.math.*;
import java.util.*;

public class Quicksort{
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}

	static int[] quicksort(int[] arr){
		for (int i = 0; i < arr.length-1; i++){
			for (int j = i+1; j < arr.length-i-1; j++){
				swap(arr[i], arr[j]);
			}
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of test case: ");
		int n = Integer.parseInt(scan.nextLine());

		int[] testCase = new int[n];
		System.out.println("Enter test case: ");
		String[] line = scan.nextLine().split(" ");
		for (int i = 0; i < n; i++){
			testCase[i] = Integer.parseInt(line[i]);
		}

		System.out.print("Input: [");
		for (int i = 0; i < n; i++){
			if (i == n-1)
				System.out.print(testCase[i]);	
			else	
				System.out.print(testCase[i]+", ");
		}
		System.out.println("]");

		int[] sorted = new int[n];
		sorted = quicksort(sorted);

		////// OUTPUT //////
		System.out.print("Output: [");
		for (int i = 0; i < n; i++){
			if (i == n-1)
				System.out.print(sorted[i]);	
			else	
				System.out.print(sorted[i]+", ");
		}
		System.out.println("]");

	}
}