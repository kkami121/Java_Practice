package week3;
import java.util.Scanner;

public class Increase{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int count = 0;
		System.out.print("양의 정수를 하나 입력하시오: ");
		
		System.out.println("첫번째 방법 ");
		for(int i = 0; i <= n1; i++){
				System.out.print(i + "\t");
			if(i % 10 == 9){
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		
		System.out.println("두번째 방법 ");
		for(int i = 0; i <= n1; i++){
				count++;
				System.out.print(i + "\t");
			if(count == 10){
				System.out.print("\n");
				count = 0;
			}
		}
	}
}