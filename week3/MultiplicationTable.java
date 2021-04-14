package week3;
import java.util.Scanner;

public class MultiplicationTable{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int row = 9;
		int column = 9;
		int count = 0;
		
		for(int i = 1; i <= row; i++){
			for(int j = 1; j<= column; j++){
				count++;
				System.out.printf("%dx%d=%d\t", i, j, i*j);
				
				if(count == column){
				System.out.printf("\n");
				count = 0;
				}
			}
		}
	}
}