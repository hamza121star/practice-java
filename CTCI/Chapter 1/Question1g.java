import java.io.*;
import java.math.*;
import java.util.*;

public class Question1g {
	

	public static void rotateMatrix(int[][] matrix, int n){
		for(int i = 0; i < n-1; i++){
			for (int j = 0; j < n-1; j++){
				int temp1 = matrix[i][j];
				int temp2 = matrix[i+1][j];
				int temp3 = matrix[i+1][j+1];
				int temp4 = matrix
				matrix[i][j] = temp2;
				matrix[i+1][j] = temp3;
				matrix[i+1][j+1] = temp1;
				matrix[i][j+1] = temp1;


		}
	}
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}
	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = randomMatrix(10, 10, 0, 9);
		printMatrix(matrix);
		rotate(matrix, 10);
		System.out.println();
		printMatrix(matrix);
	}

}