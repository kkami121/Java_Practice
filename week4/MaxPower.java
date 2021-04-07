package week4;
import java.util.Scanner;
/*
입력 받는 수보다 작거나 같은 2의 거듭제곱 중 가장 큰 수를 구하는 프로그램
@author 박귀열
*/
public class MaxPower{
	
	public static void main(String[] args){
		
		System.out.print("자연수 하나를 입력하시오. ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		long result = 1;
		boolean end = false;
		
		while(n1 >= result){
			result = result *= 2;
		}	
		System.out.printf("%d보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수 = %d \n", n1, (result / 2));
	}
}