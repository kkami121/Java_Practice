
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * 주어진 행렬(matrix)의 전치행렬(transpose)을 구한다.
 */

public class MatrixTranspose 
{

	public static void main(String[] args){
		
		int [][] a = new int[3][5];
		
		System.out.print("Seed: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);
		
		for (int row = 0; row < 3; row++){
			for (int col= 0; col < 5; col++){
				a[row][col] = random.nextInt(50);
			 }
		}
		
		printMatrix(a);
		printMatrix(transpose(a));
		
	}
	
	/**
	 * 주어진 정수 배열의 전치행렬을 구한다.
	 * @param matrixx 주어진 행렬.
	 * @return 전치행렬.
	 */
	public static int[][] transpose(int[][] matrix){
		int [][] b = new int[5][3];
		for(int row = 0; row < 5; row++){
			for(int col = 0; col < 3; col++){
				b[row][col] = matrix[col][row];
			}
		}
		return b;
	}
	
	public static void printMatrix(int[][] array){
		for ( int row = 0; row < array.length; row++){ 
			for (int col = 0; col < array[0].length; col++){
				System.out .print (array[row][col] + " ");
			}
		System.out.println();
		}
		System.out.println();
	}
}
