package week4;
import java.util.Scanner;
/*
입력 받은 숫자만큼의 층을 이루는 삼각형을 만드는 프로그램
@author 박귀열
*/
public class Triangle{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램 프로그램입니다.");
		System.out.println("삼각형의 크기를 얼마로 할까요? 1 이상의 정수를 입력하세요. ");
		int n = input.nextInt();
	
		for(int i = 1; i <= n; i++){
			for(int j =1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
				
		}
	}
}