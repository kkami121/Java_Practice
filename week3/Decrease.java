package week3;

import java.util.Scanner;

public class Decrease{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();

		System.out.print("양의 정수를 하나 입력하시오: ");
		
		for(int i = n1; i >= 0; i--){
			System.out.print(i + " ");
		}
	}
}