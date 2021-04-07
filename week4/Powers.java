package week4;
import java.util.Scanner;
/*
원하는 0 이상의 정수 만큼 2의 제곱을 구하는 프로그램
@author 박귀열
*/
public class Powers{
	
	public static void main(String[] args){
		
		System.out.print("2의 몇 제곱까지 구할까요? ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int i = 0;
		int result = 1;
		
		System.out.printf("2의 %d제곱: %d \n",i, result);
		
		for(i = 1; i <= n1; i++){
			result = result *= 2;
			System.out.printf("2의 %d제곱: %d \n",i, result);
		}
	}
}