package week3;
import java.util.Scanner;

public class EvenSum{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int lowerBound = input.nextInt();
		int upperBound = input.nextInt();
		int sum = 0;
		
		System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
		System.out.print("구간 중 가장 작은 수는? ");
		System.out.print("구간 중 가장 큰 수는? ");
		
		for(int i =lowerBound; i <= upperBound; i++){
			if(i % 2 == 0)
				sum = i + sum;
		}
		System.out.println("두 수 사이 짝수의 합 = " + sum);
		
		
		
	}
}