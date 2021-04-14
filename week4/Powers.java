package week4;
import java.util.Scanner;
/*
원하는 0 이상의 정수 만큼 N의 제곱을 구하는 프로그램
@author 박귀열
*/
public class Powers{
	
	public static void main(String[] args){
		
		System.out.print("제곱을 원하는 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.printf("%d의 몇 제곱까지 구할까요? ", n);
		int n1 = input.nextInt();
		int i = 0;
		int result = 1;
		
		System.out.printf("%d의 %d제곱: %d \n",n, i, result);
		
		for(i = 1; i <= n1; i++){
			result = result *= n;
			System.out.printf("%d의 %d제곱: %d \n",n, i, result);
		}
	}
}