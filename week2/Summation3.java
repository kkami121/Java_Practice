package week2;
import java.util.Scanner;

public class Summation3{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("1부터 얼마까지의 짝수를 더하시겠습니까? ");
		int number = input.nextInt();
		int i;
		int sum = 0;
		
		for(i = 0; i <= number; i+=2){
			sum = i + sum;
		}
		
		int sum2 = 0;
		
		for(i = 0; i <= number; i++){
			if(i % 2 == 0){
				sum2 = i + sum2;
			}
		}
		System.out.println("첫 방법: 1부터 " + number + "까지의 짝수의 합 = " + sum);
		System.out.println("두 번째 방법: 1부터 " + number + "까지의 짝수의 합 = " + sum2);
	}
}