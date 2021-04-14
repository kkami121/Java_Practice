package week3;
import java.util.Scanner;

public class Decrease2{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int count = 0;
		int remainder = 0;
		System.out.print("양의 정수를 하나 입력하시오: ");
		
		System.out.println("첫번째 방법 ");
		for(int i = n1; i >= 0; i--){
				System.out.print(i + "\t");
			
				remainder = ((n1 % 10) +1) % 10;
			if(i % 10 == remainder){
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		
		System.out.println("두번째 방법 ");
		for(int i = n1; i >= 0; i--){
				count++;
				System.out.print(i + "\t");
			if(count == 10){
				System.out.print("\n");
				count = 0;
			}
		}
	}
}