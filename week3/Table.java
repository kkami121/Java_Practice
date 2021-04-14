package week3;
import java.util.Scanner;

public class Table{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int row = input.nextInt();
		int column = input.nextInt();
		int count = 0;
		
		System.out.println("표를 인쇄합니다.");
		System.out.print("행을 몇 개 만들까요? ");
		System.out.print("열을 몇 개 만들까요? ");
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j< column; j++){
				count++;
				System.out.printf("(%d, %d)\t", i, j);
				
				if(count == column){
				System.out.printf("\n");
				count = 0;
				}
			}
		}
	}
}