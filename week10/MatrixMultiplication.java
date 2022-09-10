
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * 행렬의 곱셈
 * 
 */
public class MatrixMultiplication {

	public static void main(String[] args) throws IOException{
		
		int [][] a = new int [3][5];
		int [][] b = new int [5][3];
		System.out.print("Seed: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);
		
		for (int row = 0; row < 3; row++){
			for (int col= 0; col < 5; col++){
				a[row][col] = random.nextInt(10);
			 }
		}
		for (int row = 0; row < 5; row++){
			for (int col= 0; col < 3; col++){
				b[row][col] = random.nextInt(10);
			 }
		}
		printMatrix(a);
		printMatrix(b);
		printMatrix(multiply(a, b));
		
	}
	
	/**
	 * 주어진 두 정수 행렬의 곱행렬을 구한다.
	 * 전제조건: 첫 행렬의 열 갯수와 두 번째 행렬의 행 갯수는 같아야 한다.
	 * @param a 첫 행렬.
	 * @param b 두 번째 행렬.
	 * @return
	 */
	public static int[][] multiply(int[][] a, int[][] b){
		
		int[][] answer = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b[0].length; j++){
				for (int n = 0; n < a[0].length; n++){
					answer[i][j] += (a[i][n] * b[n][j]);
				}
			}
		}
	return answer;
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
