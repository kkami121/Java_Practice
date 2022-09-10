package week3;
import java.util.Scanner;

public class Multiples{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		
		System.out.print("어떤 수의 배수들을 출력할까요? ");
		for(int i = 1; i <= 100; i++){
			if(i % n1 == 0){
				System.out.print(i + " ");
			}
		}
	
	}
}