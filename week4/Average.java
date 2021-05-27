package week4;
import java.util.Scanner;
/*
입력 받은 양수들의 평균을 구하는 프로그램
0 이하의 수를 입력 받을 경우 프로그램 종료
양수가 하나도 입력되지 않은 경우에 그에 맞는 출력 후 종료
@author 박귀열
*/
public class Average{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		boolean end = false;
		double n;
		double sum = 0;
		int count = 0;
		
		System.out.println("양수들의 평균을 구하는 프로그램입니다.");
		System.out.println("입력을 마치려면 0 이하의 수를 입력하시오.");
		System.out.print("\n");
		
		while(!end){
			System.out.print("숫자를 입력하시오: ");
			n = input.nextDouble();
			if(n > 0){
				sum = sum + n;
				count++;
				} else
					end = true;
		}
		if(count > 0){
			System.out.printf("평균 = %.2f", sum / count);
		}
		else{
			System.out.println("양수가 하나도 입력되지 않았습니다.");
		}	
	}
}