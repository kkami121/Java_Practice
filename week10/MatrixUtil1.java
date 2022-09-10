import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
/*
사용자가 배열의 시드를 입력하고 
0 ~ 100 사이 정수 난수를 2차원 배열에 넣고
2차원 배열을 참조 변수로 받는 메소드를 구현하여 출력하는 프로그램
*/
public class MatrixUtil1{

	public static void main(String[] args){
		
		int [][] a = new int[3][5];
		int [][] b = new int[1][10];

		System.out.print("Seed: ");
		Scanner input = new Scanner(System.in);
		long seed = input.nextLong();
		Random random = new Random(seed);
		
		for (int row = 0; row < 3; row++){
			for (int col= 0; col < 5; col++){
				a[row][col] = random.nextInt(100);
			 }
		}
		
		for(int row = 0; row < 1; row++){
			for(int col = 0; col < 10; col++){
				b[row][col] = random.nextInt(100);
			}
		}
	
	printMatrix(a);
	printMatrix(b);
		
	}

	/* 주어진 이차원 배열의 원소를 차례로 출력한다.
	 * @param array 출력할 배열(을 가리키는 참조변수).
	 */
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