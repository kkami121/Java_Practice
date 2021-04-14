package week2;
import java.util.Scanner;

public class LargerNumber{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 두 개 입력하시오: ");
		int i = input.nextInt();
		int j = input.nextInt();
		
		if( i > j){
			System.out.printf("더 큰 수는 %d입니다.%n", i);
		}
		
		else if( i < j){
			System.out.printf("더 큰 수는 %d입니다.%n", j);
		}
		
		else{
			System.out.printf("두 수는 같습니다.");
		}
			
		input.close();
	}
}