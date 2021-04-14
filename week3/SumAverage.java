package week3;
import java.util.Scanner;

public class SumAverage{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 몇 개 더하시겠습니까? ");
		int n1 = input.nextInt();
		int sum = 0;

	
		System.out.print("정수를 차례로 입력하시오: ");
		for(int i = 0; i < n1; i++){
			int n2 = input.nextInt();
			sum = sum + n2;
			
		}
		double average = sum / (double)n1;
		System.out.println("정수의 합 = " + sum);
		System.out.printf("평균 = %.2f", average);
	
	}
}