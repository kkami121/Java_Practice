package week3;
import java.util.Scanner;

public class SumAverage2{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		boolean end = false;
		int n;
		int sum = 0;
		int count = 0;
		
		while(!end){
			n = input.nextInt();
			if( n >= 0){
				sum = sum + n;
				count++;
				} else
						end = true;
		}
			System.out.println("평균을 구하는 프로그램");
			System.out.println("양의 정수를 여러 개 입력하시오.");
			System.out.println("입력을 마치려면 0 이하 정수를 입력하시오.");
			System.out.println("입력된 0 이상 정수 갯수 = " + count);
		
			if(count > 0){
				System.out.println("정수의 합 = " + sum);
				System.out.printf("평균 = %.2f", (double)sum / count);
			}
		
	}
}