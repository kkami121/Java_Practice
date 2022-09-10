import java.util.Random;
import java.util.Scanner;

/**
 * 표의 가로 합과 세로 합을 구하는 프로그램
 * 
 * 우선 키보드로부터 2차원 데이터의 행 수와 열 수를 입력받는다.
 * 입력받은 행 수와 열 수의 2차원 배열을 구성한다.
 * 2차원 배열에 난수를 채운다.
 * (난수의 최대값이 얼마가 되게 할 것인지는 키보드로부터 입력받아 정함)
 * 가로 합, 세로 합을 위한 1차원 배열을 구성한다.
 * 가로 합, 세로 합을 구해 저장한다.
 * 2차원 배열과 가로 합, 세로 합 배열을 출력한다.  
 */

public class TablePlusArray {

	/**
	 * 2차원 배열 table의 가로 합을 구해 rowSum에 저장한다.
	 * table의 0번 행의 가로 합은 rowSum[0]에,
	 * table의 1번 행의 가로 합은 rowSum[1]에,
	 * ...
	 * table의 (rows-1)번 행의 가로 합은 rowSum[rows-1]에 저장한다.
	 * 
	 * @param table 2차원 배열
	 * @param rowSum 각 행의 가로 합을 저장할 배열
	 */
	public static void calculateRowSums(int[][] table, int[] rowSum) {
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				rowSum[i] += table[i][j];
			}
            
		}
	}
	
	
	/**
	 * 2차원 배열 table의 세로 합을 구해 colSum에 저장한다.
	 * table의 0번 열의 세로 합은 colSum[0]에,
	 * table의 1번 열의 세로 합은 colSum[1]에,
	 * ...
	 * table의 (cols-1)번 열의 세로 합은 colSum[cols-1]에 저장한다.
	 * 
	 * @param table 2차원 배열
	 * @param colSum 각 열의 세로 합을 저장할 배열
	 */
	public static void calculateColSums(int[][] table, int[] colSum) {
		for(int i = 0; i < table[0].length; i++){
			for(int j = 0; j < table.length; j++){
				colSum[i] += table[j][i];
			}
		}
	}

	/**
	 * 주어진 배열의 원소 합을 구한다.
	 * @param a 배열.
	 * @return a 배열 원소의 합.
	 */
	public static int arraySum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}
	
	
	/**
	 * 원래의 데이터가 들어 있는 2차원 배열, 가로 합 배열, 세로 합 배열, 총합을 
	 * 표 형태로 출력한다.
	 * @param table 원래의 데이터가 들어 있는 2차원 배열
	 * @param rowSum 가로 합 배열
	 * @param colSum 세로 합 배열
	 * @param total 총합
	 */
	public static void displayAll(int[][] table, int[] rowSum, int[] colSum, int total) {
    for ( int row = 0; row < table.length; row++){ 
        for (int col = 0; col < table[row].length; col++){
          System.out.print(table[row][col] + "\t");
				}
        System.out.println("|\t"+ rowSum[row]);
    }   
    System.out.println();
    for(int row = 0; row < table[0].length; row++){
      System.out.print(colSum[row] + "\t");
    }
    System.out.println("|\t" + total);
  }
	
	public static void fillMatrixRandom(int[][] array, int max, Random generator){
    for ( int row = 0; row < array.length; row++){ 
      for (int col = 0; col < array[row].length; col++){
          array[row][col] = generator.nextInt(max);
      }
    }
	}
	
	public static void printMatrix(int[][] array){
    for ( int row = 0; row < array.length; row++){ 
      for (int col = 0; col < array[row].length; col++){
        System.out .print (array[row][col] + "\t");
      }
    System.out.println();
    }
    System.out.println();
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Seed: ");
		long seed = input.nextLong();
		Random generator = new Random(seed);

		System.out.print("행 갯 수: ");
		int rows = input.nextInt();
		System.out.print("열 갯 수: ");
		int cols = input.nextInt();
		System.out.print("난수의 최대값: ");
		int max = input.nextInt();
		
		int[][] table = new int[rows][cols];			// 2차원 배열 구성
		int[] rowSum = new int[rows];					// 가로 합을 저장할 배열 구성
		int[] colSum = new int[cols];					// 세로 합을 저장할 배열 구성
		int total;										// 총합을 저장할 변수 선언
		
		fillMatrixRandom(table, max, generator);	// 난수를 채운다.
		System.out.println();
		printMatrix(table);
		
		calculateRowSums(table, rowSum);	// rowSum을 계산한다.
    calculateColSums(table, colSum);	// colSum을 계산한다.
		total = arraySum(rowSum);		  // 총합을 계산한다. rwoSum을 더해도 되고, colSum을 더해도 된다.	
		
		
		displayAll(table, rowSum, colSum, total);			// 전체 출력
		System.out.println();
		
		input.close();
	}
	
}