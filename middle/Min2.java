package middle;
import java.util.Random;
import java.util.Scanner;
public class Min2 {
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
		int total;

        fillMatrixRandom(table, max, generator);	// 난수를 채운다.
		System.out.println();
		printMatrix(table);    
		
		calculateRowSums(table, rowSum);
        calculateColSums(table, colSum);
        total = arraySum(rowSum);		  // 총합을 계산한다. rwoSum을 더해도 되고, colSum을 더해도 된다.	
		
		displayAll(table, rowSum, colSum, total);
        if(true){

        }
        else{
            
        }		// 전체 출력
	
    }

    public static void calculateRowSums(int[][] table, int[] rowSum) {
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				rowSum[i] += table[i][j];
			}
            
		}
	}
    public static void calculateColSums(int[][] table, int[] colSum) {
		for(int i = 0; i < table[0].length; i++){
			for(int j = 0; j < table.length; j++){
				colSum[i] += table[j][i];
			}
		}
	}

    public static int arraySum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}

    public static void printMatrix(int[][] array){
        for ( int row = 0; row < array.length; row++){ 
          for (int col = 0; col < array[row].length; col++){
            System.out .print (array[row][col] + " ");
          }
          System.out.println();
        }
        System.out.println();
        }

        public static void fillMatrixRandom(int[][] array, int max, Random generator){
            for ( int row = 0; row < array.length; row++){ 
              for (int col = 0; col < array[row].length; col++){
                  array[row][col] = generator.nextInt(max);
              }
            }
        }

        public static void displayAll(int[][] table, int[] rowSum, int[] colSum, int total) {
            int sum = 0;
            int rowsum = 0;
            int colsum = 0;
            for ( int row = 0; row < table.length; row++){ 
                for (int col = 0; col < table[row].length; col++){
                    System.out.print(table[row][col] + "\t");
                }
             System.out.println("\t" + rowSum[row]);
            }   
            System.out.println();
            for(int row = 0; row < table[0].length; row++){
                System.out.print(colSum[row] + "\t");
            }
            System.out.println("\t" + total);
        }
        


}
