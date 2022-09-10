package week2;
import java.util.Scanner;

public class Summation2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		int n1 = input.nextInt();
		System.out.print("1부터 얼마까지의 자연수를 더하시겠습니까? ");
		int sum = 0;
		int i;
		
		for(i = 1; i <= n1; i++){
			sum = sum + i;
		}
		System.out.printf("for 이용: 1부터 %d까지의 자연수의 합 = " + sum, n1);
		System.out.println();
		
		sum = 0;
		i = 1;
		
		while(i <= n1){
			sum = sum + i;
			i++;
		}
		
		System.out.printf("while 이용: 1부터 %d까지의 자연수의 합 = " + sum, n1);
		System.out.println();
	}
}