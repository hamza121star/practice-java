import java.io.*;
import java.math.*;
import java.util.*;

public class ArrayTest{

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

		// The main code
		// Instantiate Array
		int[] arr = new int[n];

		// Insert in Array
		for (int i = 0; i < n; i++){
			arr[i] = testCase[i];
		}

		// Print sorted
		Arrays.sort(arr);

		////// OUTPUT //////
		System.out.print("Output: [");
		for (int i = 0; i < n; i++){
			if (i == n-1)
				System.out.print(arr[i]);	
			else	
				System.out.print(arr[i]+", ");
		}
		System.out.println("]");

	}
}